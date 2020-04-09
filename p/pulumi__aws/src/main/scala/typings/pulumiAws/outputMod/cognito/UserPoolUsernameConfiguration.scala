package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolUsernameConfiguration extends js.Object {
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
}

