package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolUserPoolAddOns extends StObject {
  
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: Input[String]
}
object UserPoolUserPoolAddOns {
  
  inline def apply(advancedSecurityMode: Input[String]): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
  
  extension [Self <: UserPoolUserPoolAddOns](x: Self) {
    
    inline def setAdvancedSecurityMode(value: Input[String]): Self = StObject.set(x, "advancedSecurityMode", value.asInstanceOf[js.Any])
  }
}
