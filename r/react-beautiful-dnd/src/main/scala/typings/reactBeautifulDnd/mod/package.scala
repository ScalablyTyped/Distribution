package typings.reactBeautifulDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Announce = js.Function1[/* message */ java.lang.String, scala.Unit]
  type DraggableId = typings.reactBeautifulDnd.mod.Id
  type DroppableId = typings.reactBeautifulDnd.mod.Id
  type Id = java.lang.String
  type OnBeforeCaptureResponder = js.Function1[/* before */ typings.reactBeautifulDnd.mod.BeforeCapture, scala.Unit]
  type OnBeforeDragStartResponder = js.Function1[/* start */ typings.reactBeautifulDnd.mod.DragStart, scala.Unit]
  type OnDragEndResponder = js.Function2[
    /* result */ typings.reactBeautifulDnd.mod.DropResult, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type OnDragStartResponder = js.Function2[
    /* start */ typings.reactBeautifulDnd.mod.DragStart, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type OnDragUpdateResponder = js.Function2[
    /* update */ typings.reactBeautifulDnd.mod.DragUpdate, 
    /* provided */ typings.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type TypeId = typings.reactBeautifulDnd.mod.Id
  type ZIndex = js.UndefOr[typings.csstype.mod.ZIndexProperty]
}
