package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEBlendElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FEBLEND_MODE_COLOR: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_BURN: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_DODGE: scala.Double = js.native
  val SVG_FEBLEND_MODE_DARKEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_DIFFERENCE: scala.Double = js.native
  val SVG_FEBLEND_MODE_EXCLUSION: scala.Double = js.native
  val SVG_FEBLEND_MODE_HARD_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_HUE: scala.Double = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_LUMINOSITY: scala.Double = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: scala.Double = js.native
  val SVG_FEBLEND_MODE_NORMAL: scala.Double = js.native
  val SVG_FEBLEND_MODE_OVERLAY: scala.Double = js.native
  val SVG_FEBLEND_MODE_SATURATION: scala.Double = js.native
  val SVG_FEBLEND_MODE_SCREEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val in2: SVGAnimatedString = js.native
  val mode: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGFEBlendElement")
@js.native
class SVGFEBlendElementCls () extends SVGFEBlendElement {
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

@JSGlobal("SVGFEBlendElement")
@js.native
object SVGFEBlendElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEBlendElement] {
  val SVG_FEBLEND_MODE_COLOR: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_BURN: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_DODGE: scala.Double = js.native
  val SVG_FEBLEND_MODE_DARKEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_DIFFERENCE: scala.Double = js.native
  val SVG_FEBLEND_MODE_EXCLUSION: scala.Double = js.native
  val SVG_FEBLEND_MODE_HARD_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_HUE: scala.Double = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_LUMINOSITY: scala.Double = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: scala.Double = js.native
  val SVG_FEBLEND_MODE_NORMAL: scala.Double = js.native
  val SVG_FEBLEND_MODE_OVERLAY: scala.Double = js.native
  val SVG_FEBLEND_MODE_SATURATION: scala.Double = js.native
  val SVG_FEBLEND_MODE_SCREEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: scala.Double = js.native
}

