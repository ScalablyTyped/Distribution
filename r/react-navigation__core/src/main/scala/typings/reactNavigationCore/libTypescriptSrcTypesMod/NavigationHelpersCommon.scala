package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationHelpersCommon[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */]
  extends PrivateValueStore[js.Tuple3[ParamList, Any, Any]] {
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  
  def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
  /**
    * Returns the name of the navigator specified in the `name` prop.
    * If no name is specified, returns `undefined`.
    */
  def getId(): js.UndefOr[String] = js.native
  
  /**
    * Returns the navigation helpers from a parent navigator based on the ID.
    * If an ID is provided, the navigation helper from the parent navigator with matching ID (including current) will be returned.
    * If no ID is provided, the navigation helper from the immediate parent navigator will be returned.
    *
    * @param id Optional ID of a parent navigator.
    */
  def getParent[T](): T = js.native
  def getParent[T](id: String): T = js.native
  
  /**
    * Returns the navigator's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def getState(): State = js.native
  
  /**
    * Go back to the previous route in history.
    */
  def goBack(): Unit = js.native
  
  /**
    * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
    * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
    * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
    * To conditionally render content based on focus state, use the `useIsFocused` hook.
    */
  def isFocused(): Boolean = js.native
  
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param name Name of the route to navigate to.
    * @param [params] Params object for the route.
    */
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RouteName extends unknown ? undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] : never is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: RouteName extends unknown ? undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] : never */ /* import warning: importer.ImportType#apply Failed type conversion: RouteName extends unknown ? {  key :string,   params :ParamList[RouteName] | undefined,   merge :boolean | undefined} | {  name :RouteName,   key :string | undefined,   params :ParamList[RouteName],   merge :boolean | undefined} : never */ js.Any
  ): Unit = js.native
  
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialState[State] | State): Unit = js.native
}
