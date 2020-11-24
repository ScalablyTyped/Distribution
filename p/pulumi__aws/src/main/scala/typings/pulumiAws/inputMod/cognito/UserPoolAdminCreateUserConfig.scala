package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolAdminCreateUserConfig extends js.Object {
  
  /**
    * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
    */
  var allowAdminCreateUserOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The invite message template structure.
    */
  var inviteMessageTemplate: js.UndefOr[Input[UserPoolAdminCreateUserConfigInviteMessageTemplate]] = js.native
}
object UserPoolAdminCreateUserConfig {
  
  @scala.inline
  def apply(): UserPoolAdminCreateUserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolAdminCreateUserConfig]
  }
  
  @scala.inline
  implicit class UserPoolAdminCreateUserConfigOps[Self <: UserPoolAdminCreateUserConfig] (val x: Self) extends AnyVal {
    
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
    def setAllowAdminCreateUserOnly(value: Input[Boolean]): Self = this.set("allowAdminCreateUserOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdminCreateUserOnly: Self = this.set("allowAdminCreateUserOnly", js.undefined)
    
    @scala.inline
    def setInviteMessageTemplate(value: Input[UserPoolAdminCreateUserConfigInviteMessageTemplate]): Self = this.set("inviteMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInviteMessageTemplate: Self = this.set("inviteMessageTemplate", js.undefined)
  }
}
