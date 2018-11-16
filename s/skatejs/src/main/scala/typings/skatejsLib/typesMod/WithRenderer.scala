package typings
package skatejsLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "WithRenderer")
@js.native
class WithRenderer[O] ()
  extends stdLib.HTMLElement
     with Renderer[O] {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
       * Returns the first following sibling that
       * is an element, and null otherwise.
       */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
       * Returns the first preceding sibling that
       * is an element, and null otherwise.
       */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[scala.Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[scala.Unit]] = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
  def render(): O = js.native
  def render(props: Mixed): O = js.native
  def render(props: Mixed, state: Mixed): O = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: stdLib.Element, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): scala.Unit = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: stdLib.Node, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): scala.Unit = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: stdLib.ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): scala.Unit = js.native
  def updated(): scala.Unit = js.native
  def updated(props: Mixed): scala.Unit = js.native
  def updated(props: Mixed, state: Mixed): scala.Unit = js.native
}

