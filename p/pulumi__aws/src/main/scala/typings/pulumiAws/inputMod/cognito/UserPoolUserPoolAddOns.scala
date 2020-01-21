package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolUserPoolAddOns extends js.Object {
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: Input[String] = js.native
}

object UserPoolUserPoolAddOns {
  @scala.inline
  def apply(advancedSecurityMode: Input[String]): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
}

