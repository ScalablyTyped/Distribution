package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLElement interface represents any HTML element. Some elements directly implement this interface, others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends Element
     with GlobalEventHandlers
     with DocumentAndElementEventHandlers
     with ElementContentEditable
     with HTMLOrSVGElement
     with ElementCSSInlineStyle {
  var accessKey: java.lang.String = js.native
  val accessKeyLabel: java.lang.String = js.native
  var autocapitalize: java.lang.String = js.native
  var dir: java.lang.String = js.native
  var draggable: scala.Boolean = js.native
  var hidden: scala.Boolean = js.native
  var innerText: java.lang.String = js.native
  var lang: java.lang.String = js.native
  val offsetHeight: scala.Double = js.native
  val offsetLeft: scala.Double = js.native
  val offsetParent: Element | scala.Null = js.native
  val offsetTop: scala.Double = js.native
  val offsetWidth: scala.Double = js.native
  var spellcheck: scala.Boolean = js.native
  var title: java.lang.String = js.native
  var translate: scala.Boolean = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def click(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("HTMLElement")
@js.native
class HTMLElementCls () extends HTMLElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
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
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLElement")
@js.native
object HTMLElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLElement]

