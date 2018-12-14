package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFECompositeElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OUT: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val in2: SVGAnimatedString = js.native
  val k1: SVGAnimatedNumber = js.native
  val k2: SVGAnimatedNumber = js.native
  val k3: SVGAnimatedNumber = js.native
  val k4: SVGAnimatedNumber = js.native
  val operator: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGFECompositeElement")
@js.native
object SVGFECompositeElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFECompositeElement] {
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OUT: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: scala.Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: scala.Double = js.native
}

