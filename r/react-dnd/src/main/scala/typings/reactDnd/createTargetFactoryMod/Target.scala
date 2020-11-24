package typings.reactDnd.createTargetFactoryMod

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends DropTarget {
  
  def receiveMonitor(monitor: js.Any): Unit = js.native
  
  def receiveProps(props: js.Any): Unit = js.native
}
object Target {
  
  @scala.inline
  def apply(
    canDrop: (DragDropMonitor, Identifier) => Boolean,
    drop: (DragDropMonitor, Identifier) => js.Any,
    hover: (DragDropMonitor, Identifier) => Unit,
    receiveMonitor: js.Any => Unit,
    receiveProps: js.Any => Unit
  ): Target = {
    val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover), receiveMonitor = js.Any.fromFunction1(receiveMonitor), receiveProps = js.Any.fromFunction1(receiveProps))
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def setReceiveMonitor(value: js.Any => Unit): Self = this.set("receiveMonitor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReceiveProps(value: js.Any => Unit): Self = this.set("receiveProps", js.Any.fromFunction1(value))
  }
}
