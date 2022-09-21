package typings.reactNavigationCore

import typings.reactNavigationCore.anon.NavigationHelpersParamLis
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationCacheMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](hasStateGetStateNavigationSetOptionsRouterEmitter: Options[State, EventMap]): NavigationCache[State, ScreenOptions, EventMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateGetStateNavigationSetOptionsRouterEmitter.asInstanceOf[js.Any]).asInstanceOf[NavigationCache[State, ScreenOptions, EventMap]]
  
  type NavigationCache[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */] = Record[
    String, 
    NavigationProp[ParamListBase, String, js.UndefOr[String], State, ScreenOptions, EventMap]
  ]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */] extends StObject {
    
    var emitter: NavigationEventEmitter[EventMap]
    
    def getState(): State
    
    var navigation: NavigationHelpersParamLis
    
    var router: Router[State, NavigationAction]
    
    def setOptions(cb: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]): Unit
    
    var state: State
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */](
      emitter: NavigationEventEmitter[EventMap],
      getState: () => State,
      navigation: NavigationHelpersParamLis,
      router: Router[State, NavigationAction],
      setOptions: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit,
      state: State
    ): Options[State, EventMap] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, EventMap]]
    }
    
    extension [Self <: Options[?, ?], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */](x: Self & (Options[State, EventMap])) {
      
      inline def setEmitter(value: NavigationEventEmitter[EventMap]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setNavigation(value: NavigationHelpersParamLis): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: Router[State, NavigationAction]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setSetOptions(value: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
