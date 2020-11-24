package typings.reactThreeFiber.threeTypesMod

import typings.reactThreeFiber.canvasMod.MouseEvent
import typings.reactThreeFiber.canvasMod.PointerEvent
import typings.reactThreeFiber.canvasMod.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventHandlers extends js.Object {
  
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  var onDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  
  var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  
  var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  
  var onPointerOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  
  var onPointerOver: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  
  var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.native
  
  var onWheel: js.UndefOr[js.Function1[/* event */ WheelEvent, Unit]] = js.native
}
object EventHandlers {
  
  @scala.inline
  def apply(): EventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventHandlers]
  }
  
  @scala.inline
  implicit class EventHandlersOps[Self <: EventHandlers] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: /* event */ MouseEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* event */ MouseEvent => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDoubleClick(value: /* event */ MouseEvent => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDoubleClick: Self = this.set("onDoubleClick", js.undefined)
    
    @scala.inline
    def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerDown: Self = this.set("onPointerDown", js.undefined)
    
    @scala.inline
    def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerMove: Self = this.set("onPointerMove", js.undefined)
    
    @scala.inline
    def setOnPointerOut(value: /* event */ PointerEvent => Unit): Self = this.set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOut: Self = this.set("onPointerOut", js.undefined)
    
    @scala.inline
    def setOnPointerOver(value: /* event */ PointerEvent => Unit): Self = this.set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerOver: Self = this.set("onPointerOver", js.undefined)
    
    @scala.inline
    def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPointerUp: Self = this.set("onPointerUp", js.undefined)
    
    @scala.inline
    def setOnWheel(value: /* event */ WheelEvent => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
  }
}
