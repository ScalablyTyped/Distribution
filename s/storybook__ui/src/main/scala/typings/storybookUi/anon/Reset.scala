package typings.storybookUi.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reset extends js.Object {
  
  var reset: MouseEventHandler[Element] = js.native
  
  var zoomIn: MouseEventHandler[Element] = js.native
  
  var zoomOut: MouseEventHandler[Element] = js.native
}
object Reset {
  
  @scala.inline
  def apply(
    reset: MouseEvent[Element, NativeMouseEvent] => Unit,
    zoomIn: MouseEvent[Element, NativeMouseEvent] => Unit,
    zoomOut: MouseEvent[Element, NativeMouseEvent] => Unit
  ): Reset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), zoomIn = js.Any.fromFunction1(zoomIn), zoomOut = js.Any.fromFunction1(zoomOut))
    __obj.asInstanceOf[Reset]
  }
  
  @scala.inline
  implicit class ResetOps[Self <: Reset] (val x: Self) extends AnyVal {
    
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
    def setReset(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomIn(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("zoomIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomOut(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = this.set("zoomOut", js.Any.fromFunction1(value))
  }
}
