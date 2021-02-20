package typings.reactAuthKit

import typings.react.mod.Dispatch
import typings.react.mod.ReactChildren
import typings.react.mod.SetStateAction
import typings.reactAuthKit.reactAuthKitStrings.Bearer
import typings.reactAuthKit.reactAuthKitStrings.cookie
import typings.reactAuthKit.reactAuthKitStrings.localstorage
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait AuthContextInterface extends StObject {
    
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
    implicit class AuthContextInterfaceMutableBuilder[Self <: AuthContextInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthState(value: TokenInterface): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAuthState(value: SetStateAction[TokenInterface] => Unit): Self = StObject.set(x, "setAuthState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AuthProviderProps extends TokenObjectParamsInterface {
    
    var children: ReactChildren = js.native
  }
  object AuthProviderProps {
    
    @scala.inline
    def apply(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      authTimeStorageName: String,
      children: ReactChildren,
      stateStorageName: String
    ): AuthProviderProps = {
      val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthProviderProps]
    }
    
    @scala.inline
    implicit class AuthProviderPropsMutableBuilder[Self <: AuthProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TokenInterface extends StObject {
    
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
    implicit class TokenInterfaceMutableBuilder[Self <: TokenInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStateNull: Self = StObject.set(x, "authState", null)
      
      @scala.inline
      def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
      
      @scala.inline
      def setAuthTokenType(value: String): Self = StObject.set(x, "authTokenType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenTypeNull: Self = StObject.set(x, "authTokenType", null)
      
      @scala.inline
      def setExpireAt(value: Date): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireAtNull: Self = StObject.set(x, "expireAt", null)
    }
  }
  
  @js.native
  trait TokenObjectParamsInterface extends StObject {
    
    var authStorageName: String = js.native
    
    var authStorageType: cookie | localstorage = js.native
    
    var authTimeStorageName: String = js.native
    
    var cookieDomain: js.UndefOr[String] = js.native
    
    var cookieSecure: js.UndefOr[Boolean] = js.native
    
    var stateStorageName: String = js.native
  }
  object TokenObjectParamsInterface {
    
    @scala.inline
    def apply(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      authTimeStorageName: String,
      stateStorageName: String
    ): TokenObjectParamsInterface = {
      val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenObjectParamsInterface]
    }
    
    @scala.inline
    implicit class TokenObjectParamsInterfaceMutableBuilder[Self <: TokenObjectParamsInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthStorageName(value: String): Self = StObject.set(x, "authStorageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthStorageType(value: cookie | localstorage): Self = StObject.set(x, "authStorageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTimeStorageName(value: String): Self = StObject.set(x, "authTimeStorageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      @scala.inline
      def setCookieSecure(value: Boolean): Self = StObject.set(x, "cookieSecure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieSecureUndefined: Self = StObject.set(x, "cookieSecure", js.undefined)
      
      @scala.inline
      def setStateStorageName(value: String): Self = StObject.set(x, "stateStorageName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait signInFunctionParams extends StObject {
    
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
    implicit class signInFunctionParamsMutableBuilder[Self <: signInFunctionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenType(value: String | Bearer): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
