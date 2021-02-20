package typings.reactNavigationCore

import org.scalablytyped.runtime.StringDictionary
import typings.reactNavigationCore.anon.NavigationHelpersParamLis
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationAction
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNavigationCacheMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationCache", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */](hasStateGetStateNavigationSetOptionsRouterEmitter: Options[State]): NavigationCache[State, ScreenOptions] = js.native
  
  type NavigationCache[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */] = StringDictionary[NavigationProp[ParamListBase, String, State, ScreenOptions, js.Object]]
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var emitter: NavigationEventEmitter[EventMapBase] = js.native
    
    def getState(): State = js.native
    
    var navigation: NavigationHelpersParamLis = js.native
    
    var router: Router[State, NavigationAction] = js.native
    
    def setOptions(cb: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]): Unit = js.native
    
    var state: State = js.native
  }
  object Options {
    
    @scala.inline
    def apply[State /* <: NavigationState[ParamListBase] */](
      emitter: NavigationEventEmitter[EventMapBase],
      getState: () => State,
      navigation: NavigationHelpersParamLis,
      router: Router[State, NavigationAction],
      setOptions: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit,
      state: State
    ): Options[State] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = js.Any.fromFunction0(getState), navigation = navigation.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1(setOptions), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Options[State]) extends AnyVal {
      
      @scala.inline
      def setEmitter(value: NavigationEventEmitter[EventMapBase]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetState(value: () => State): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigation(value: NavigationHelpersParamLis): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: Router[State, NavigationAction]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetOptions(value: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
