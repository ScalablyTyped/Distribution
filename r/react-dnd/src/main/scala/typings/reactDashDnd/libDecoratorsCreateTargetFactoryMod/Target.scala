package typings.reactDashDnd.libDecoratorsCreateTargetFactoryMod

import typings.dndDashCore.libInterfacesMod.DragDropMonitor
import typings.dndDashCore.libInterfacesMod.DropTarget
import typings.dndDashCore.libInterfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends DropTarget {
  def receiveMonitor(monitor: js.Any): Unit
  def receiveProps(props: js.Any): Unit
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
}

