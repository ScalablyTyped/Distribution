package typings.reactAuthKit

import typings.reactAuthKit.actionsMod.AuthActions
import typings.reactAuthKit.actionsMod.RefreshTokenAction
import typings.reactAuthKit.actionsMod.RefreshTokenActionPayload
import typings.reactAuthKit.actionsMod.SignInAction
import typings.reactAuthKit.actionsMod.SignInActionPayload
import typings.reactAuthKit.actionsMod.SignOutAction
import typings.reactAuthKit.typesMod.AuthKitStateInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducersMod {
  
  @JSImport("react-auth-kit/dist/utils/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authReducer(state: AuthKitStateInterface, action: AuthActions): AuthKitStateInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("authReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[AuthKitStateInterface]
  
  inline def doRefresh(refreshTokenParam: RefreshTokenActionPayload): RefreshTokenAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doRefresh")(refreshTokenParam.asInstanceOf[js.Any]).asInstanceOf[RefreshTokenAction]
  
  inline def doSignIn(signInParams: SignInActionPayload): SignInAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignIn")(signInParams.asInstanceOf[js.Any]).asInstanceOf[SignInAction]
  
  inline def doSignOut(): SignOutAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignOut")().asInstanceOf[SignOutAction]
}
