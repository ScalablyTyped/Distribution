package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** HTMLOptionsCollection is an interface representing a collection of HTML option elements (in document order) and offers methods and properties for traversing the list as well as optionally altering its items. This type is returned solely by the "options" property of select. */
@js.native
trait HTMLOptionsCollection extends HTMLCollectionOf[HTMLOptionElement] {
  /**
    * Returns the index of the first selected item, if any, or −1 if there is no selected
    * item.
    * Can be set, to change the selection.
    */
  var selectedIndex: scala.Double = js.native
  def add(element: HTMLOptGroupElement): scala.Unit = js.native
  def add(element: HTMLOptGroupElement, before: scala.Double): scala.Unit = js.native
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
  def add(element: HTMLOptionElement, before: scala.Double): scala.Unit = js.native
  def add(element: HTMLOptionElement, before: HTMLElement): scala.Unit = js.native
  /**
    * Removes the item with index index from the collection.
    */
  def remove(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("HTMLOptionsCollection")
@js.native
class HTMLOptionsCollectionCls () extends HTMLOptionsCollection {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[Element]] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator_HTMLCollectionOf: js.Function0[IterableIterator[HTMLOptionElement]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  /* CompleteClass */
  override val length: scala.Double = js.native
  /**
    * Retrieves an object from various collections.
    */
  /* CompleteClass */
  override def item(index: scala.Double): Element | scala.Null = js.native
  /* CompleteClass */
  override def namedItem(name: java.lang.String): HTMLOptionElement | scala.Null = js.native
}

@JSGlobal("HTMLOptionsCollection")
@js.native
object HTMLOptionsCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLOptionsCollection]

