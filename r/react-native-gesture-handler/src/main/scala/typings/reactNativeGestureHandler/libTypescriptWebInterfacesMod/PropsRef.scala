package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsRef extends StObject {
  
  def onGestureHandlerEvent(): Unit
  
  def onGestureHandlerStateChange(): Unit
}
object PropsRef {
  
  inline def apply(onGestureHandlerEvent: () => Unit, onGestureHandlerStateChange: () => Unit): PropsRef = {
    val __obj = js.Dynamic.literal(onGestureHandlerEvent = js.Any.fromFunction0(onGestureHandlerEvent), onGestureHandlerStateChange = js.Any.fromFunction0(onGestureHandlerStateChange))
    __obj.asInstanceOf[PropsRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsRef] (val x: Self) extends AnyVal {
    
    inline def setOnGestureHandlerEvent(value: () => Unit): Self = StObject.set(x, "onGestureHandlerEvent", js.Any.fromFunction0(value))
    
    inline def setOnGestureHandlerStateChange(value: () => Unit): Self = StObject.set(x, "onGestureHandlerStateChange", js.Any.fromFunction0(value))
  }
}
