package typings
package reactDashMosaicDashComponentLib.libMosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDropTargetProps extends js.Object {
  var connectDropTarget: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget
  var draggedMosaicId: js.UndefOr[java.lang.String] = js.undefined
  var isOver: scala.Boolean
}

object InternalDropTargetProps {
  @scala.inline
  def apply(
    connectDropTarget: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget,
    isOver: scala.Boolean,
    draggedMosaicId: java.lang.String = null
  ): InternalDropTargetProps = {
    val __obj = js.Dynamic.literal(connectDropTarget = connectDropTarget, isOver = isOver)
    if (draggedMosaicId != null) __obj.updateDynamic("draggedMosaicId")(draggedMosaicId)
    __obj.asInstanceOf[InternalDropTargetProps]
  }
}

