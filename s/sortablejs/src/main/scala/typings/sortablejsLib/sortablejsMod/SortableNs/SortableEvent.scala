package typings
package sortablejsLib.sortablejsMod.SortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvent
  extends stdLib.Event {
  @JSName("clone")
  var clone_FSortableEvent: stdLib.HTMLElement = js.native
  /**
    * previous list
    */
  var from: stdLib.HTMLElement = js.native
  /**
    * dragged element
    */
  var item: stdLib.HTMLElement = js.native
  /**
    * new index within parent
    */
  var newIndex: js.UndefOr[scala.Double] = js.native
  /**
    * old index within parent
    */
  var oldIndex: js.UndefOr[scala.Double] = js.native
  @JSName("target")
  var target_SortableEvent: stdLib.HTMLElement = js.native
  /**
    * list, in which moved element.
    */
  var to: stdLib.HTMLElement = js.native
}

