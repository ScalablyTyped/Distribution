package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feSpecularLighting> element. */
@js.native
trait SVGFESpecularLightingElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val in1: SVGAnimatedString = js.native
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  val specularConstant: SVGAnimatedNumber = js.native
  val specularExponent: SVGAnimatedNumber = js.native
  val surfaceScale: SVGAnimatedNumber = js.native
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
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

