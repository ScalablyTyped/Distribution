package typings.pulumiAws.emailIdentityMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailIdentityState extends js.Object {
  /**
    * The ARN of the email identity.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The email address to assign to SES
    */
  val email: js.UndefOr[Input[String]] = js.native
}

object EmailIdentityState {
  @scala.inline
  def apply(arn: Input[String] = null, email: Input[String] = null): EmailIdentityState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIdentityState]
  }
}

