package typings.atPulumiAws.typesInputMod.cognitoNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolUserPoolAddOns extends js.Object {
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: Input[String]
}

object UserPoolUserPoolAddOns {
  @scala.inline
  def apply(advancedSecurityMode: Input[String]): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
}

