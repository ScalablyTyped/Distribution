package typings
package reactDashBeautifulDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBeautifulDashDndMod {
  type Announce = js.Function1[/* message */ java.lang.String, scala.Unit]
  type DraggableId = Id
  type DroppableId = Id
  type Id = java.lang.String
  type OnBeforeDragStartResponder = js.Function1[/* start */ DragStart, scala.Unit]
  type OnDragEndResponder = js.Function2[/* result */ DropResult, /* provided */ ResponderProvided, scala.Unit]
  type OnDragStartResponder = js.Function2[/* start */ DragStart, /* provided */ ResponderProvided, scala.Unit]
  type OnDragUpdateResponder = js.Function2[/* update */ DragUpdate, /* provided */ ResponderProvided, scala.Unit]
  type TypeId = Id
  type ZIndex = js.UndefOr[csstypeLib.csstypeMod.ZIndexProperty]
}
