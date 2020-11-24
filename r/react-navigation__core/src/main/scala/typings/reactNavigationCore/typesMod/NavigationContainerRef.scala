package typings.reactNavigationCore.typesMod

import typings.reactNavigationCore.anon.C
import typings.reactNavigationCore.anon.KeyStringParams
import typings.reactNavigationCore.anon.NameRouteName
import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.anon.TypeEventName
import typings.reactNavigationCore.anon.`2`
import typings.reactNavigationCore.anon.`8`
import typings.reactNavigationCore.anon.`9`
import typings.reactNavigationCore.reactNavigationCoreStrings.__unsafe_action__
import typings.reactNavigationCore.reactNavigationCoreStrings.options
import typings.reactNavigationCore.reactNavigationCoreStrings.state
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import typings.std.Extract
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpers<@react-navigation/routers.@react-navigation/routers.ParamListBase, {}> & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventConsumer<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationContainerEventMap> & {resetRoot (state : @react-navigation/routers.@react-navigation/routers.PartialState<@react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> | @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase> | undefined): void, getRootState (): @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>, getCurrentRoute (): @react-navigation/routers.@react-navigation/routers.Route<string, object | undefined> | undefined, getCurrentOptions (): object | undefined} */
@js.native
trait NavigationContainerRef extends js.Object {
  
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
  var _empty: js.UndefOr[C] = js.native
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Extract[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
    String
  ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): js.Function0[Unit] = js.native
  
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
  def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
  
  def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
  /**
    * Emit an event to child screens.
    *
    * @param options.type Type of the event (e.g. `focus`, `blur`)
    * @param [options.data] Optional information regarding the event.
    * @param [options.target] Key of the target route which should receive the event.
    * If not specified, all routes receive the event.
    */
  def emit[EventName /* <: Extract[/* keyof {} */ String, String] */](options: TypeEventName[EventName] with (js.Object | `2`) with (`9`[EventName] | `8`[EventName])): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.native
  
  /**
    * Get the currently focused route's options.
    */
  def getCurrentOptions(): js.UndefOr[js.Object] = js.native
  
  /**
    * Get the currently focused navigation route.
    */
  def getCurrentRoute(): js.UndefOr[Route[String, js.UndefOr[js.Object]]] = js.native
  
  /**
    * Get the rehydrated navigation state of the navigation tree.
    */
  def getRootState(): NavigationState[ParamListBase] = js.native
  
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
  def navigate[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: (js.Tuple2[
      RouteName, 
      /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] */ js.Any
    ]) | js.Array[RouteName]
  ): Unit = js.native
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
    */
  def navigate[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](route: KeyStringParams[RouteName]): Unit = js.native
  def navigate[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](route: NameRouteName[RouteName]): Unit = js.native
  
  def removeListener[EventName /* <: Extract[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
    String
  ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): Unit = js.native
  
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialStateNavigationSta): Unit = js.native
  def reset(state: NavigationState[ParamListBase]): Unit = js.native
  
  /**
    * Reset the navigation state of the root navigator to the provided state.
    *
    * @param state Navigation state object.
    */
  def resetRoot(): Unit = js.native
  def resetRoot(state: PartialStateNavigationSta): Unit = js.native
  def resetRoot(state: NavigationState[ParamListBase]): Unit = js.native
  
  /**
    * Update the param object for the route.
    * The new params will be shallow merged with the old one.
    *
    * @param params Params object for the current route.
    */
  def setParams[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](
    params: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] */ js.Any
    ]
  ): Unit = js.native
}
