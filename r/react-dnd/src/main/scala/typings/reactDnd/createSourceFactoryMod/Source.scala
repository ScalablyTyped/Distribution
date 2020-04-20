package typings.reactDnd.createSourceFactoryMod

import typings.dndCore.interfacesMod.DragDropMonitor
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends DragSource {
  def receiveProps(props: js.Any): Unit
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
}

