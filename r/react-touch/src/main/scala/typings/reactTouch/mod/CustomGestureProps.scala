package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomGestureProps extends StObject {
  
  var config: js.Array[moves]
  
  def onGesture(): Unit
}
object CustomGestureProps {
  
  inline def apply(config: js.Array[moves], onGesture: () => Unit): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = js.Any.fromFunction0(onGesture))
    __obj.asInstanceOf[CustomGestureProps]
  }
  
  extension [Self <: CustomGestureProps](x: Self) {
    
    inline def setConfig(value: js.Array[moves]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigVarargs(value: moves*): Self = StObject.set(x, "config", js.Array(value*))
    
    inline def setOnGesture(value: () => Unit): Self = StObject.set(x, "onGesture", js.Any.fromFunction0(value))
  }
}
