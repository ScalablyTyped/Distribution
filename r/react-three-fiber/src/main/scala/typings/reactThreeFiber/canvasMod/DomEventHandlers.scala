package typings.reactThreeFiber.canvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEventHandlers extends js.Object {
  
  def onClick(e: js.Any): Unit = js.native
  
  def onContextMenu(e: js.Any): Unit = js.native
  
  def onDoubleClick(e: js.Any): Unit = js.native
  
  def onGotPointerCaptureLegacy(e: js.Any): Unit = js.native
  
  def onLostPointerCapture(e: js.Any): Unit = js.native
  
  def onPointerDown(e: js.Any): Unit = js.native
  
  def onPointerLeave(e: js.Any): Unit = js.native
  
  def onPointerMove(e: js.Any): Unit = js.native
  
  def onPointerUp(e: js.Any): Unit = js.native
  
  def onWheel(e: js.Any): Unit = js.native
}
object DomEventHandlers {
  
  @scala.inline
  def apply(
    onClick: js.Any => Unit,
    onContextMenu: js.Any => Unit,
    onDoubleClick: js.Any => Unit,
    onGotPointerCaptureLegacy: js.Any => Unit,
    onLostPointerCapture: js.Any => Unit,
    onPointerDown: js.Any => Unit,
    onPointerLeave: js.Any => Unit,
    onPointerMove: js.Any => Unit,
    onPointerUp: js.Any => Unit,
    onWheel: js.Any => Unit
  ): DomEventHandlers = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), onContextMenu = js.Any.fromFunction1(onContextMenu), onDoubleClick = js.Any.fromFunction1(onDoubleClick), onGotPointerCaptureLegacy = js.Any.fromFunction1(onGotPointerCaptureLegacy), onLostPointerCapture = js.Any.fromFunction1(onLostPointerCapture), onPointerDown = js.Any.fromFunction1(onPointerDown), onPointerLeave = js.Any.fromFunction1(onPointerLeave), onPointerMove = js.Any.fromFunction1(onPointerMove), onPointerUp = js.Any.fromFunction1(onPointerUp), onWheel = js.Any.fromFunction1(onWheel))
    __obj.asInstanceOf[DomEventHandlers]
  }
  
  @scala.inline
  implicit class DomEventHandlersOps[Self <: DomEventHandlers] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenu(value: js.Any => Unit): Self = this.set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDoubleClick(value: js.Any => Unit): Self = this.set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGotPointerCaptureLegacy(value: js.Any => Unit): Self = this.set("onGotPointerCaptureLegacy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLostPointerCapture(value: js.Any => Unit): Self = this.set("onLostPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerDown(value: js.Any => Unit): Self = this.set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerLeave(value: js.Any => Unit): Self = this.set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerMove(value: js.Any => Unit): Self = this.set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPointerUp(value: js.Any => Unit): Self = this.set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWheel(value: js.Any => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
  }
}
