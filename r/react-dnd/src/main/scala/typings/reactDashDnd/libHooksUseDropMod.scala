package typings.reactDashDnd

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typings.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typings.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrop", JSImport.Namespace)
@js.native
object libHooksUseDropMod extends js.Object {
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

