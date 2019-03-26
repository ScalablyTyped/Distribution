package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_UseDrag extends js.Object {
  @JSName("useDragLayer")
  var useDragLayer_Original: Anon_Collect = js.native
  @JSName("useDrag")
  var useDrag_Original: Anon_Spec = js.native
  @JSName("useDrop")
  var useDrop_Original: Anon_SpecCollectedProps = js.native
  def useDrag[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple3[
    CollectedProps, 
    reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragSource, 
    reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDragPreview
  ] = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDrop[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactDashDndLib.libCjsInterfacesClassApiMod.ConnectDropTarget] = js.native
}

