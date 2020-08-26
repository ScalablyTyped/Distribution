package typings.reactDnd.interfacesMod

import typings.reactDnd.connectorsMod.ConnectDropTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetConnector extends js.Object {
  /**
    * Returns a function that must be used inside the component to assign the drop target role to a node.
    * By returning { connectDropTarget: connect.dropTarget() } from your collecting function, you can mark any React element
    * as the droppable node. To do that, replace any element with this.props.connectDropTarget(element) inside the render function.
    */
  def dropTarget(): ConnectDropTarget = js.native
}

object DropTargetConnector {
  @scala.inline
  def apply(dropTarget: () => ConnectDropTarget): DropTargetConnector = {
    val __obj = js.Dynamic.literal(dropTarget = js.Any.fromFunction0(dropTarget))
    __obj.asInstanceOf[DropTargetConnector]
  }
  @scala.inline
  implicit class DropTargetConnectorOps[Self <: DropTargetConnector] (val x: Self) extends AnyVal {
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
    def setDropTarget(value: () => ConnectDropTarget): Self = this.set("dropTarget", js.Any.fromFunction0(value))
  }
  
}

