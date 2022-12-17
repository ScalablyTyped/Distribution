package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.anon.TypeEventName
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpers<ParamList, {}> & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventConsumer<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationContainerEventMap> & {resetRoot (state : @react-navigation/routers.@react-navigation/routers.PartialState<@react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> | @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase> | undefined): void, getRootState (): @react-navigation/routers.@react-navigation/routers.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>, getCurrentRoute (): @react-navigation/routers.@react-navigation/routers.Route<string, object | undefined> | undefined, getCurrentOptions (): object | undefined, isReady (): boolean} */
@js.native
trait NavigationContainerRef[ParamList /* <: js.Object */] extends StObject {
  
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
  /* protected */ @JSName("")
  var _empty: js.UndefOr[js.Tuple3[ParamList, Any, Any]] = js.native
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Keyof[NavigationContainerEventMap] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): js.Function0[Unit] = js.native
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  
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
  def emit[EventName /* <: Keyof[js.Object] */](
    options: TypeEventName[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
  ): EventArg[
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
    * Get the rehydrated navigation state of the navigation tree.
    */
  def getRootState(): NavigationState[ParamListBase] = js.native
  
  /**
    * Returns the navigator's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def getState(): NavigationState[ParamListBase] = js.native
  
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
    * Whether the navigation container is ready to handle actions.
    */
  def isReady(): Boolean = js.native
  
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
  
  def removeListener[EventName /* <: Keyof[NavigationContainerEventMap] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): Unit = js.native
  
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
  def setParams[RouteName /* <: /* keyof ParamList */ String */](
    params: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ): Unit = js.native
}
