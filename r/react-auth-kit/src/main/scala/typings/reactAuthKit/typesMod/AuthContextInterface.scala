package typings.reactAuthKit.typesMod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthContextInterface extends js.Object {
  
  var authState: TokenInterface = js.native
  
  var setAuthState: Dispatch[SetStateAction[TokenInterface]] = js.native
}
object AuthContextInterface {
  
  @scala.inline
  def apply(authState: TokenInterface, setAuthState: SetStateAction[TokenInterface] => Unit): AuthContextInterface = {
    val __obj = js.Dynamic.literal(authState = authState.asInstanceOf[js.Any], setAuthState = js.Any.fromFunction1(setAuthState))
    __obj.asInstanceOf[AuthContextInterface]
  }
  
  @scala.inline
  implicit class AuthContextInterfaceOps[Self <: AuthContextInterface] (val x: Self) extends AnyVal {
    
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
    def setAuthState(value: TokenInterface): Self = this.set("authState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAuthState(value: SetStateAction[TokenInterface] => Unit): Self = this.set("setAuthState", js.Any.fromFunction1(value))
  }
}
