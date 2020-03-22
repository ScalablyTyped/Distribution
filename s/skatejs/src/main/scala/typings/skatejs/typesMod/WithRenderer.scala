package typings.skatejs.typesMod

import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.Node
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "WithRenderer")
@js.native
class WithRenderer[O] ()
  extends HTMLElement
     with Renderer[O] {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[Unit]] = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  def render(): O = js.native
  def render(props: Mixed): O = js.native
  def render(props: Mixed, state: Mixed): O = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def updated(): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
}

