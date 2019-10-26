package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.react.reactMod.ReactElement
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typings.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import typings.reactDashDnd.libInterfacesOptionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDragSourceProps extends js.Object {
  var connectDragPreview: ConnectDragPreview
  var connectDragSource: ConnectDragSource
}

object InternalDragSourceProps {
  @scala.inline
  def apply(
    connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
  ): InternalDragSourceProps = {
    val __obj = js.Dynamic.literal(connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource))
  
    __obj.asInstanceOf[InternalDragSourceProps]
  }
}

