package typings
package reactDashMosaicDashComponentLib.libMosaicWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalDragSourceProps extends js.Object {
  @JSName("connectDragPreview")
  var connectDragPreview_Original: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview = js.native
  @JSName("connectDragSource")
  var connectDragSource_Original: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource = js.native
  def connectDragPreview[Props](elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectedElement): reactLib.reactMod.ReactNs.ReactElement[Props] = js.native
  def connectDragPreview[Props](
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectedElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions
  ): reactLib.reactMod.ReactNs.ReactElement[Props] = js.native
  def connectDragSource[Props](elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectedElement): reactLib.reactMod.ReactNs.ReactElement[Props] = js.native
  def connectDragSource[Props](
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectedElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions
  ): reactLib.reactMod.ReactNs.ReactElement[Props] = js.native
}

