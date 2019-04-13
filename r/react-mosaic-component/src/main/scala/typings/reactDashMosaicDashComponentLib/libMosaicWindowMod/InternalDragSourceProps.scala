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
  def connectDragPreview(elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def connectDragPreview(
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragPreviewOptions
  ): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def connectDragSource(elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
  def connectDragSource(
    elementOrNode: reactDashDndLib.libCjsInterfacesClassApiMod.ConnectableElement,
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DragSourceOptions
  ): reactLib.reactMod.ReactElement[_] | scala.Null = js.native
}

