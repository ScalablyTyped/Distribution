package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/hooks", JSImport.Namespace)
@js.native
object libCjsHooksMod extends js.Object {
  def useDrag[DragObject /* <: reactDashDndLib.libCjsInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDragPreview[Props](DragPreview: reactLib.reactMod.ReactNs.RefForwardingComponent[reactLib.Element, Props]): js.Tuple2[
    reactLib.reactMod.ReactNs.FC[Props], 
    reactLib.reactMod.ReactNs.RefObject[reactLib.Element]
  ] = js.native
  def useDrop[DragObject, DropResult, CollectedProps](
    spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactLib.reactMod.ReactNs.RefObject[_]] = js.native
}

