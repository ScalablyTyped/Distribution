package typings.atPulumiAws.sesEmailIdentityMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailIdentityArgs extends js.Object {
  /**
    * The email address to assign to SES
    */
  val email: Input[String] = js.native
}

object EmailIdentityArgs {
  @scala.inline
  def apply(email: Input[String]): EmailIdentityArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailIdentityArgs]
  }
}

