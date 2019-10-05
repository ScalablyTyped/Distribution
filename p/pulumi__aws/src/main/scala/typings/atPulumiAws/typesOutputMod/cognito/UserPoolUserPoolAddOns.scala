package typings.atPulumiAws.typesOutputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolUserPoolAddOns extends js.Object {
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: String
}

object UserPoolUserPoolAddOns {
  @scala.inline
  def apply(advancedSecurityMode: String): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode)
  
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
}

