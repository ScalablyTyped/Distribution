package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEColorMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val `type`: SVGAnimatedEnumeration = js.native
  val values: SVGAnimatedNumberList = js.native
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

@JSGlobal("SVGFEColorMatrixElement")
@js.native
object SVGFEColorMatrixElement
  extends ScalablyTyped.runtime.Instantiable0[SVGFEColorMatrixElement] {
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: scala.Double = js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: scala.Double = js.native
}

