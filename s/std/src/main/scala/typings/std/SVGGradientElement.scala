package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement. */
@js.native
trait SVGGradientElement
  extends SVGElement
     with SVGURIReference {
  val SVG_SPREADMETHOD_PAD: Double = js.native
  val SVG_SPREADMETHOD_REFLECT: Double = js.native
  val SVG_SPREADMETHOD_REPEAT: Double = js.native
  val SVG_SPREADMETHOD_UNKNOWN: Double = js.native
  val gradientTransform: SVGAnimatedTransformList = js.native
  val gradientUnits: SVGAnimatedEnumeration = js.native
  val spreadMethod: SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGGradientElement")
@js.native
object SVGGradientElement extends Instantiable0[SVGGradientElement] {
  val SVG_SPREADMETHOD_PAD: Double = js.native
  val SVG_SPREADMETHOD_REFLECT: Double = js.native
  val SVG_SPREADMETHOD_REPEAT: Double = js.native
  val SVG_SPREADMETHOD_UNKNOWN: Double = js.native
}

