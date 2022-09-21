package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializedEvent extends StObject {
  
  var bubbles: Boolean
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var composed: Boolean
  
  var currentTarget: Any
  
  var defaultPrevented: Boolean
  
  var detail: Any
  
  var eventPhase: Any
  
  var isSerializedEvent: Boolean
  
  var isTrusted: Boolean
  
  var returnValue: Any
  
  var srcElement: Any
  
  var target: Any
  
  var timeStamp: Double
  
  var `type`: String
}
object SerializedEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    composed: Boolean,
    currentTarget: Any,
    defaultPrevented: Boolean,
    detail: Any,
    eventPhase: Any,
    isSerializedEvent: Boolean,
    isTrusted: Boolean,
    returnValue: Any,
    srcElement: Any,
    target: Any,
    timeStamp: Double,
    `type`: String
  ): SerializedEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isSerializedEvent = isSerializedEvent.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedEvent]
  }
  
  extension [Self <: SerializedEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Any): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setIsSerializedEvent(value: Boolean): Self = StObject.set(x, "isSerializedEvent", value.asInstanceOf[js.Any])
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: Any): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
