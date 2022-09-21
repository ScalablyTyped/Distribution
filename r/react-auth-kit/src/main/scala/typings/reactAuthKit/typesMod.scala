package typings.reactAuthKit

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Dispatch
import typings.react.mod.ReactNode
import typings.reactAuthKit.actionsMod.AuthActions
import typings.reactAuthKit.anon.AuthToken
import typings.reactAuthKit.anon.ExpiresAt
import typings.reactAuthKit.anon.Token
import typings.reactAuthKit.reactAuthKitStrings.Bearer
import typings.reactAuthKit.reactAuthKitStrings.cookie
import typings.reactAuthKit.reactAuthKitStrings.localstorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AuthContextInterface extends StObject {
    
    var authState: AuthKitStateInterface
    
    var dispatch: Dispatch[AuthActions]
  }
  object AuthContextInterface {
    
    inline def apply(authState: AuthKitStateInterface, dispatch: AuthActions => Unit): AuthContextInterface = {
      val __obj = js.Dynamic.literal(authState = authState.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[AuthContextInterface]
    }
    
    extension [Self <: AuthContextInterface](x: Self) {
      
      inline def setAuthState(value: AuthKitStateInterface): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: AuthActions => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    }
  }
  
  trait AuthKitStateInterface extends StObject {
    
    var auth: ExpiresAt | Null
    
    var isSignIn: Boolean
    
    var isUsingRefreshToken: Boolean
    
    var refresh: Token | Null
    
    var userState: AuthStateUserObject | Null
  }
  object AuthKitStateInterface {
    
    inline def apply(isSignIn: Boolean, isUsingRefreshToken: Boolean): AuthKitStateInterface = {
      val __obj = js.Dynamic.literal(isSignIn = isSignIn.asInstanceOf[js.Any], isUsingRefreshToken = isUsingRefreshToken.asInstanceOf[js.Any], auth = null, refresh = null, userState = null)
      __obj.asInstanceOf[AuthKitStateInterface]
    }
    
    extension [Self <: AuthKitStateInterface](x: Self) {
      
      inline def setAuth(value: ExpiresAt): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setIsSignIn(value: Boolean): Self = StObject.set(x, "isSignIn", value.asInstanceOf[js.Any])
      
      inline def setIsUsingRefreshToken(value: Boolean): Self = StObject.set(x, "isUsingRefreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefresh(value: Token): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshNull: Self = StObject.set(x, "refresh", null)
      
      inline def setUserState(value: AuthStateUserObject): Self = StObject.set(x, "userState", value.asInstanceOf[js.Any])
      
      inline def setUserStateNull: Self = StObject.set(x, "userState", null)
    }
  }
  
  trait AuthProviderProps extends StObject {
    
    var authName: String
    
    var authType: cookie | localstorage
    
    var children: ReactNode
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieSecure: js.UndefOr[Boolean] = js.undefined
    
    var refresh: js.UndefOr[createRefreshParamInterface] = js.undefined
  }
  object AuthProviderProps {
    
    inline def apply(authName: String, authType: cookie | localstorage): AuthProviderProps = {
      val __obj = js.Dynamic.literal(authName = authName.asInstanceOf[js.Any], authType = authType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthProviderProps]
    }
    
    extension [Self <: AuthProviderProps](x: Self) {
      
      inline def setAuthName(value: String): Self = StObject.set(x, "authName", value.asInstanceOf[js.Any])
      
      inline def setAuthType(value: cookie | localstorage): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieSecure(value: Boolean): Self = StObject.set(x, "cookieSecure", value.asInstanceOf[js.Any])
      
      inline def setCookieSecureUndefined: Self = StObject.set(x, "cookieSecure", js.undefined)
      
      inline def setRefresh(value: createRefreshParamInterface): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    }
  }
  
  type AuthStateUserObject = StringDictionary[Any]
  
  trait RefreshTokenCallbackResponse extends StObject {
    
    var isSuccess: Boolean
    
    var newAuthToken: String
    
    var newAuthTokenExpireIn: js.UndefOr[Double | Null] = js.undefined
    
    var newAuthUserState: js.UndefOr[AuthStateUserObject | Null] = js.undefined
    
    var newRefreshToken: js.UndefOr[String | Null] = js.undefined
    
    var newRefreshTokenExpiresIn: js.UndefOr[Double | Null] = js.undefined
  }
  object RefreshTokenCallbackResponse {
    
    inline def apply(isSuccess: Boolean, newAuthToken: String): RefreshTokenCallbackResponse = {
      val __obj = js.Dynamic.literal(isSuccess = isSuccess.asInstanceOf[js.Any], newAuthToken = newAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshTokenCallbackResponse]
    }
    
    extension [Self <: RefreshTokenCallbackResponse](x: Self) {
      
      inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
      
      inline def setNewAuthToken(value: String): Self = StObject.set(x, "newAuthToken", value.asInstanceOf[js.Any])
      
      inline def setNewAuthTokenExpireIn(value: Double): Self = StObject.set(x, "newAuthTokenExpireIn", value.asInstanceOf[js.Any])
      
      inline def setNewAuthTokenExpireInNull: Self = StObject.set(x, "newAuthTokenExpireIn", null)
      
      inline def setNewAuthTokenExpireInUndefined: Self = StObject.set(x, "newAuthTokenExpireIn", js.undefined)
      
      inline def setNewAuthUserState(value: AuthStateUserObject): Self = StObject.set(x, "newAuthUserState", value.asInstanceOf[js.Any])
      
      inline def setNewAuthUserStateNull: Self = StObject.set(x, "newAuthUserState", null)
      
      inline def setNewAuthUserStateUndefined: Self = StObject.set(x, "newAuthUserState", js.undefined)
      
      inline def setNewRefreshToken(value: String): Self = StObject.set(x, "newRefreshToken", value.asInstanceOf[js.Any])
      
      inline def setNewRefreshTokenExpiresIn(value: Double): Self = StObject.set(x, "newRefreshTokenExpiresIn", value.asInstanceOf[js.Any])
      
      inline def setNewRefreshTokenExpiresInNull: Self = StObject.set(x, "newRefreshTokenExpiresIn", null)
      
      inline def setNewRefreshTokenExpiresInUndefined: Self = StObject.set(x, "newRefreshTokenExpiresIn", js.undefined)
      
      inline def setNewRefreshTokenNull: Self = StObject.set(x, "newRefreshToken", null)
      
      inline def setNewRefreshTokenUndefined: Self = StObject.set(x, "newRefreshToken", js.undefined)
    }
  }
  
  trait createRefreshParamInterface extends StObject {
    
    var interval: Double
    
    var refreshApiCallback: refreshTokenCallback
  }
  object createRefreshParamInterface {
    
    inline def apply(
      interval: Double,
      refreshApiCallback: /* param */ AuthToken => js.Promise[RefreshTokenCallbackResponse]
    ): createRefreshParamInterface = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], refreshApiCallback = js.Any.fromFunction1(refreshApiCallback))
      __obj.asInstanceOf[createRefreshParamInterface]
    }
    
    extension [Self <: createRefreshParamInterface](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setRefreshApiCallback(value: /* param */ AuthToken => js.Promise[RefreshTokenCallbackResponse]): Self = StObject.set(x, "refreshApiCallback", js.Any.fromFunction1(value))
    }
  }
  
  type refreshFunctionType = js.Function1[/* param */ createRefreshParamInterface, createRefreshParamInterface]
  
  type refreshTokenCallback = js.Function1[/* param */ AuthToken, js.Promise[RefreshTokenCallbackResponse]]
  
  trait signInFunctionParams extends StObject {
    
    var authState: js.UndefOr[AuthStateUserObject] = js.undefined
    
    var expiresIn: Double
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var refreshTokenExpireIn: js.UndefOr[Double] = js.undefined
    
    var token: String
    
    var tokenType: String | Bearer
  }
  object signInFunctionParams {
    
    inline def apply(expiresIn: Double, token: String, tokenType: String | Bearer): signInFunctionParams = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[signInFunctionParams]
    }
    
    extension [Self <: signInFunctionParams](x: Self) {
      
      inline def setAuthState(value: AuthStateUserObject): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
      
      inline def setAuthStateUndefined: Self = StObject.set(x, "authState", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenExpireIn(value: Double): Self = StObject.set(x, "refreshTokenExpireIn", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenExpireInUndefined: Self = StObject.set(x, "refreshTokenExpireIn", js.undefined)
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String | Bearer): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
