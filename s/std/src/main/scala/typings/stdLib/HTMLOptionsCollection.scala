package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOptionsCollection extends HTMLCollectionOf[HTMLOptionElement] {
  /**
       * Returns the index of the first selected item, if any, or −1 if there is no selected
       * item.
       * Can be set, to change the selection.
       */
  var selectedIndex: scala.Double = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptGroupElement): scala.Unit = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptGroupElement, before: scala.Double): scala.Unit = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptGroupElement, before: HTMLElement): scala.Unit = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptionElement): scala.Unit = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptionElement, before: scala.Double): scala.Unit = js.native
  /**
       * Inserts element before the node given by before.
       * The before argument can be a number, in which case element is inserted before the item with that number, or an element from the
       * collection, in which case element is inserted before that element.
       * If before is omitted, null, or a number out of range, then element will be added at the end of the list.
       * This method will throw a "HierarchyRequestError" DOMException if
       * element is an ancestor of the element into which it is to be inserted.
       */
  def add(element: HTMLOptionElement, before: HTMLElement): scala.Unit = js.native
  /**
       * Removes the item with index index from the collection.
       */
  def remove(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("HTMLOptionsCollection")
@js.native
object HTMLOptionsCollection
  extends ScalablyTyped.runtime.Instantiable0[HTMLOptionsCollection]

