package typings
package sortablejsLib.sortablejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sortable extends js.Object {
  var el: stdLib.HTMLElement = js.native
  var options: sortablejsLib.sortablejsMod.SortableNs.Options = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       * @param element an HTMLElement or selector string.
       * @param selector default: `options.draggable`
       */
  def closest(element: stdLib.HTMLElement): stdLib.HTMLElement | scala.Null = js.native
  /**
       * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
       * @param element an HTMLElement or selector string.
       * @param selector default: `options.draggable`
       */
  def closest(element: stdLib.HTMLElement, selector: java.lang.String): stdLib.HTMLElement | scala.Null = js.native
  /**
       * Removes the sortable functionality completely.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Saving and restoring of the sort.
       */
  def save(): scala.Unit = js.native
  /**
       * Sorts the elements according to the array.
       * @param order an array of strings to sort.
       */
  def sort(order: js.Array[java.lang.String]): scala.Unit = js.native
  /**
       * Serializes the sortable's item data-id's (dataIdAttr option) into an array of string.
       */
  def toArray(): js.Array[java.lang.String] = js.native
}

