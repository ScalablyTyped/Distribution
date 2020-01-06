package typings.atPulumiAws.fmsAdminAccountMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminAccountState extends js.Object {
  /**
    * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. Defaults to the current account. Must be configured to perform drift detection.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
}

object AdminAccountState {
  @scala.inline
  def apply(accountId: Input[String] = null): AdminAccountState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminAccountState]
  }
}

