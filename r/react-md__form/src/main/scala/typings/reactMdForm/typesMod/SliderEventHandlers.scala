package typings.reactMdForm.typesMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLSpanElement>, @react-md/form.@react-md/form/types/slider/types.SliderEventHandlerNames> */
trait SliderEventHandlers extends StObject {
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.undefined
}
object SliderEventHandlers {
  
  inline def apply(): SliderEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEventHandlers]
  }
  
  extension [Self <: SliderEventHandlers](x: Self) {
    
    inline def setOnKeyDown(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnMouseDown(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnTouchStart(value: TouchEvent[HTMLSpanElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
