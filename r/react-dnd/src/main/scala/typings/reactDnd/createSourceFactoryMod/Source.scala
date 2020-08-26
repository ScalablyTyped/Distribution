package typings.reactDnd.createSourceFactoryMod

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends DragSource {
  def receiveProps(props: js.Any): Unit = js.native
}

object Source {
  @scala.inline
  def apply(
    beginDrag: (DragDropMonitor, Identifier) => Unit,
    canDrag: (DragDropMonitor, Identifier) => Boolean,
    endDrag: (DragDropMonitor, Identifier) => Unit,
    isDragging: (DragDropMonitor, Identifier) => Boolean,
    receiveProps: js.Any => Unit
  ): Source = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2(beginDrag), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2(endDrag), isDragging = js.Any.fromFunction2(isDragging), receiveProps = js.Any.fromFunction1(receiveProps))
    __obj.asInstanceOf[Source]
  }
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
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
    def setReceiveProps(value: js.Any => Unit): Self = this.set("receiveProps", js.Any.fromFunction1(value))
  }
  
}

