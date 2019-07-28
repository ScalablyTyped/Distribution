package typings.reactDashDnd

import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import typings.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typings.reactDashDnd.libInterfacesHooksApiMod.DragSourceHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrag", JSImport.Namespace)
@js.native
object libHooksUseDragMod extends js.Object {
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
}

