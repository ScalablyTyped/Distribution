package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDropTargetProps extends js.Object {
  var connectDropTarget: ConnectDropTarget
  var draggedMosaicId: js.UndefOr[String] = js.undefined
  var isOver: Boolean
}

object InternalDropTargetProps {
  @scala.inline
  def apply(connectDropTarget: ConnectDropTarget, isOver: Boolean, draggedMosaicId: String = null): InternalDropTargetProps = {
    val __obj = js.Dynamic.literal(connectDropTarget = connectDropTarget, isOver = isOver)
    if (draggedMosaicId != null) __obj.updateDynamic("draggedMosaicId")(draggedMosaicId)
    __obj.asInstanceOf[InternalDropTargetProps]
  }
}

