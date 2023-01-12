package typings.reactNativeGestureHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesGestureStateManagerMod {
  
  object GestureStateManager {
    
    @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/gestureStateManager", "GestureStateManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(handlerTag: Double): GestureStateManagerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[GestureStateManagerType]
  }
  
  trait GestureStateManagerType extends StObject {
    
    def activate(): Unit
    
    def begin(): Unit
    
    def end(): Unit
    
    def fail(): Unit
  }
  object GestureStateManagerType {
    
    inline def apply(activate: () => Unit, begin: () => Unit, end: () => Unit, fail: () => Unit): GestureStateManagerType = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction0(activate), begin = js.Any.fromFunction0(begin), end = js.Any.fromFunction0(end), fail = js.Any.fromFunction0(fail))
      __obj.asInstanceOf[GestureStateManagerType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GestureStateManagerType] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      inline def setBegin(value: () => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    }
  }
}
