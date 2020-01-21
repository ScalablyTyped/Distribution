package typings.reactDnd

import typings.react.mod.ReactElement
import typings.react.mod.RefObject
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/interfaces/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
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

