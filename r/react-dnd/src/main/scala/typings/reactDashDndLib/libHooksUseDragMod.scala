package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrag", JSImport.Namespace)
@js.native
object libHooksUseDragMod extends js.Object {
  def useDrag[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple3[
    CollectedProps, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragSource, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragPreview
  ] = js.native
}

