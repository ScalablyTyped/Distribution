package typings
package atPulumiAwsLib.sesEmailIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailIdentityArgs extends js.Object {
  /**
    * The email address to assign to SES
    */
  val email: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object EmailIdentityArgs {
  @scala.inline
  def apply(email: atPulumiPulumiLib.outputMod.Input[java.lang.String]): EmailIdentityArgs = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailIdentityArgs]
  }
}

