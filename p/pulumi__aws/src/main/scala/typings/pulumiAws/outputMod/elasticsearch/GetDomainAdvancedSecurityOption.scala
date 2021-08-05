package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainAdvancedSecurityOption extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  
  /**
    * Whether the internal user database is enabled.
    */
  var internalUserDatabaseEnabled: Boolean
}
object GetDomainAdvancedSecurityOption {
  
  inline def apply(enabled: Boolean, internalUserDatabaseEnabled: Boolean): GetDomainAdvancedSecurityOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], internalUserDatabaseEnabled = internalUserDatabaseEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAdvancedSecurityOption]
  }
  
  extension [Self <: GetDomainAdvancedSecurityOption](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
  }
}
