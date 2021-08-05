package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainAdvancedSecurityOptions extends StObject {
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean
  
  /**
    * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
    */
  var internalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Credentials for the master user: username and password, or ARN
    */
  var masterUserOptions: js.UndefOr[DomainAdvancedSecurityOptionsMasterUserOptions] = js.undefined
}
object DomainAdvancedSecurityOptions {
  
  inline def apply(enabled: Boolean): DomainAdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAdvancedSecurityOptions]
  }
  
  extension [Self <: DomainAdvancedSecurityOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "internalUserDatabaseEnabled", js.undefined)
    
    inline def setMasterUserOptions(value: DomainAdvancedSecurityOptionsMasterUserOptions): Self = StObject.set(x, "masterUserOptions", value.asInstanceOf[js.Any])
    
    inline def setMasterUserOptionsUndefined: Self = StObject.set(x, "masterUserOptions", js.undefined)
  }
}
