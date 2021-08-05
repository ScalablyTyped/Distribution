package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.blur
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import typings.reactNavigationCore.reactNavigationCoreStrings.state
import typings.reactNavigationCore.typesMod.EventArg
import typings.reactNavigationCore.typesMod.EventListenerCallback
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialState
import typings.std.Extract
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpers<@react-navigation/routers.@react-navigation/routers.ParamListBase, {}> & std.Partial<@react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<@react-navigation/routers.@react-navigation/routers.ParamListBase, string, any, any, any>> */
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
  var _empty: js.UndefOr[C] = js.native
  
  var addListener: js.UndefOr[
    js.Function2[
      /* type */ Extract[
        /* keyof any & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<any> */ focus | blur | state | beforeRemove, 
        String
      ], 
      /* callback */ EventListenerCallback[
        js.Any & EventMapCore[js.Any], 
        Extract[
          /* keyof any & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<any> */ focus | blur | state | beforeRemove, 
          String
        ]
      ], 
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
  
  /**
    * Returns the parent navigator, if any. Reason why the function is called
    * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
    * of parent and other hard-to-follow patterns.
    */
  def dangerouslyGetParent[T](): T = js.native
  @JSName("dangerouslyGetParent")
  var dangerouslyGetParent_FNavigationHelpersParamLis: js.UndefOr[
    js.Function0[
      js.UndefOr[
        NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object]
      ]
    ]
  ] = js.native
  
  /**
    * Returns the navigator's state. Reason why the function is called
    * dangerouslyGetState is to discourage developers to use internal navigation's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
  @JSName("dangerouslyGetState")
  var dangerouslyGetState_FNavigationHelpersParamLis: js.UndefOr[js.Function0[js.Any]] = js.native
  
  var dispatch: js.UndefOr[
    js.Function1[
      /* action */ NavigationAction | (js.Function1[/* state */ js.Any, NavigationAction]), 
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
  def emit[EventName /* <: Extract[/* keyof {} */ String, String] */](options: TypeEventName[EventName] & (js.Object | `2`) & (`9`[EventName] | `8`[EventName])): EventArg[
    EventName, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
  ] = js.native
  
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
      /* args */ (js.Tuple2[
        /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase] */ js.Any
      ]) | (js.Array[
        /* keyof @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase */ String
      ]), 
      Unit
    ]
  ] = js.native
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
  
  var removeListener: js.UndefOr[
    js.Function2[
      /* type */ Extract[
        /* keyof any & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<any> */ focus | blur | state | beforeRemove, 
        String
      ], 
      /* callback */ EventListenerCallback[
        js.Any & EventMapCore[js.Any], 
        Extract[
          /* keyof any & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<any> */ focus | blur | state | beforeRemove, 
          String
        ]
      ], 
      Unit
    ]
  ] = js.native
  
  var reset: js.UndefOr[js.Function1[/* state */ PartialState[js.Any] | js.Any, Unit]] = js.native
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialStateNavigationSta): Unit = js.native
  def reset(state: NavigationState[ParamListBase]): Unit = js.native
  
  var setOptions: js.UndefOr[js.Function1[/* options */ Partial[js.Any], Unit]] = js.native
  
  var setParams: js.UndefOr[
    js.Function1[
      /* params */ Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase[string] */ js.Any
      ], 
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
