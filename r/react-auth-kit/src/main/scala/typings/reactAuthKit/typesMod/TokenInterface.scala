package typings.reactAuthKit.typesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenInterface extends js.Object {
  
  var authState: js.Object | Null = js.native
  
  var authToken: String | Null = js.native
  
  var authTokenType: String | Null = js.native
  
  var expireAt: Date | Null = js.native
}
object TokenInterface {
  
  @scala.inline
  def apply(): TokenInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenInterface]
  }
  
  @scala.inline
  implicit class TokenInterfaceOps[Self <: TokenInterface] (val x: Self) extends AnyVal {
    
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
    def setAuthStateNull: Self = this.set("authState", null)
    
    @scala.inline
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenNull: Self = this.set("authToken", null)
    
    @scala.inline
    def setAuthTokenType(value: String): Self = this.set("authTokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenTypeNull: Self = this.set("authTokenType", null)
    
    @scala.inline
    def setExpireAt(value: Date): Self = this.set("expireAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAtNull: Self = this.set("expireAt", null)
  }
}
