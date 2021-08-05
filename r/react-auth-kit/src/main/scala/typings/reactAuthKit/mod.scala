package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.anon.AuthHeader
import typings.reactAuthKit.privateRouteMod.PrivateRouteProps
import typings.reactAuthKit.typesMod.AuthProviderProps
import typings.reactAuthKit.typesMod.signInFunctionParams
import typings.reactAuthKit.withAuthHeaderMod.withAuthHeaderProps
import typings.reactAuthKit.withAuthUserMod.withAuthProps
import typings.reactAuthKit.withSignInMod.withSignInProps
import typings.reactAuthKit.withSignOutMod.withSignOutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-auth-kit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * AuthProvider - The Authentication Context Provider
    *
    * @param children
    * @param authStorageName
    * @param authStorageType
    * @param authTimeStorageName
    * @param cookieDomain
    * @param cookieSecure
    * @param stateStorageName
    */
  @JSImport("react-auth-kit", "AuthProvider")
  @js.native
  val AuthProvider: FunctionComponent[AuthProviderProps] = js.native
  
  /**
    * Private Route for Components
    *
    * @remarks
    * This Component is based on {@link https://reactrouter.com/web/api/Route | reactrouter.Route}.
    * So you need to install react-route-dom before use it
    *
    * @param props
    */
  @JSImport("react-auth-kit", "PrivateRoute")
  @js.native
  val PrivateRoute: FunctionComponent[PrivateRouteProps] = js.native
  
  inline def useAuth(): AuthHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuth")().asInstanceOf[AuthHeader]
  
  inline def useAuthHeader(): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuthHeader")().asInstanceOf[js.Function0[String]]
  
  inline def useAuthUser(): js.Function0[js.Object | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuthUser")().asInstanceOf[js.Function0[js.Object | Null]]
  
  inline def useIsAuthenticated(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsAuthenticated")().asInstanceOf[js.Function0[Boolean]]
  
  /**
    * Authentication SignIn Hook
    *
    * @returns - Sign In function
    */
  inline def useSignIn(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSignIn")().asInstanceOf[js.Function1[/* signInConfig */ signInFunctionParams, Boolean]]
  
  inline def useSignOut(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSignOut")().asInstanceOf[js.Function0[Boolean]]
  
  inline def withAuthHeader[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuthHeader")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  inline def withAuthUser[P /* <: withAuthProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuthUser")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  inline def withIsAuthenticated[P /* <: typings.reactAuthKit.withIsAuthenticatedMod.withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withIsAuthenticated")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  inline def withSignIn[P /* <: withSignInProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignIn")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  
  inline def withSignOut[P /* <: withSignOutProps */](Component: ComponentType[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignOut")(Component.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
}
