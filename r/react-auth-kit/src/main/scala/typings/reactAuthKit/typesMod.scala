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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AuthContextInterface extends StObject {
    
    var authState: TokenInterface
    
    var setAuthState: Dispatch[SetStateAction[TokenInterface]]
  }
  object AuthContextInterface {
    
    inline def apply(authState: TokenInterface, setAuthState: SetStateAction[TokenInterface] => Unit): AuthContextInterface = {
      val __obj = js.Dynamic.literal(authState = authState.asInstanceOf[js.Any], setAuthState = js.Any.fromFunction1(setAuthState))
      __obj.asInstanceOf[AuthContextInterface]
    }
    
    extension [Self <: AuthContextInterface](x: Self) {
      
      inline def setAuthState(value: TokenInterface): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setSetAuthState(value: SetStateAction[TokenInterface] => Unit): Self = StObject.set(x, "setAuthState", js.Any.fromFunction1(value))
    }
  }
  
  trait AuthProviderProps
    extends StObject
       with TokenObjectParamsInterface {
    
    var children: ReactChildren
  }
  object AuthProviderProps {
    
    inline def apply(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      authTimeStorageName: String,
      children: ReactChildren,
      stateStorageName: String
    ): AuthProviderProps = {
      val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthProviderProps]
    }
    
    extension [Self <: AuthProviderProps](x: Self) {
      
      inline def setChildren(value: ReactChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenInterface extends StObject {
    
    var authState: js.Object | Null
    
    var authToken: String | Null
    
    var authTokenType: String | Null
    
    var expireAt: Date | Null
  }
  object TokenInterface {
    
    inline def apply(): TokenInterface = {
      val __obj = js.Dynamic.literal(authState = null, authToken = null, authTokenType = null, expireAt = null)
      __obj.asInstanceOf[TokenInterface]
    }
    
    extension [Self <: TokenInterface](x: Self) {
      
      inline def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setAuthStateNull: Self = StObject.set(x, "authState", null)
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
      
      inline def setAuthTokenType(value: String): Self = StObject.set(x, "authTokenType", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenTypeNull: Self = StObject.set(x, "authTokenType", null)
      
      inline def setExpireAt(value: Date): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setExpireAtNull: Self = StObject.set(x, "expireAt", null)
    }
  }
  
  trait TokenObjectParamsInterface extends StObject {
    
    var authStorageName: String
    
    var authStorageType: cookie | localstorage
    
    var authTimeStorageName: String
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieSecure: js.UndefOr[Boolean] = js.undefined
    
    var stateStorageName: String
  }
  object TokenObjectParamsInterface {
    
    inline def apply(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      authTimeStorageName: String,
      stateStorageName: String
    ): TokenObjectParamsInterface = {
      val __obj = js.Dynamic.literal(authStorageName = authStorageName.asInstanceOf[js.Any], authStorageType = authStorageType.asInstanceOf[js.Any], authTimeStorageName = authTimeStorageName.asInstanceOf[js.Any], stateStorageName = stateStorageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenObjectParamsInterface]
    }
    
    extension [Self <: TokenObjectParamsInterface](x: Self) {
      
      inline def setAuthStorageName(value: String): Self = StObject.set(x, "authStorageName", value.asInstanceOf[js.Any])
      
      inline def setAuthStorageType(value: cookie | localstorage): Self = StObject.set(x, "authStorageType", value.asInstanceOf[js.Any])
      
      inline def setAuthTimeStorageName(value: String): Self = StObject.set(x, "authTimeStorageName", value.asInstanceOf[js.Any])
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieSecure(value: Boolean): Self = StObject.set(x, "cookieSecure", value.asInstanceOf[js.Any])
      
      inline def setCookieSecureUndefined: Self = StObject.set(x, "cookieSecure", js.undefined)
      
      inline def setStateStorageName(value: String): Self = StObject.set(x, "stateStorageName", value.asInstanceOf[js.Any])
    }
  }
  
  trait signInFunctionParams extends StObject {
    
    var authState: js.Object
    
    var expiresIn: Double
    
    var token: String
    
    var tokenType: String | Bearer
  }
  object signInFunctionParams {
    
    inline def apply(authState: js.Object, expiresIn: Double, token: String, tokenType: String | Bearer): signInFunctionParams = {
      val __obj = js.Dynamic.literal(authState = authState.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[signInFunctionParams]
    }
    
    extension [Self <: signInFunctionParams](x: Self) {
      
      inline def setAuthState(value: js.Object): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String | Bearer): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
