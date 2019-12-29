package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feColorMatrix> element. */
@js.native
trait SVGFEColorMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
  val in1: SVGAnimatedString = js.native
  val `type`: SVGAnimatedEnumeration = js.native
  val values: SVGAnimatedNumberList = js.native
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

@JSGlobal("SVGFEColorMatrixElement")
@js.native
object SVGFEColorMatrixElement extends Instantiable0[SVGFEColorMatrixElement] {
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
}

