package typings.reactAuthKit

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.privateRouteMod.RequireAuthProps
import typings.reactAuthKit.typesMod.AuthProviderProps
import typings.reactAuthKit.typesMod.AuthStateUserObject
import typings.reactAuthKit.typesMod.createRefreshParamInterface
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
    * @param cookieDomain
    * @param cookieSecure
    *
    * @return Functional Component
    */
  @JSImport("react-auth-kit", "AuthProvider")
  @js.native
  val AuthProvider: FunctionComponent[AuthProviderProps] = js.native
  
  @JSImport("react-auth-kit", "RequireAuth")
  @js.native
  val RequireAuth: FunctionComponent[RequireAuthProps] = js.native
  
  /**
    * This function doesn't really "do anything" at runtime,
    * it's just help to organize the code base
    * Use this function to create the refresh token system
    */
  inline def createRefresh(param: createRefreshParamInterface): createRefreshParamInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("createRefresh")(param.asInstanceOf[js.Any]).asInstanceOf[createRefreshParamInterface]
  
  inline def useAuthHeader(): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuthHeader")().asInstanceOf[js.Function0[String]]
  
  /**
    * Auth State Hook
    *
    * @returns - Auth State Function
    */
  inline def useAuthUser(): js.Function0[AuthStateUserObject | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAuthUser")().asInstanceOf[js.Function0[AuthStateUserObject | Null]]
  
  inline def useIsAuthenticated(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsAuthenticated")().asInstanceOf[js.Function0[Boolean]]
  
  /**
    *@function
    *@name useSignIn
    *@description Authentication SignIn Hook
    *@returns - Sign In function
    */
  inline def useSignIn(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSignIn")().asInstanceOf[js.Function1[/* signInConfig */ signInFunctionParams, Boolean]]
  
  inline def useSignOut(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSignOut")().asInstanceOf[js.Function0[Boolean]]
  
  /**
    * @public
    * @function
    * @name withAuthHeader
    * @description Inject Authentication Header inside the Component's Prop
    * @param Component - React Component
    */
  inline def withAuthHeader[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuthHeader")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @function
    * @name withAuthUser
    * @description Inject Authenticated User's state inside the Component's Prop
    * @param Component
    */
  inline def withAuthUser[P /* <: withAuthProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAuthUser")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @public
    * @function
    * @name withIsAuthenticated
    * @description Inject Authentication status inside the Component's Prop
    * @param Component
    */
  inline def withIsAuthenticated[P /* <: typings.reactAuthKit.withIsAuthenticatedMod.withAuthHeaderProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withIsAuthenticated")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @public
    * @function
    * @name withSignIn
    * @description Inject sign in functionality inside the Component's Prop
    * @param Component
    */
  inline def withSignIn[P /* <: withSignInProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignIn")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @public
    * @function
    * @name withSignOut
    * @description Inject sign Out functionality inside the Component's Prop
    * @param Component
    */
  inline def withSignOut[P /* <: withSignOutProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignOut")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
}
