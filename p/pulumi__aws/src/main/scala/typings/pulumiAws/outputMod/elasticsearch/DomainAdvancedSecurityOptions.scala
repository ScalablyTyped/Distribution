package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAdvancedSecurityOptions extends js.Object {
  
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
  implicit class DomainAdvancedSecurityOptionsOps[Self <: DomainAdvancedSecurityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = this.set("internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalUserDatabaseEnabled: Self = this.set("internalUserDatabaseEnabled", js.undefined)
    
    @scala.inline
    def setMasterUserOptions(value: DomainAdvancedSecurityOptionsMasterUserOptions): Self = this.set("masterUserOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserOptions: Self = this.set("masterUserOptions", js.undefined)
  }
}
