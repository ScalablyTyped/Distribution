package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAdvancedSecurityOptions extends StObject {
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
    */
  var internalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Credentials for the master user: username and password, or ARN
    */
  var masterUserOptions: js.UndefOr[DomainAdvancedSecurityOptionsMasterUserOptions] = js.native
}
object DomainAdvancedSecurityOptions {
  
  @scala.inline
  def apply(enabled: Boolean): DomainAdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAdvancedSecurityOptions]
  }
  
  @scala.inline
  implicit class DomainAdvancedSecurityOptionsMutableBuilder[Self <: DomainAdvancedSecurityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "internalUserDatabaseEnabled", js.undefined)
    
    @scala.inline
    def setMasterUserOptions(value: DomainAdvancedSecurityOptionsMasterUserOptions): Self = StObject.set(x, "masterUserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserOptionsUndefined: Self = StObject.set(x, "masterUserOptions", js.undefined)
  }
}
