package typings.reactNavigationCore

import typings.reactNavigationCore.typesMod.EventMapCore
import typings.reactNavigationCore.useEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFocusEventsMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useFocusEvents", JSImport.Default)
  @js.native
  def default[State /* <: NavigationState[ParamListBase] */](hasStateEmitter: Options[State]): Unit = js.native
  
  @js.native
  trait Options[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var emitter: NavigationEventEmitter[EventMapCore[State]] = js.native
    
    var state: State = js.native
  }
  object Options {
    
    @scala.inline
    def apply[State /* <: NavigationState[ParamListBase] */](emitter: NavigationEventEmitter[EventMapCore[State]], state: State): Options[State] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with Options[State]) extends AnyVal {
      
      @scala.inline
      def setEmitter(value: NavigationEventEmitter[EventMapCore[State]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
