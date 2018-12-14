package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFETurbulenceElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_STITCHTYPE_NOSTITCH: scala.Double = js.native
  val SVG_STITCHTYPE_STITCH: scala.Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: scala.Double = js.native
  val baseFrequencyX: SVGAnimatedNumber = js.native
  val baseFrequencyY: SVGAnimatedNumber = js.native
  val numOctaves: SVGAnimatedInteger = js.native
  val seed: SVGAnimatedNumber = js.native
  val stitchTiles: SVGAnimatedEnumeration = js.native
  val `type`: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGFETurbulenceElement")
@js.native
object SVGFETurbulenceElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFETurbulenceElement] {
  val SVG_STITCHTYPE_NOSTITCH: scala.Double = js.native
  val SVG_STITCHTYPE_STITCH: scala.Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: scala.Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: scala.Double = js.native
}

