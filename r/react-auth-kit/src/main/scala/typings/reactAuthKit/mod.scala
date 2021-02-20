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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("react-auth-kit", "useAuth")
  @js.native
  def useAuth(): AuthHeader = js.native
  
  @JSImport("react-auth-kit", "useAuthHeader")
  @js.native
  def useAuthHeader(): js.Function0[String] = js.native
  
  @JSImport("react-auth-kit", "useAuthUser")
  @js.native
  def useAuthUser(): js.Function0[js.Object | Null] = js.native
  
  @JSImport("react-auth-kit", "useIsAuthenticated")
  @js.native
  def useIsAuthenticated(): js.Function0[Boolean] = js.native
  
  /**
    * Authentication SignIn Hook
    *
    * @returns - Sign In function
    */
  @JSImport("react-auth-kit", "useSignIn")
  @js.native
  def useSignIn(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = js.native
  
  @JSImport("react-auth-kit", "useSignOut")
  @js.native
  def useSignOut(): js.Function0[Boolean] = js.native
  
  @JSImport("react-auth-kit", "withAuthHeader")
  @js.native
  def withAuthHeader[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @JSImport("react-auth-kit", "withAuthUser")
  @js.native
  def withAuthUser[P /* <: withAuthProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @JSImport("react-auth-kit", "withIsAuthenticated")
  @js.native
  def withIsAuthenticated[P /* <: typings.reactAuthKit.withIsAuthenticatedMod.withAuthHeaderProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @JSImport("react-auth-kit", "withSignIn")
  @js.native
  def withSignIn[P /* <: withSignInProps */](Component: ComponentType[P]): FC[P] = js.native
  
  @JSImport("react-auth-kit", "withSignOut")
  @js.native
  def withSignOut[P /* <: withSignOutProps */](Component: ComponentType[P]): FC[P] = js.native
}
