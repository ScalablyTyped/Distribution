package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolUsernameConfiguration extends StObject {
  
  /**
    * Specifies whether username case sensitivity will be applied for all users in the user pool through Cognito APIs.
    */
  var caseSensitive: Boolean = js.native
}
object UserPoolUsernameConfiguration {
  
  @scala.inline
  def apply(caseSensitive: Boolean): UserPoolUsernameConfiguration = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUsernameConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolUsernameConfigurationMutableBuilder[Self <: UserPoolUsernameConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
  }
}
