package typings.reactTypesShared.srcEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressEvents extends StObject {
  
  /** Handler that is called when the press is released over the target. */
  var onPress: js.UndefOr[js.Function1[/* e */ PressEvent, Unit]] = js.undefined
  
  /** Handler that is called when the press state changes. */
  var onPressChange: js.UndefOr[js.Function1[/* isPressed */ Boolean, Unit]] = js.undefined
  
  /**
    * Handler that is called when a press interaction ends, either
    * over the target or when the pointer leaves the target.
    */
  var onPressEnd: js.UndefOr[js.Function1[/* e */ PressEvent, Unit]] = js.undefined
  
  /** Handler that is called when a press interaction starts. */
  var onPressStart: js.UndefOr[js.Function1[/* e */ PressEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called when a press is released over the target, regardless of
    * whether it started on the target or not.
    */
  var onPressUp: js.UndefOr[js.Function1[/* e */ PressEvent, Unit]] = js.undefined
}
object PressEvents {
  
  inline def apply(): PressEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressEvents] (val x: Self) extends AnyVal {
    
    inline def setOnPress(value: /* e */ PressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressChange(value: /* isPressed */ Boolean => Unit): Self = StObject.set(x, "onPressChange", js.Any.fromFunction1(value))
    
    inline def setOnPressChangeUndefined: Self = StObject.set(x, "onPressChange", js.undefined)
    
    inline def setOnPressEnd(value: /* e */ PressEvent => Unit): Self = StObject.set(x, "onPressEnd", js.Any.fromFunction1(value))
    
    inline def setOnPressEndUndefined: Self = StObject.set(x, "onPressEnd", js.undefined)
    
    inline def setOnPressStart(value: /* e */ PressEvent => Unit): Self = StObject.set(x, "onPressStart", js.Any.fromFunction1(value))
    
    inline def setOnPressStartUndefined: Self = StObject.set(x, "onPressStart", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnPressUp(value: /* e */ PressEvent => Unit): Self = StObject.set(x, "onPressUp", js.Any.fromFunction1(value))
    
    inline def setOnPressUpUndefined: Self = StObject.set(x, "onPressUp", js.undefined)
  }
}
