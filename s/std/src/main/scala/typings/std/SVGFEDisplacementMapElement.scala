package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feDisplacementMap> element. */
@js.native
trait SVGFEDisplacementMapElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_CHANNEL_A: Double = js.native
  val SVG_CHANNEL_B: Double = js.native
  val SVG_CHANNEL_G: Double = js.native
  val SVG_CHANNEL_R: Double = js.native
  val SVG_CHANNEL_UNKNOWN: Double = js.native
  val in1: SVGAnimatedString = js.native
  val in2: SVGAnimatedString = js.native
  val scale: SVGAnimatedNumber = js.native
  val xChannelSelector: SVGAnimatedEnumeration = js.native
  val yChannelSelector: SVGAnimatedEnumeration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("SVGFEDisplacementMapElement")
@js.native
object SVGFEDisplacementMapElement extends Instantiable0[SVGFEDisplacementMapElement] {
  val SVG_CHANNEL_A: Double = js.native
  val SVG_CHANNEL_B: Double = js.native
  val SVG_CHANNEL_G: Double = js.native
  val SVG_CHANNEL_R: Double = js.native
  val SVG_CHANNEL_UNKNOWN: Double = js.native
}

