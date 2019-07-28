package typings.reactDashDnd.libCommonDragPreviewImageMod

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewImageProps extends js.Object {
  var connect: ConnectDragPreview
  var src: String
}

object DragPreviewImageProps {
  @scala.inline
  def apply(connect: ConnectDragPreview, src: String): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(connect = connect, src = src)
  
    __obj.asInstanceOf[DragPreviewImageProps]
  }
}

