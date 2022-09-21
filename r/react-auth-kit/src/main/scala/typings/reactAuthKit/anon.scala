package typings.reactAuthKit

import typings.reactAuthKit.typesMod.AuthStateUserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthToken extends StObject {
    
    var authToken: js.UndefOr[String] = js.undefined
    
    var authTokenExpireAt: js.UndefOr[js.Date] = js.undefined
    
    var authUserState: AuthStateUserObject | Null
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var refreshTokenExpiresAt: js.UndefOr[js.Date] = js.undefined
  }
  object AuthToken {
    
    inline def apply(): AuthToken = {
      val __obj = js.Dynamic.literal(authUserState = null)
      __obj.asInstanceOf[AuthToken]
    }
    
    extension [Self <: AuthToken](x: Self) {
      
      inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenExpireAt(value: js.Date): Self = StObject.set(x, "authTokenExpireAt", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenExpireAtUndefined: Self = StObject.set(x, "authTokenExpireAt", js.undefined)
      
      inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      inline def setAuthUserState(value: AuthStateUserObject): Self = StObject.set(x, "authUserState", value.asInstanceOf[js.Any])
      
      inline def setAuthUserStateNull: Self = StObject.set(x, "authUserState", null)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenExpiresAt(value: js.Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    }
  }
  
  trait ExpiresAt extends StObject {
    
    var expiresAt: js.Date
    
    var token: String
    
    var `type`: String
  }
  object ExpiresAt {
    
    inline def apply(expiresAt: js.Date, token: String, `type`: String): ExpiresAt = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpiresAt]
    }
    
    extension [Self <: ExpiresAt](x: Self) {
      
      inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    var expiresAt: js.Date
    
    var token: String
  }
  object Token {
    
    inline def apply(expiresAt: js.Date, token: String): Token = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
