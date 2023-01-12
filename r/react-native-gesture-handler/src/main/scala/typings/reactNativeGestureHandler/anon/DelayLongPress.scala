package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayLongPress extends StObject {
  
  var delayLongPress: Double
}
object DelayLongPress {
  
  inline def apply(delayLongPress: Double): DelayLongPress = {
    val __obj = js.Dynamic.literal(delayLongPress = delayLongPress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayLongPress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelayLongPress] (val x: Self) extends AnyVal {
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
  }
}
