package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventArg
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventListenerCallback
import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpers<@react-navigation/routers.@react-navigation/routers.ParamListBase, {}> & std.Partial<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<@react-navigation/routers.@react-navigation/routers.ParamListBase, string, any, any, any, {}>> */
@js.native
trait NavigationHelpersParamLis extends StObject {
  
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
  var _empty: js.UndefOr[js.Tuple3[ParamListBase, Any, Any]] = js.native
  
  var addListener: js.UndefOr[
    js.Function2[
      /* type */ Keyof[EventMapCoreany], 
      /* callback */ EventListenerCallback[EventMapCoreany, Keyof[EventMapCoreany]], 
      js.Function0[Unit]
    ]
  ] = js.native
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  @JSName("canGoBack")
  var canGoBack_FNavigationHelpersParamLis: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var dispatch: js.UndefOr[
    js.Function1[
      /* action */ NavigationAction | (js.Function1[/* state */ Any, NavigationAction]), 
      Unit
    ]
  ] = js.native
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
    options: TargetType[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
  ): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.native
  
  /**
    * Returns the name of the navigator specified in the `name` prop.
    * If no name is specified, returns `undefined`.
    */
  def getId(): js.UndefOr[String] = js.native
  @JSName("getId")
  var getId_FNavigationHelpersParamLis: js.UndefOr[js.Function0[js.UndefOr[String]]] = js.native
  
  /**
    * Returns the navigation helpers from a parent navigator based on the ID.
    * If an ID is provided, the navigation helper from the parent navigator with matching ID (including current) will be returned.
    * If no ID is provided, the navigation helper from the immediate parent navigator will be returned.
    *
    * @param id Optional ID of a parent navigator.
    */
  def getParent[T](): T = js.native
  def getParent[T](id: String): T = js.native
  @JSName("getParent")
  var getParent_FNavigationHelpersParamLis: js.UndefOr[
    js.Function1[
      /* id */ js.UndefOr[Any], 
      js.UndefOr[
        NavigationProp[
          ParamListBase, 
          Keyof[ParamListBase], 
          Unit, 
          NavigationState[ParamListBase], 
          js.Object, 
          js.Object
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Returns the navigator's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def getState(): NavigationState[ParamListBase] = js.native
  @JSName("getState")
  var getState_FNavigationHelpersParamLis: js.UndefOr[js.Function0[Any]] = js.native
  
  /**
    * Go back to the previous route in history.
    */
  def goBack(): Unit = js.native
  @JSName("goBack")
  var goBack_FNavigationHelpersParamLis: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
    * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
    * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
    * To conditionally render content based on focus state, use the `useIsFocused` hook.
    */
  def isFocused(): Boolean = js.native
  @JSName("isFocused")
  var isFocused_FNavigationHelpersParamLis: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var navigate: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase extends unknown ? undefined extends @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase] ? [screen: keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase] | [screen: keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, params: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase]] : [screen: keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase, params: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase]] : never */ /* args */ js.Any, 
      Unit
    ]
  ] = js.native
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
  def navigate[RouteName /* <: /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RouteName extends unknown ? undefined extends ParamList[RouteName] ? [screen: RouteName] | [screen: RouteName, params: ParamList[RouteName]] : [screen: RouteName, params: ParamList[RouteName]] : never is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: RouteName extends unknown ? undefined extends @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] ? [screen: RouteName] | [screen: RouteName, params: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName]] : [screen: RouteName, params: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName]] : never */ /* import warning: importer.ImportType#apply Failed type conversion: RouteName extends unknown ? {  key :string,   params :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName] | undefined,   merge :boolean | undefined} | {  name :RouteName,   key :string | undefined,   params :@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[RouteName],   merge :boolean | undefined} : never */ js.Any
  ): Unit = js.native
  
  var removeListener: js.UndefOr[
    js.Function2[
      /* type */ Keyof[EventMapCoreany], 
      /* callback */ EventListenerCallback[EventMapCoreany, Keyof[EventMapCoreany]], 
      Unit
    ]
  ] = js.native
  
  var reset: js.UndefOr[js.Function1[/* state */ PartialState[Any] | Any, Unit]] = js.native
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialStateNavigationSta): Unit = js.native
  def reset(state: NavigationState[ParamListBase]): Unit = js.native
  
  var setOptions: js.UndefOr[js.Function1[/* options */ Partial[Any], Unit]] = js.native
  
  var setParams: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[string] extends undefined ? undefined : std.Partial<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[string]> */ /* params */ js.Any, 
      Unit
    ]
  ] = js.native
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
