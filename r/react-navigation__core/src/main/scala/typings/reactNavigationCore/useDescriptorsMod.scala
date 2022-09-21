package typings.reactNavigationCore

import typings.reactNavigationCore.anon.Dispatch
import typings.reactNavigationCore.anon.OptionsRoute
import typings.reactNavigationCore.anon.RouteRouteProp
import typings.reactNavigationCore.anon.SetOptions
import typings.reactNavigationCore.navigationBuilderContextMod.AddKeyedListener
import typings.reactNavigationCore.navigationBuilderContextMod.AddListener
import typings.reactNavigationCore.reactNavigationCoreStrings.action
import typings.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typings.reactNavigationCore.reactNavigationCoreStrings.focus
import typings.reactNavigationCore.reactNavigationCoreStrings.getParent
import typings.reactNavigationCore.reactNavigationCoreStrings.getState
import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.EventConsumer
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationCore.typesMod.PrivateValueStore
import typings.reactNavigationCore.typesMod.RouteConfig
import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDescriptorsMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useDescriptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    hasStateScreensNavigationScreenOptionsDefaultScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter: Options[State, ScreenOptions, EventMap]
  ): Record[
    String, 
    Descriptor[
      ScreenOptions, 
      (Omit[
        Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
        getParent
      ]) & SetOptions[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
      RouteProp[ParamListBase, String]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateScreensNavigationScreenOptionsDefaultScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter.asInstanceOf[js.Any]).asInstanceOf[Record[
    String, 
    Descriptor[
      ScreenOptions, 
      (Omit[
        Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
        getParent
      ]) & SetOptions[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
      RouteProp[ParamListBase, String]
    ]
  ]]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    var addKeyedListener: AddKeyedListener
    
    var addListener: AddListener
    
    var defaultScreenOptions: js.UndefOr[
        ScreenOptions | (js.Function1[/* props */ OptionsRoute[ScreenOptions], ScreenOptions])
      ] = js.undefined
    
    var emitter: NavigationEventEmitter[EventMap]
    
    def getState(): State
    
    var navigation: NavigationHelpers[ParamListBase, js.Object]
    
    def onAction(action: NavigationAction): Boolean
    
    def onRouteFocus(key: String): Unit
    
    var router: Router[State, NavigationAction]
    
    var screenOptions: js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]] = js.undefined
    
    var screens: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]]
    
    def setState(state: State): Unit
    
    var state: State
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      addKeyedListener: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Unit,
      addListener: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Unit,
      emitter: NavigationEventEmitter[EventMap],
      getState: () => State,
      navigation: NavigationHelpers[ParamListBase, js.Object],
      onAction: NavigationAction => Boolean,
      onRouteFocus: String => Unit,
      router: Router[State, NavigationAction],
      screens: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]],
      setState: State => Unit,
      state: State
    ): Options[State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(addKeyedListener = js.Any.fromFunction3(addKeyedListener), addListener = js.Any.fromFunction2(addListener), emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], onAction = js.Any.fromFunction1(onAction), onRouteFocus = js.Any.fromFunction1(onRouteFocus), router = router.asInstanceOf[js.Any], screens = screens.asInstanceOf[js.Any], setState = js.Any.fromFunction1(setState), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: Options[?, ?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (Options[State, ScreenOptions, EventMap])) {
      
      inline def setAddKeyedListener(
        value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Unit
      ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3(value))
      
      inline def setAddListener(
        value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Unit
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setDefaultScreenOptions(value: ScreenOptions | (js.Function1[/* props */ OptionsRoute[ScreenOptions], ScreenOptions])): Self = StObject.set(x, "defaultScreenOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultScreenOptionsFunction1(value: /* props */ OptionsRoute[ScreenOptions] => ScreenOptions): Self = StObject.set(x, "defaultScreenOptions", js.Any.fromFunction1(value))
      
      inline def setDefaultScreenOptionsUndefined: Self = StObject.set(x, "defaultScreenOptions", js.undefined)
      
      inline def setEmitter(value: NavigationEventEmitter[EventMap]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOnAction(value: NavigationAction => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      inline def setOnRouteFocus(value: String => Unit): Self = StObject.set(x, "onRouteFocus", js.Any.fromFunction1(value))
      
      inline def setRouter(value: Router[State, NavigationAction]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setScreenOptions(value: ScreenOptionsOrCallback[ScreenOptions]): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
      
      inline def setScreenOptionsFunction1(value: /* props */ RouteRouteProp => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
      
      inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
      
      inline def setScreens(value: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
      
      inline def setSetState(value: State => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenConfigWithParent[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    var keys: js.Array[js.UndefOr[String]]
    
    var options: js.UndefOr[js.Array[js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]]] = js.undefined
    
    var props: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]
  }
  object ScreenConfigWithParent {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      keys: js.Array[js.UndefOr[String]],
      props: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]
    ): ScreenConfigWithParent[State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenConfigWithParent[State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: ScreenConfigWithParent[?, ?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (ScreenConfigWithParent[State, ScreenOptions, EventMap])) {
      
      inline def setKeys(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOptions(value: js.Array[js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setProps(value: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ScreenOptionsOrCallback[ScreenOptions /* <: js.Object */] = ScreenOptions | (js.Function1[/* props */ RouteRouteProp, ScreenOptions])
}
