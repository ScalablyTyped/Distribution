package typings.reactDashBeautifulDashDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBeautifulDashDndMod {
  import typings.csstype.csstypeMod.ZIndexProperty

  type Announce = js.Function1[/* message */ String, Unit]
  type DraggableId = Id
  type DroppableId = Id
  type Id = String
  type OnBeforeDragStartResponder = js.Function1[/* start */ DragStart, Unit]
  type OnDragEndResponder = js.Function2[/* result */ DropResult, /* provided */ ResponderProvided, Unit]
  type OnDragStartResponder = js.Function2[/* start */ DragStart, /* provided */ ResponderProvided, Unit]
  type OnDragUpdateResponder = js.Function2[/* update */ DragUpdate, /* provided */ ResponderProvided, Unit]
  type TypeId = Id
  type ZIndex = js.UndefOr[ZIndexProperty]
}
