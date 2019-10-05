package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.react.reactMod.ReactElement
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
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
  def apply(
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    isOver: Boolean,
    draggedMosaicId: String = null
  ): InternalDropTargetProps = {
    val __obj = js.Dynamic.literal(connectDropTarget = js.Any.fromFunction2(connectDropTarget), isOver = isOver)
    if (draggedMosaicId != null) __obj.updateDynamic("draggedMosaicId")(draggedMosaicId)
    __obj.asInstanceOf[InternalDropTargetProps]
  }
}

