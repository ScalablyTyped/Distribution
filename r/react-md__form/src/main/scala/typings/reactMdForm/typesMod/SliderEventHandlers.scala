package typings.reactMdForm.typesMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLSpanElement>, @react-md/form.@react-md/form/types/slider/types.SliderEventHandlerNames> */
@js.native
trait SliderEventHandlers extends js.Object {
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSpanElement]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSpanElement]] = js.native
}
object SliderEventHandlers {
  
  @scala.inline
  def apply(): SliderEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEventHandlers]
  }
  
  @scala.inline
  implicit class SliderEventHandlersOps[Self <: SliderEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[HTMLSpanElement] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: MouseEvent[HTMLSpanElement, NativeMouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: TouchEvent[HTMLSpanElement] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
}
