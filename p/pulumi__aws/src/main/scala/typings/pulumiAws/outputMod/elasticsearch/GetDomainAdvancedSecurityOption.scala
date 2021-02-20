package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainAdvancedSecurityOption extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether the internal user database is enabled.
    */
  var internalUserDatabaseEnabled: Boolean = js.native
}
object GetDomainAdvancedSecurityOption {
  
  @scala.inline
  def apply(enabled: Boolean, internalUserDatabaseEnabled: Boolean): GetDomainAdvancedSecurityOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], internalUserDatabaseEnabled = internalUserDatabaseEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAdvancedSecurityOption]
  }
  
  @scala.inline
  implicit class GetDomainAdvancedSecurityOptionMutableBuilder[Self <: GetDomainAdvancedSecurityOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
  }
}
