package typings.reactAuthKit.typesMod

import typings.reactAuthKit.reactAuthKitStrings.Bearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait signInFunctionParams extends js.Object {
  
  var authState: js.Object = js.native
  
  var expiresIn: Double = js.native
  
  var token: String = js.native
  
  var tokenType: String | Bearer = js.native
}
object signInFunctionParams {
  
  @scala.inline
  def apply(authState: js.Object, expiresIn: Double, token: String, tokenType: String | Bearer): signInFunctionParams = {
    val __obj = js.Dynamic.literal(authState = authState.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[signInFunctionParams]
  }
  
  @scala.inline
  implicit class signInFunctionParamsOps[Self <: signInFunctionParams] (val x: Self) extends AnyVal {
    
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
    def setAuthState(value: js.Object): Self = this.set("authState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: String | Bearer): Self = this.set("tokenType", value.asInstanceOf[js.Any])
  }
}
