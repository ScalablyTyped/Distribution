package typings.reduxAuthWrapper

import typings.history.mod.Location
import typings.redux.mod.Action
import typings.reduxAuthWrapper.mod.AuthWrapperDecorator
import typings.reduxAuthWrapper.mod.StateSelector
import typings.reduxAuthWrapper.redirectMod.ConnectedRouterRedirectConfig
import typings.reduxAuthWrapper.redirectMod.InjectedAuthReduxProps
import typings.reduxAuthWrapper.redirectMod.InjectedAuthRouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history4RedirectMod {
  
  @JSImport("redux-auth-wrapper/history4/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedReduxRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps]]
  
  inline def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedRouterRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ]]
  
  trait ConnectedReduxRedirectConfig[OwnProps, State]
    extends StObject
       with ConnectedRouterRedirectConfig[OwnProps, State] {
    
    @JSName("redirectAction")
    def redirectAction_MConnectedReduxRedirectConfig(location: Location): Action[Any]
  }
  object ConnectedReduxRedirectConfig {
    
    inline def apply[OwnProps, State](
      authenticatedSelector: (State, OwnProps) => Boolean,
      redirectAction: Location => Action[Any],
      redirectPath: String | (StateSelector[State, OwnProps, String])
    ): ConnectedReduxRedirectConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectAction = js.Any.fromFunction1(redirectAction), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedReduxRedirectConfig[OwnProps, State]]
    }
    
    extension [Self <: ConnectedReduxRedirectConfig[?, ?], OwnProps, State](x: Self & (ConnectedReduxRedirectConfig[OwnProps, State])) {
      
      inline def setRedirectAction(value: Location => Action[Any]): Self = StObject.set(x, "redirectAction", js.Any.fromFunction1(value))
    }
  }
}
