package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/hooks", JSImport.Namespace)
@js.native
object libCjsHooksMod extends js.Object {
  def useDrag[DragObject, CustomProps](spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DragSourceHookSpec[DragObject, CustomProps]): CustomProps = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libCjsInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDrop[CustomProps](spec: reactDashDndLib.libCjsInterfacesHooksApiMod.DropTargetHookSpec[CustomProps]): CustomProps = js.native
}

