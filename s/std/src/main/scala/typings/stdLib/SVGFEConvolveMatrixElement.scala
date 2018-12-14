package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEConvolveMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_EDGEMODE_DUPLICATE: scala.Double = js.native
  val SVG_EDGEMODE_NONE: scala.Double = js.native
  val SVG_EDGEMODE_UNKNOWN: scala.Double = js.native
  val SVG_EDGEMODE_WRAP: scala.Double = js.native
  val bias: SVGAnimatedNumber = js.native
  val divisor: SVGAnimatedNumber = js.native
  val edgeMode: SVGAnimatedEnumeration = js.native
  val in1: SVGAnimatedString = js.native
  val kernelMatrix: SVGAnimatedNumberList = js.native
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  val orderX: SVGAnimatedInteger = js.native
  val orderY: SVGAnimatedInteger = js.native
  val preserveAlpha: SVGAnimatedBoolean = js.native
  val targetX: SVGAnimatedInteger = js.native
  val targetY: SVGAnimatedInteger = js.native
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

@JSGlobal("SVGFEConvolveMatrixElement")
@js.native
object SVGFEConvolveMatrixElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEConvolveMatrixElement] {
  val SVG_EDGEMODE_DUPLICATE: scala.Double = js.native
  val SVG_EDGEMODE_NONE: scala.Double = js.native
  val SVG_EDGEMODE_UNKNOWN: scala.Double = js.native
  val SVG_EDGEMODE_WRAP: scala.Double = js.native
}

