package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolAdminCreateUserConfig extends StObject {
  
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[UserPoolAdminCreateUserConfigInviteMessageTemplate] = js.native
}
object UserPoolAdminCreateUserConfig {
  
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
  
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigMutableBuilder[Self <: UserPoolAdminCreateUserConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAdminCreateUserOnly(value: Boolean): Self = StObject.set(x, "allowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdminCreateUserOnlyUndefined: Self = StObject.set(x, "allowAdminCreateUserOnly", js.undefined)
    
    @scala.inline
    def setInviteMessageTemplate(value: UserPoolAdminCreateUserConfigInviteMessageTemplate): Self = StObject.set(x, "inviteMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInviteMessageTemplateUndefined: Self = StObject.set(x, "inviteMessageTemplate", js.undefined)
  }
}
