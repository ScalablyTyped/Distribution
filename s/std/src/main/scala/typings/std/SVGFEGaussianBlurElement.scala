package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feGaussianBlur> element. */
@js.native
trait SVGFEGaussianBlurElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val in1: SVGAnimatedString = js.native
  val stdDeviationX: SVGAnimatedNumber = js.native
  val stdDeviationY: SVGAnimatedNumber = js.native
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
  def setStdDeviation(stdDeviationX: Double, stdDeviationY: Double): Unit = js.native
}

@JSGlobal("SVGFEGaussianBlurElement")
@js.native
object SVGFEGaussianBlurElement extends Instantiable0[SVGFEGaussianBlurElement]

