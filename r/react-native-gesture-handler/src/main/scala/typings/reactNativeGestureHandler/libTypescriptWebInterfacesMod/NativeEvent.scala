package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import typings.reactNativeGestureHandler.libTypescriptStateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web/interfaces.NativeEventArgs} */ trait NativeEvent extends StObject {
  
  var handlerTag: Double
  
  var numberOfPointers: Double
  
  var oldState: js.UndefOr[State] = js.undefined
  
  var pointerInside: js.UndefOr[Boolean] = js.undefined
  
  var state: State
  
  var target: Double
}
object NativeEvent {
  
  inline def apply(handlerTag: Double, numberOfPointers: Double, state: State, target: Double): NativeEvent = {
    val __obj = js.Dynamic.literal(handlerTag = handlerTag.asInstanceOf[js.Any], numberOfPointers = numberOfPointers.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEvent] (val x: Self) extends AnyVal {
    
    inline def setHandlerTag(value: Double): Self = StObject.set(x, "handlerTag", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPointers(value: Double): Self = StObject.set(x, "numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: State): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setOldStateUndefined: Self = StObject.set(x, "oldState", js.undefined)
    
    inline def setPointerInside(value: Boolean): Self = StObject.set(x, "pointerInside", value.asInstanceOf[js.Any])
    
    inline def setPointerInsideUndefined: Self = StObject.set(x, "pointerInside", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
