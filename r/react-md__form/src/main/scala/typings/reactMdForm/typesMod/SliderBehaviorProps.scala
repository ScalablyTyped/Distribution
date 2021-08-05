package typings.reactMdForm.typesMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefCallback
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<@react-md/form.@react-md/form/types/slider/types.SliderRangeOptions> */
/* Inlined parent std.Required<@react-md/form.@react-md/form/types/slider/types.SliderEventHandlers> */
/* Inlined parent std.Required<std.Pick<@react-md/form.@react-md/form/types/slider/types.SliderStateOptions, 'dragging'>> */
trait SliderBehaviorProps extends StObject {
  
  var disabled: Boolean
  
  var dragging: Boolean
  
  var max: Double
  
  var min: Double
  
  var onKeyDown: KeyboardEventHandler[HTMLSpanElement]
  
  var onKeyUp: KeyboardEventHandler[HTMLSpanElement]
  
  var onMouseDown: MouseEventHandler[HTMLSpanElement]
  
  var onTouchStart: TouchEventHandler[HTMLSpanElement]
  
  /**
    * A ref that should be passed to the `Slider` component to handle calculating
    * the value based on the drag distance.
    */
  var ref: RefCallback[HTMLSpanElement]
  
  /**
    * The current value of the slider.
    */
  var value: Double
  
  var vertical: Boolean
}
object SliderBehaviorProps {
  
  inline def apply(
    disabled: Boolean,
    dragging: Boolean,
    max: Double,
    min: Double,
    onKeyDown: KeyboardEvent[HTMLSpanElement] => Unit,
    onKeyUp: KeyboardEvent[HTMLSpanElement] => Unit,
    onMouseDown: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit,
    onTouchStart: TouchEvent[HTMLSpanElement] => Unit,
    ref: /* instance */ HTMLSpanElement | Null => Unit,
    value: Double,
    vertical: Boolean
  ): SliderBehaviorProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchStart = js.Any.fromFunction1(onTouchStart), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderBehaviorProps]
  }
  
  extension [Self <: SliderBehaviorProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOnKeyDown(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyUp(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseDown(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnTouchStart(value: TouchEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setRef(value: /* instance */ HTMLSpanElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
