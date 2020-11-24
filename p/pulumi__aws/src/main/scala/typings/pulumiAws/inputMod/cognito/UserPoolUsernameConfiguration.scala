package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolUsernameConfiguration extends js.Object {
  
  /**
    * Specifies whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
    */
  var caseSensitive: Input[Boolean] = js.native
}
object UserPoolUsernameConfiguration {
  
  @scala.inline
  def apply(caseSensitive: Input[Boolean]): UserPoolUsernameConfiguration = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUsernameConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolUsernameConfigurationOps[Self <: UserPoolUsernameConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Input[Boolean]): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
  }
}
