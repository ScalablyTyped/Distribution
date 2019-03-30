package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGFEGaussianBlurElement interface corresponds to the <feGaussianBlur> element. */
@js.native
trait SVGFEGaussianBlurElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val in1: SVGAnimatedString = js.native
  val stdDeviationX: SVGAnimatedNumber = js.native
  val stdDeviationY: SVGAnimatedNumber = js.native
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
  def setStdDeviation(stdDeviationX: scala.Double, stdDeviationY: scala.Double): scala.Unit = js.native
}

@JSGlobal("SVGFEGaussianBlurElement")
@js.native
class SVGFEGaussianBlurElementCls () extends SVGFEGaussianBlurElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override val height: SVGAnimatedLength = js.native
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
  override val result: SVGAnimatedString = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val width: SVGAnimatedLength = js.native
  /* CompleteClass */
  override val x: SVGAnimatedLength = js.native
  /* CompleteClass */
  override val y: SVGAnimatedLength = js.native
}

@JSGlobal("SVGFEGaussianBlurElement")
@js.native
object SVGFEGaussianBlurElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEGaussianBlurElement]

