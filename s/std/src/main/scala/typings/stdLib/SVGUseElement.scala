package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGUseElement interface corresponds to the <use> element. */
@js.native
trait SVGUseElement
  extends SVGGraphicsElement
     with SVGURIReference {
  val animatedInstanceRoot: SVGElementInstance | scala.Null = js.native
  val height: SVGAnimatedLength = js.native
  val instanceRoot: SVGElementInstance | scala.Null = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
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

@JSGlobal("SVGUseElement")
@js.native
class SVGUseElementCls () extends SVGUseElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override val href: SVGAnimatedString = js.native
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
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
}

@JSGlobal("SVGUseElement")
@js.native
object SVGUseElement
  extends org.scalablytyped.runtime.Instantiable0[SVGUseElement]

