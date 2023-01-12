package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.libTypescriptStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerTag extends StObject {
  
  var handlerTag: Any
  
  var numberOfPointers: Double
  
  var oldState: js.UndefOr[State] = js.undefined
  
  var pointerInside: Boolean
  
  var state: State
  
  var target: Any
}
object HandlerTag {
  
  inline def apply(handlerTag: Any, numberOfPointers: Double, pointerInside: Boolean, state: State, target: Any): HandlerTag = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], pointerInside = pointerInside.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HandlerTag] (val x: Self) extends AnyVal {
    
    inline def setHandlerTag(value: Any): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
    
    inline def setPointerInside(value: Boolean): Self = StObject.set(x, "pointerInside", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
