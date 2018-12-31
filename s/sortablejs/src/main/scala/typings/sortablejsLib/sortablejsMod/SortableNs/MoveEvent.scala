package typings
package sortablejsLib.sortablejsMod.SortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveEvent
  extends stdLib.Event {
  var dragged: stdLib.HTMLElement = js.native
  var draggedRect: DOMRect = js.native
  var from: stdLib.HTMLElement = js.native
  /**
    * element on which have guided
    */
  var related: stdLib.HTMLElement = js.native
  var relatedRect: DOMRect = js.native
  var to: stdLib.HTMLElement = js.native
  var willInsertAfter: js.UndefOr[scala.Boolean] = js.native
}

