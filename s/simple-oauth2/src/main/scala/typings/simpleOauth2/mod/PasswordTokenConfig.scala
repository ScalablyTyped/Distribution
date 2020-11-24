package typings.simpleOauth2.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordTokenConfig
  extends /**
  * Additional options will be automatically serialized as params for the token request.
  */
/* key */ StringDictionary[js.Any] {
  
  /** A string that represents the registered password. */
  var password: String = js.native
  
  /** A string or array of strings that represents the application privileges */
  var scope: String | js.Array[String] = js.native
  
  /** A string that represents the registered username */
  var username: String = js.native
}
object PasswordTokenConfig {
  
  @scala.inline
  def apply(password: String, scope: String | js.Array[String], username: String): PasswordTokenConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordTokenConfig]
  }
  
  @scala.inline
  implicit class PasswordTokenConfigOps[Self <: PasswordTokenConfig] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
