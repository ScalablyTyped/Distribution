package typings
package reactDashMosaicDashComponentLib.libMosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalDragSourceProps extends js.Object {
  var connectDragPreview: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview
  var connectDragSource: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource
}

object InternalDragSourceProps {
  @scala.inline
  def apply(
    connectDragPreview: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview,
    connectDragSource: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource
  ): InternalDragSourceProps = {
    val __obj = js.Dynamic.literal(connectDragPreview = connectDragPreview, connectDragSource = connectDragSource)
  
    __obj.asInstanceOf[InternalDragSourceProps]
  }
}

