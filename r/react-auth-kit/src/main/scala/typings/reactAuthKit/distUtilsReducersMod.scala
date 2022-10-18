package typings.reactAuthKit

import typings.reactAuthKit.distTypesMod.AuthKitStateInterface
import typings.reactAuthKit.distUtilsActionsMod.AuthActions
import typings.reactAuthKit.distUtilsActionsMod.RefreshTokenAction
import typings.reactAuthKit.distUtilsActionsMod.RefreshTokenActionPayload
import typings.reactAuthKit.distUtilsActionsMod.SignInAction
import typings.reactAuthKit.distUtilsActionsMod.SignInActionPayload
import typings.reactAuthKit.distUtilsActionsMod.SignOutAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsReducersMod {
  
  @JSImport("react-auth-kit/dist/utils/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authReducer(state: AuthKitStateInterface, action: AuthActions): AuthKitStateInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("authReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[AuthKitStateInterface]
  
  inline def doRefresh(refreshTokenParam: RefreshTokenActionPayload): RefreshTokenAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doRefresh")(refreshTokenParam.asInstanceOf[js.Any]).asInstanceOf[RefreshTokenAction]
  
  inline def doSignIn(signInParams: SignInActionPayload): SignInAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignIn")(signInParams.asInstanceOf[js.Any]).asInstanceOf[SignInAction]
  
  inline def doSignOut(): SignOutAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignOut")().asInstanceOf[SignOutAction]
}
