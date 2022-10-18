package typings.reactAuthKit

import typings.reactAuthKit.anon.ExpiresAt
import typings.reactAuthKit.anon.Token
import typings.reactAuthKit.distTypesMod.AuthStateUserObject
import typings.reactAuthKit.distUtilsActionsMod.ActionType.RefreshToken
import typings.reactAuthKit.distUtilsActionsMod.ActionType.SignIn
import typings.reactAuthKit.distUtilsActionsMod.ActionType.SignOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsActionsMod {
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("react-auth-kit/dist/utils/actions", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType & Double] = js.native
    
    @js.native
    sealed trait RefreshToken
      extends StObject
         with ActionType
    /* 2 */ val RefreshToken: typings.reactAuthKit.distUtilsActionsMod.ActionType.RefreshToken & Double = js.native
    
    @js.native
    sealed trait SignIn
      extends StObject
         with ActionType
    /* 0 */ val SignIn: typings.reactAuthKit.distUtilsActionsMod.ActionType.SignIn & Double = js.native
    
    @js.native
    sealed trait SignOut
      extends StObject
         with ActionType
    /* 1 */ val SignOut: typings.reactAuthKit.distUtilsActionsMod.ActionType.SignOut & Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAuthKit.distUtilsActionsMod.SignInAction
    - typings.reactAuthKit.distUtilsActionsMod.SignOutAction
    - typings.reactAuthKit.distUtilsActionsMod.RefreshTokenAction
  */
  trait AuthActions extends StObject
  object AuthActions {
    
    inline def RefreshTokenAction(payload: RefreshTokenActionPayload, `type`: RefreshToken): typings.reactAuthKit.distUtilsActionsMod.RefreshTokenAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactAuthKit.distUtilsActionsMod.RefreshTokenAction]
    }
    
    inline def SignInAction(payload: SignInActionPayload, `type`: SignIn): typings.reactAuthKit.distUtilsActionsMod.SignInAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactAuthKit.distUtilsActionsMod.SignInAction]
    }
    
    inline def SignOutAction(`type`: SignOut): typings.reactAuthKit.distUtilsActionsMod.SignOutAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactAuthKit.distUtilsActionsMod.SignOutAction]
    }
  }
  
  trait RefreshTokenAction
    extends StObject
       with AuthActions {
    
    var payload: RefreshTokenActionPayload
    
    var `type`: RefreshToken
  }
  object RefreshTokenAction {
    
    inline def apply(payload: RefreshTokenActionPayload, `type`: RefreshToken): RefreshTokenAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshTokenAction]
    }
    
    extension [Self <: RefreshTokenAction](x: Self) {
      
      inline def setPayload(value: RefreshTokenActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: RefreshToken): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshTokenActionPayload extends StObject {
    
    var newAuthToken: String | Null
    
    var newAuthTokenExpireIn: js.UndefOr[Double | Null] = js.undefined
    
    var newAuthUserState: js.UndefOr[AuthStateUserObject | Null] = js.undefined
    
    var newRefreshToken: js.UndefOr[String | Null] = js.undefined
    
    var newRefreshTokenExpiresIn: js.UndefOr[Double | Null] = js.undefined
  }
  object RefreshTokenActionPayload {
    
    inline def apply(): RefreshTokenActionPayload = {
      val __obj = js.Dynamic.literal(newAuthToken = null)
      __obj.asInstanceOf[RefreshTokenActionPayload]
    }
    
    extension [Self <: RefreshTokenActionPayload](x: Self) {
      
      inline def setNewAuthToken(value: String): Self = StObject.set(x, "newAuthToken", value.asInstanceOf[js.Any])
      
      inline def setNewAuthTokenExpireIn(value: Double): Self = StObject.set(x, "newAuthTokenExpireIn", value.asInstanceOf[js.Any])
      
      inline def setNewAuthTokenExpireInNull: Self = StObject.set(x, "newAuthTokenExpireIn", null)
      
      inline def setNewAuthTokenExpireInUndefined: Self = StObject.set(x, "newAuthTokenExpireIn", js.undefined)
      
      inline def setNewAuthTokenNull: Self = StObject.set(x, "newAuthToken", null)
      
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
  
  trait SignInAction
    extends StObject
       with AuthActions {
    
    var payload: SignInActionPayload
    
    var `type`: SignIn
  }
  object SignInAction {
    
    inline def apply(payload: SignInActionPayload, `type`: SignIn): SignInAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignInAction]
    }
    
    extension [Self <: SignInAction](x: Self) {
      
      inline def setPayload(value: SignInActionPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: SignIn): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignInActionPayload extends StObject {
    
    var auth: ExpiresAt
    
    var refresh: Token | Null
    
    var userState: AuthStateUserObject | Null
  }
  object SignInActionPayload {
    
    inline def apply(auth: ExpiresAt): SignInActionPayload = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], refresh = null, userState = null)
      __obj.asInstanceOf[SignInActionPayload]
    }
    
    extension [Self <: SignInActionPayload](x: Self) {
      
      inline def setAuth(value: ExpiresAt): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setRefresh(value: Token): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      inline def setRefreshNull: Self = StObject.set(x, "refresh", null)
      
      inline def setUserState(value: AuthStateUserObject): Self = StObject.set(x, "userState", value.asInstanceOf[js.Any])
      
      inline def setUserStateNull: Self = StObject.set(x, "userState", null)
    }
  }
  
  trait SignOutAction
    extends StObject
       with AuthActions {
    
    var `type`: SignOut
  }
  object SignOutAction {
    
    inline def apply(`type`: SignOut): SignOutAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOutAction]
    }
    
    extension [Self <: SignOutAction](x: Self) {
      
      inline def setType(value: SignOut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
