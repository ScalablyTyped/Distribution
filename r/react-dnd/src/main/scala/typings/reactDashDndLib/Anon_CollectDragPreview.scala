package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CollectDragPreview extends js.Object {
  @JSName("useDragLayer")
  var useDragLayer_Original: Anon_Collect = js.native
  @JSName("useDragPreview")
  var useDragPreview_Original: Anon_DragPreview = js.native
  @JSName("useDrag")
  var useDrag_Original: Anon_Spec = js.native
  @JSName("useDrop")
  var useDrop_Original: Anon_SpecAny = js.native
  def useDrag[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDragPreview[Props](DragPreview: reactLib.reactMod.ReactNs.RefForwardingComponent[stdLib.Element, Props]): js.Tuple2[
    reactLib.reactMod.ReactNs.FC[Props], 
    reactLib.reactMod.ReactNs.RefObject[stdLib.Element]
  ] = js.native
  def useDrop[DragObject, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
}

