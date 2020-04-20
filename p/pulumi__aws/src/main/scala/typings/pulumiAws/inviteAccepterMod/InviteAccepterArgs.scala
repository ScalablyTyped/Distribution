package typings.pulumiAws.inviteAccepterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccepterArgs extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: Input[String] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: Input[String] = js.native
}

object InviteAccepterArgs {
  @scala.inline
  def apply(detectorId: Input[String], masterAccountId: Input[String]): InviteAccepterArgs = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], masterAccountId = masterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccepterArgs]
  }
}

