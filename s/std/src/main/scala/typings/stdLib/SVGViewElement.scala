package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGViewElement
  extends SVGElement
     with SVGFitToViewBox
     with SVGZoomAndPan {
  /** @deprecated */
  val viewTarget: SVGStringList = js.native
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

@JSGlobal("SVGViewElement")
@js.native
class SVGViewElementCls () extends SVGViewElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val preserveAspectRatio: SVGAnimatedPreserveAspectRatio = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val viewBox: SVGAnimatedRect = js.native
  /* CompleteClass */
  override val zoomAndPan: scala.Double = js.native
}

@JSGlobal("SVGViewElement")
@js.native
object SVGViewElement
  extends org.scalablytyped.runtime.Instantiable0[SVGViewElement] {
  val SVG_ZOOMANDPAN_DISABLE: scala.Double = js.native
  val SVG_ZOOMANDPAN_MAGNIFY: scala.Double = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: scala.Double = js.native
}

