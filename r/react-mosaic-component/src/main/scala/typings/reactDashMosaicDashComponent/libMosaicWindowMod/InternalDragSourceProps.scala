package typings.reactDashMosaicDashComponent.libMosaicWindowMod

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDragSourceProps extends js.Object {
  var connectDragPreview: ConnectDragPreview
  var connectDragSource: ConnectDragSource
}

object InternalDragSourceProps {
  @scala.inline
  def apply(connectDragPreview: ConnectDragPreview, connectDragSource: ConnectDragSource): InternalDragSourceProps = {
    val __obj = js.Dynamic.literal(connectDragPreview = connectDragPreview, connectDragSource = connectDragSource)
  
    __obj.asInstanceOf[InternalDragSourceProps]
  }
}

