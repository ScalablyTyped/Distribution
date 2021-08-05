package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolAdminCreateUserConfig extends StObject {
  
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[UserPoolAdminCreateUserConfigInviteMessageTemplate] = js.undefined
}
object UserPoolAdminCreateUserConfig {
  
  inline def apply(): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
  
  extension [Self <: UserPoolAdminCreateUserConfig](x: Self) {
    
    inline def setAllowAdminCreateUserOnly(value: Boolean): Self = StObject.set(x, "allowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    
    inline def setAllowAdminCreateUserOnlyUndefined: Self = StObject.set(x, "allowAdminCreateUserOnly", js.undefined)
    
    inline def setInviteMessageTemplate(value: UserPoolAdminCreateUserConfigInviteMessageTemplate): Self = StObject.set(x, "inviteMessageTemplate", value.asInstanceOf[js.Any])
    
    inline def setInviteMessageTemplateUndefined: Self = StObject.set(x, "inviteMessageTemplate", js.undefined)
  }
}
