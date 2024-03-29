package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolUserPoolAddOns extends StObject {
  
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: String
}
object UserPoolUserPoolAddOns {
  
  inline def apply(advancedSecurityMode: String): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
  
  extension [Self <: UserPoolUserPoolAddOns](x: Self) {
    
    inline def setAdvancedSecurityMode(value: String): Self = StObject.set(x, "advancedSecurityMode", value.asInstanceOf[js.Any])
  }
}
