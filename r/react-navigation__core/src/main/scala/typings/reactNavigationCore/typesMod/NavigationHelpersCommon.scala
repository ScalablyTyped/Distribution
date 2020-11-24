package typings.reactNavigationCore.typesMod

import typings.reactNavigationCore.anon.A
import typings.reactNavigationCore.anon.KeyNameParams
import typings.reactNavigationCore.anon.KeyString
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {dispatch (action : @react-navigation/routers.@react-navigation/routers.NavigationAction | (state : State): @react-navigation/routers.@react-navigation/routers.NavigationAction): void, navigate <RouteName extends keyof ParamList>(args : undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]]): void, navigate <RouteName extends keyof ParamList>(route : {  key :string,   params :ParamList[RouteName] | undefined} | {  name :RouteName,   key :string | undefined,   params :ParamList[RouteName]}): void, reset (state : @react-navigation/routers.@react-navigation/routers.PartialState<State> | State): void, goBack (): void, isFocused (): boolean, canGoBack (): boolean, dangerouslyGetParent <T = @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<@react-navigation/routers.@react-navigation/routers.ParamListBase, string, @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers.ParamListBase>, {}, {}> | undefined>(): T, dangerouslyGetState (): State} & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.PrivateValueStore<ParamList, keyof ParamList, {}> */
@js.native
trait NavigationHelpersCommon[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  /**
    * UGLY HACK! DO NOT USE THE TYPE!!!
    *
    * TypeScript requires a type to be used to be able to infer it.
    * The type should exist as its own without any operations such as union.
    * So we need to figure out a way to store this type in a property.
    * The problem with a normal property is that it shows up in intelliSense.
    * Adding private keyword works, but the annotation is stripped away in declaration.
    * Turns out if we use an empty string, it doesn't show up in intelliSense.
    */
  @JSName("")
  var _empty: js.UndefOr[A[ParamList]] = js.native
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  
  /**
    * Returns the parent navigator, if any. Reason why the function is called
    * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
    * of parent and other hard-to-follow patterns.
    */
  def dangerouslyGetParent[T](): T = js.native
  
  /**
    * Returns the navigator's state. Reason why the function is called
    * dangerouslyGetState is to discourage developers to use internal navigation's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def dangerouslyGetState(): State = js.native
  
  def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
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
  def navigate[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyNameParams[RouteName, ParamList]): Unit = js.native
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyString[ParamList, RouteName]): Unit = js.native
  
  def reset(state: State): Unit = js.native
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialState[State]): Unit = js.native
}
