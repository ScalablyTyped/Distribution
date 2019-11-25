package typings.reactDashDnd.libCommonDragPreviewImageMod

import typings.react.reactMod.ReactElement
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typings.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPreviewImageProps extends js.Object {
  var connect: ConnectDragPreview
  var src: String
}

object DragPreviewImageProps {
  @scala.inline
  def apply(
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    src: String
  ): DragPreviewImageProps = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DragPreviewImageProps]
  }
}

