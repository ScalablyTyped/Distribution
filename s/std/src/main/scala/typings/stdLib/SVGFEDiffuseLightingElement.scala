package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEDiffuseLightingElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val diffuseConstant: SVGAnimatedNumber = js.native
  val in1: SVGAnimatedString = js.native
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  val surfaceScale: SVGAnimatedNumber = js.native
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

@JSGlobal("SVGFEDiffuseLightingElement")
@js.native
object SVGFEDiffuseLightingElement
  extends ScalablyTyped.runtime.Instantiable0[SVGFEDiffuseLightingElement]

