package typings.reactDashDnd

import typings.react.reactMod.ReactElement
import typings.react.reactMod.RefObject
import typings.reactDashDnd.libInterfacesConnectorsMod.ConnectableElement
import typings.reactDashDnd.libInterfacesConnectorsMod.DragElementWrapper
import typings.reactDashDnd.libInterfacesOptionsMod.DragPreviewOptions
import typings.reactDashDnd.libInterfacesOptionsMod.DragSourceOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/interfaces/connectors", JSImport.Namespace)
@js.native
object libInterfacesConnectorsMod extends js.Object {
  type ConnectDragPreview = DragElementWrapper[DragPreviewOptions]
  type ConnectDragSource = DragElementWrapper[DragSourceOptions]
  type ConnectDropTarget = DragElementWrapper[js.Any]
  type ConnectableElement = RefObject[js.Any] | ReactElement | Element | Null
  type DragElementWrapper[Options] = js.Function2[
    /* elementOrNode */ ConnectableElement, 
    /* options */ js.UndefOr[Options], 
    ReactElement | Null
  ]
}

