package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrop", JSImport.Namespace)
@js.native
object libHooksUseDropMod extends js.Object {
  def useDrop[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactDashDndLib.libInterfacesConnectorsMod.ConnectDropTarget] = js.native
}

