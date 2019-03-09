package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CollectMonitor extends js.Object {
  @JSName("useDragLayer")
  var useDragLayer_Original: Anon_Collect = js.native
  @JSName("useDrag")
  var useDrag_Original: Anon_Spec = js.native
  @JSName("useDrop")
  var useDrop_Original: Anon_SpecCustomProps = js.native
  def useDrag[DragObject, CustomProps](spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, CustomProps]): CustomProps = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDrop[CustomProps](spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[CustomProps]): CustomProps = js.native
}

