package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGGradientElement
  extends SVGElement
     with SVGURIReference {
  val SVG_SPREADMETHOD_PAD: scala.Double = js.native
  val SVG_SPREADMETHOD_REFLECT: scala.Double = js.native
  val SVG_SPREADMETHOD_REPEAT: scala.Double = js.native
  val SVG_SPREADMETHOD_UNKNOWN: scala.Double = js.native
  val gradientTransform: SVGAnimatedTransformList = js.native
  val gradientUnits: SVGAnimatedEnumeration = js.native
  val spreadMethod: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGGradientElement")
@js.native
object SVGGradientElement
  extends ScalablyTyped.runtime.Instantiable0[SVGGradientElement] {
  val SVG_SPREADMETHOD_PAD: scala.Double = js.native
  val SVG_SPREADMETHOD_REFLECT: scala.Double = js.native
  val SVG_SPREADMETHOD_REPEAT: scala.Double = js.native
  val SVG_SPREADMETHOD_UNKNOWN: scala.Double = js.native
}

