package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGPolylineElement interface provides access to the properties of <polyline> elements, as well as methods to manipulate them. */
@js.native
trait SVGPolylineElement
  extends SVGGraphicsElement
     with SVGAnimatedPoints {
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

@JSGlobal("SVGPolylineElement")
@js.native
class SVGPolylineElementCls () extends SVGPolylineElement {
  /* CompleteClass */
  override val animatedPoints: SVGPointList = js.native
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val points: SVGPointList = js.native
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

@JSGlobal("SVGPolylineElement")
@js.native
object SVGPolylineElement
  extends org.scalablytyped.runtime.Instantiable0[SVGPolylineElement]

