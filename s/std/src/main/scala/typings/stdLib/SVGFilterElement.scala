package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFilterElement
  extends SVGElement
     with SVGURIReference {
  /** @deprecated */
  val filterResX: SVGAnimatedInteger = js.native
  /** @deprecated */
  val filterResY: SVGAnimatedInteger = js.native
  val filterUnits: SVGAnimatedEnumeration = js.native
  val height: SVGAnimatedLength = js.native
  val primitiveUnits: SVGAnimatedEnumeration = js.native
  val width: SVGAnimatedLength = js.native
  val x: SVGAnimatedLength = js.native
  val y: SVGAnimatedLength = js.native
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
  /** @deprecated */
  def setFilterRes(filterResX: scala.Double, filterResY: scala.Double): scala.Unit = js.native
}

@JSGlobal("SVGFilterElement")
@js.native
object SVGFilterElement
  extends ScalablyTyped.runtime.Instantiable0[SVGFilterElement]

