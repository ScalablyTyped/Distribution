package typings.rmcNukaCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginValue extends StObject {
  
  var beginValue: js.Any
  
  var delay: js.Any
  
  var duration: js.Any
  
  var easing: js.Any
  
  var endValue: js.Any
  
  var onEnd: js.Any
  
  var stackBehavior: js.Any
}
object BeginValue {
  
  inline def apply(
    beginValue: js.Any,
    delay: js.Any,
    duration: js.Any,
    easing: js.Any,
    endValue: js.Any,
    onEnd: js.Any,
    stackBehavior: js.Any
  ): BeginValue = {
    val __obj = js.Dynamic.literal(beginValue = beginValue.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any], stackBehavior = stackBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginValue]
  }
  
  extension [Self <: BeginValue](x: Self) {
    
    inline def setBeginValue(value: js.Any): Self = StObject.set(x, "beginValue", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: js.Any): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEndValue(value: js.Any): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setOnEnd(value: js.Any): Self = StObject.set(x, "onEnd", value.asInstanceOf[js.Any])
    
    inline def setStackBehavior(value: js.Any): Self = StObject.set(x, "stackBehavior", value.asInstanceOf[js.Any])
  }
}
