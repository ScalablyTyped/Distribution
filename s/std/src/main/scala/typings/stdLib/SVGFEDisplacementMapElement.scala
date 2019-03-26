package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEDisplacementMapElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_CHANNEL_A: scala.Double = js.native
  val SVG_CHANNEL_B: scala.Double = js.native
  val SVG_CHANNEL_G: scala.Double = js.native
  val SVG_CHANNEL_R: scala.Double = js.native
  val SVG_CHANNEL_UNKNOWN: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val in2: SVGAnimatedString = js.native
  val scale: SVGAnimatedNumber = js.native
  val xChannelSelector: SVGAnimatedEnumeration = js.native
  val yChannelSelector: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGFEDisplacementMapElement")
@js.native
class SVGFEDisplacementMapElementCls () extends SVGFEDisplacementMapElement {
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

@JSGlobal("SVGFEDisplacementMapElement")
@js.native
object SVGFEDisplacementMapElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEDisplacementMapElement] {
  val SVG_CHANNEL_A: scala.Double = js.native
  val SVG_CHANNEL_B: scala.Double = js.native
  val SVG_CHANNEL_G: scala.Double = js.native
  val SVG_CHANNEL_R: scala.Double = js.native
  val SVG_CHANNEL_UNKNOWN: scala.Double = js.native
}

