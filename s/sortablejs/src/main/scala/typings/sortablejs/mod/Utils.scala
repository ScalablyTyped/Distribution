package typings.sortablejs.mod

import typings.std.CSSStyleDeclaration
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  /**
    * For each element in the set, get the first element that matches the selector by testing the element itself and traversing up through its ancestors in the DOM tree.
    * @param element an HTMLElement.
    * @param selector an element seletor.
    * @param context a specific element's context.
    */
  def closest(element: HTMLElement, selector: String): HTMLElement | Null = js.native
  def closest(element: HTMLElement, selector: String, context: HTMLElement): HTMLElement | Null = js.native
  /**
    * Get the values of all the CSS properties.
    * @param element an HTMLElement.
    */
  def css(element: HTMLElement): CSSStyleDeclaration = js.native
  /**
    * Get the value of style properties.
    * @param element an HTMLElement.
    * @param prop a property key.
    */
  def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 383 */ js.Any */](element: HTMLElement, prop: K): /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any = js.native
  /**
    * Set one CSS property.
    * @param element an HTMLElement.
    * @param prop a property key.
    * @param value a property value.
    */
  def css[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 383 */ js.Any */](
    element: HTMLElement,
    prop: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.CSSStyleDeclaration[K] */ js.Any
  ): Unit = js.native
  /**
    * Get elements by tag name.
    * @param context an HTMLElement.
    * @param tagName A tag name.
    * @param iterator An iterator.
    */
  def find(context: HTMLElement, tagName: String): NodeListOf[HTMLElement] = js.native
  def find(
    context: HTMLElement,
    tagName: String,
    iterator: js.Function2[/* value */ HTMLElement, /* index */ Double, Unit]
  ): NodeListOf[HTMLElement] = js.native
  /**
    * Check the current matched set of elements against a selector.
    * @param element an HTMLElement.
    * @param selector an element selector.
    */
  def is(element: HTMLElement, selector: String): Boolean = js.native
  /**
    * Remove an event handler function
    * @param element an HTMLElement.
    * @param event an Event context.
    * @param fn a callback.
    */
  def off(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
  /**
    * Attach an event handler function
    * @param element an HTMLElement.
    * @param event an Event context.
    * @param fn
    */
  def on(element: HTMLElement, event: String, fn: EventListenerOrEventListenerObject): Unit = js.native
  /**
    * Add or remove one classes from each element
    * @param element an HTMLElement.
    * @param name a class name.
    * @param state a class's state.
    */
  def toggleClass(element: HTMLElement, name: String, state: Boolean): Unit = js.native
}

