package typings.reactAuthKit.anon

import typings.reactAuthKit.typesMod.signInFunctionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthHeader extends js.Object {
  
  def authHeader(): String | Null = js.native
  
  def authUser(): js.Object | Null = js.native
  
  def isAuthenticated(): Boolean = js.native
  
  def signIn(signInConfig: signInFunctionParams): Boolean = js.native
  
  def signOut(): Boolean = js.native
}
object AuthHeader {
  
  @scala.inline
  def apply(
    authHeader: () => String | Null,
    authUser: () => js.Object | Null,
    isAuthenticated: () => Boolean,
    signIn: signInFunctionParams => Boolean,
    signOut: () => Boolean
  ): AuthHeader = {
    val __obj = js.Dynamic.literal(authHeader = js.Any.fromFunction0(authHeader), authUser = js.Any.fromFunction0(authUser), isAuthenticated = js.Any.fromFunction0(isAuthenticated), signIn = js.Any.fromFunction1(signIn), signOut = js.Any.fromFunction0(signOut))
    __obj.asInstanceOf[AuthHeader]
  }
  
  @scala.inline
  implicit class AuthHeaderOps[Self <: AuthHeader] (val x: Self) extends AnyVal {
    
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
    def setAuthHeader(value: () => String | Null): Self = this.set("authHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAuthUser(value: () => js.Object | Null): Self = this.set("authUser", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAuthenticated(value: () => Boolean): Self = this.set("isAuthenticated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignIn(value: signInFunctionParams => Boolean): Self = this.set("signIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignOut(value: () => Boolean): Self = this.set("signOut", js.Any.fromFunction0(value))
  }
}
