package typings
package reactDashDndLib.libCommonDragPreviewImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewImageProps extends js.Object {
  var connect: reactDashDndLib.libInterfacesConnectorsMod.ConnectDragPreview
  var src: java.lang.String
}

object DragPreviewImageProps {
  @scala.inline
  def apply(connect: reactDashDndLib.libInterfacesConnectorsMod.ConnectDragPreview, src: java.lang.String): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(connect = connect, src = src)
  
    __obj.asInstanceOf[DragPreviewImageProps]
  }
}

