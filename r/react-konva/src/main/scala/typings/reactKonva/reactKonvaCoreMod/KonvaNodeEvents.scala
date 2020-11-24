package typings.reactKonva.reactKonvaCoreMod

import typings.konva.mod.Konva.KonvaEventObject
import typings.std.DragEvent
import typings.std.Event
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KonvaNodeEvents extends js.Object {
  
  var onClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onContextMenu: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[PointerEvent], Unit]] = js.native
  
  var onDblClick: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onDblTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onDragEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onDragMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[DragEvent], Unit]] = js.native
  
  var onMouseDown: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseEnter: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseLeave: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseOut: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseOver: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onMouseUp: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[MouseEvent], Unit]] = js.native
  
  var onTap: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTouchEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTouchMove: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTouchStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[TouchEvent], Unit]] = js.native
  
  var onTransform: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTransformEnd: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onTransformStart: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[Event], Unit]] = js.native
  
  var onWheel: js.UndefOr[js.Function1[/* evt */ KonvaEventObject[WheelEvent], Unit]] = js.native
}
object KonvaNodeEvents {
  
  @scala.inline
  def apply(): KonvaNodeEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KonvaNodeEvents]
  }
  
  @scala.inline
  implicit class KonvaNodeEventsOps[Self <: KonvaNodeEvents] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: /* evt */ KonvaEventObject[PointerEvent] => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextMenu: Self = this.set("onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnDblTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onDblTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblTap: Self = this.set("onDblTap", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragMove(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* evt */ KonvaEventObject[DragEvent] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseOut(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseOver: Self = this.set("onMouseOver", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: /* evt */ KonvaEventObject[MouseEvent] => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTap(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchEnd: Self = this.set("onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchMove: Self = this.set("onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: /* evt */ KonvaEventObject[TouchEvent] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
    
    @scala.inline
    def setOnTransform(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransform: Self = this.set("onTransform", js.undefined)
    
    @scala.inline
    def setOnTransformEnd(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransformEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransformEnd: Self = this.set("onTransformEnd", js.undefined)
    
    @scala.inline
    def setOnTransformStart(value: /* evt */ KonvaEventObject[Event] => Unit): Self = this.set("onTransformStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTransformStart: Self = this.set("onTransformStart", js.undefined)
    
    @scala.inline
    def setOnWheel(value: /* evt */ KonvaEventObject[WheelEvent] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
  }
}
