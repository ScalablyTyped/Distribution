package typings.reactDashDnd.libDecoratorsCreateSourceFactoryMod

import typings.dndDashCore.libInterfacesMod.DragDropMonitor
import typings.dndDashCore.libInterfacesMod.DragSource
import typings.dndDashCore.libInterfacesMod.Identifier
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

