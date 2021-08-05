package typings.reactAuthKit

import typings.reactAuthKit.typesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthHeader extends StObject {
    
    def authHeader(): String | Null
    
    def authUser(): js.Object | Null
    
    def isAuthenticated(): Boolean
    
    def signIn(signInConfig: signInFunctionParams): Boolean
    
    def signOut(): Boolean
  }
  object AuthHeader {
    
    inline def apply(
      authHeader: () => String | Null,
      authUser: () => js.Object | Null,
      isAuthenticated: () => Boolean,
      signIn: signInFunctionParams => Boolean,
      signOut: () => Boolean
    ): AuthHeader = {
      val __obj = js.Dynamic.literal(authHeader = js.Any.fromFunction0(authHeader), authUser = js.Any.fromFunction0(authUser), isAuthenticated = js.Any.fromFunction0(isAuthenticated), signIn = js.Any.fromFunction1(signIn), signOut = js.Any.fromFunction0(signOut))
      __obj.asInstanceOf[AuthHeader]
    }
    
    extension [Self <: AuthHeader](x: Self) {
      
      inline def setAuthHeader(value: () => String | Null): Self = StObject.set(x, "authHeader", js.Any.fromFunction0(value))
      
      inline def setAuthUser(value: () => js.Object | Null): Self = StObject.set(x, "authUser", js.Any.fromFunction0(value))
      
      inline def setIsAuthenticated(value: () => Boolean): Self = StObject.set(x, "isAuthenticated", js.Any.fromFunction0(value))
      
      inline def setSignIn(value: signInFunctionParams => Boolean): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
      
      inline def setSignOut(value: () => Boolean): Self = StObject.set(x, "signOut", js.Any.fromFunction0(value))
    }
  }
}
