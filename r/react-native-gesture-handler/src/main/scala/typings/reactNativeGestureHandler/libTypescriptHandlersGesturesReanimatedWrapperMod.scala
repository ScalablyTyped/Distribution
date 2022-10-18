package typings.reactNativeGestureHandler

import typings.reactNativeGestureHandler.anon.CreateAnimatedComponent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureStateChangeEvent
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureUpdateEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesReanimatedWrapperMod {
  
  object Reanimated {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/reanimatedWrapper", "Reanimated")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/reanimatedWrapper", "Reanimated.default")
    @js.native
    def default: CreateAnimatedComponent = js.native
    inline def default_=(x: CreateAnimatedComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
    
    inline def setGestureState(handlerTag: Double, newState: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def useEvent(
      callback: js.Function1[
          /* event */ (GestureUpdateEvent[Record[String, Any]]) | (GestureStateChangeEvent[Record[String, Any]]), 
          Unit
        ],
      events: js.Array[String],
      rebuild: Boolean
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(callback.asInstanceOf[js.Any], events.asInstanceOf[js.Any], rebuild.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def useSharedValue[T](value: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSharedValue")(value.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]
  }
  
  trait SharedValue[T] extends StObject {
    
    var value: T
  }
  object SharedValue {
    
    inline def apply[T](value: T): SharedValue[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedValue[T]]
    }
    
    extension [Self <: SharedValue[?], T](x: Self & SharedValue[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
