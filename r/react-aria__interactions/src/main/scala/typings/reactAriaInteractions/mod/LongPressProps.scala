package typings.reactAriaInteractions.mod

import typings.reactTypesShared.srcEventsMod.LongPressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongPressProps extends StObject {
  
  /**
    * A description for assistive techology users indicating that a long press
    * action is available, e.g. "Long press to open menu".
    */
  var accessibilityDescription: js.UndefOr[String] = js.undefined
  
  /** Whether long press events should be disabled. */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Handler that is called when the threshold time is met while
    * the press is over the target.
    */
  var onLongPress: js.UndefOr[js.Function1[/* e */ LongPressEvent, Unit]] = js.undefined
  
  /**
    * Handler that is called when a long press interaction ends, either
    * over the target or when the pointer leaves the target.
    */
  var onLongPressEnd: js.UndefOr[js.Function1[/* e */ LongPressEvent, Unit]] = js.undefined
  
  /** Handler that is called when a long press interaction starts. */
  var onLongPressStart: js.UndefOr[js.Function1[/* e */ LongPressEvent, Unit]] = js.undefined
  
  /**
    * The amount of time in milliseconds to wait before triggering a long press.
    * @default 500ms
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object LongPressProps {
  
  inline def apply(): LongPressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongPressProps]
  }
  
  extension [Self <: LongPressProps](x: Self) {
    
    inline def setAccessibilityDescription(value: String): Self = StObject.set(x, "accessibilityDescription", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityDescriptionUndefined: Self = StObject.set(x, "accessibilityDescription", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setOnLongPress(value: /* e */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressEnd(value: /* e */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPressEnd", js.Any.fromFunction1(value))
    
    inline def setOnLongPressEndUndefined: Self = StObject.set(x, "onLongPressEnd", js.undefined)
    
    inline def setOnLongPressStart(value: /* e */ LongPressEvent => Unit): Self = StObject.set(x, "onLongPressStart", js.Any.fromFunction1(value))
    
    inline def setOnLongPressStartUndefined: Self = StObject.set(x, "onLongPressStart", js.undefined)
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
