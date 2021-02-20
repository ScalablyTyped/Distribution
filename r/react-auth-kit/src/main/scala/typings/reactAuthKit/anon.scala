package typings.reactAuthKit

import typings.reactAuthKit.typesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AuthHeader extends StObject {
    
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
    implicit class AuthHeaderMutableBuilder[Self <: AuthHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthHeader(value: () => String | Null): Self = StObject.set(x, "authHeader", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAuthUser(value: () => js.Object | Null): Self = StObject.set(x, "authUser", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAuthenticated(value: () => Boolean): Self = StObject.set(x, "isAuthenticated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSignIn(value: signInFunctionParams => Boolean): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignOut(value: () => Boolean): Self = StObject.set(x, "signOut", js.Any.fromFunction0(value))
    }
  }
}
