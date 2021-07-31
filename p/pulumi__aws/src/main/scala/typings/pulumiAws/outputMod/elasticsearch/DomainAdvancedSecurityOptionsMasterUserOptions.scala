package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainAdvancedSecurityOptionsMasterUserOptions extends StObject {
  
  /**
    * ARN for the master user. Only specify if `internalUserDatabaseEnabled` is not set or set to `false`)
    */
  var masterUserArn: js.UndefOr[String] = js.undefined
  
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
    */
  var masterUserName: js.UndefOr[String] = js.undefined
  
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
    */
  var masterUserPassword: js.UndefOr[String] = js.undefined
}
object DomainAdvancedSecurityOptionsMasterUserOptions {
  
  @scala.inline
  def apply(): DomainAdvancedSecurityOptionsMasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainAdvancedSecurityOptionsMasterUserOptions]
  }
  
  @scala.inline
  implicit class DomainAdvancedSecurityOptionsMasterUserOptionsMutableBuilder[Self <: DomainAdvancedSecurityOptionsMasterUserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasterUserArn(value: String): Self = StObject.set(x, "masterUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserArnUndefined: Self = StObject.set(x, "masterUserArn", js.undefined)
    
    @scala.inline
    def setMasterUserName(value: String): Self = StObject.set(x, "masterUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserNameUndefined: Self = StObject.set(x, "masterUserName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: String): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
  }
}
