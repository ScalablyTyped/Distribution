package typings.sortablejs.sortablejsMod

import typings.sortablejs.Anon_Index
import typings.sortablejs.sortablejsStrings.clone
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableEvent extends Event {
  @JSName("clone")
  var clone_FSortableEvent: HTMLElement = js.native
  /**
    * previous list
    */
  var from: HTMLElement = js.native
  /**
    * dragged element
    */
  var item: HTMLElement = js.native
  /**
    * New index within parent, only counting draggable elements
    */
  var newDraggableIndex: js.UndefOr[Double] = js.native
  /**
    * new index within parent
    */
  var newIndex: js.UndefOr[Double] = js.native
  /**
    * When MultiDrag is used to sort, this holds a HTMLElement and newIndex for each item.
    *
    * `oldIndicies[number]` is directly related to `newIndicies[number]`
    *
    * If MultiDrag is not used to sort, this array will be empty.
    */
  var newIndicies: js.Array[Anon_Index] = js.native
  /**
    * Old index within parent, only counting draggable elements
    */
  var oldDraggableIndex: js.UndefOr[Double] = js.native
  /**
    * old index within parent
    */
  var oldIndex: js.UndefOr[Double] = js.native
  /**
    * When MultiDrag is used to sort, this holds a HTMLElement and oldIndex for each item selected.
    *
    * `oldIndicies[number]` is directly related to `newIndicies[number]`
    *
    * If MultiDrag is not used to sort, this array will be empty.
    */
  var oldIndicies: js.Array[Anon_Index] = js.native
  /**
    * Pull mode if dragging into another sortable
    */
  var pullMode: js.UndefOr[clone | Boolean] = js.native
  /** When Swap is used to sort, this will contain the dragging item that was dropped on.*/
  var swapItem: HTMLElement | Null = js.native
  @JSName("target")
  var target_SortableEvent: HTMLElement = js.native
  /**
    * list, in which moved element.
    */
  var to: HTMLElement = js.native
}

