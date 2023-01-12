package typings.reactNavigationCore

import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typings.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseFocusEventsMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useFocusEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */](param0: Options[State]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var emitter: NavigationEventEmitter[EventMapCore[State]]
    
    var state: State
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */](emitter: NavigationEventEmitter[EventMapCore[State]], state: State): Options[State] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], State /* <: NavigationState[ParamListBase] */] (val x: Self & Options[State]) extends AnyVal {
      
      inline def setEmitter(value: NavigationEventEmitter[EventMapCore[State]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
