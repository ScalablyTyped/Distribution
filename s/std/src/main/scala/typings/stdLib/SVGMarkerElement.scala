package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGMarkerElement
  extends SVGElement
     with SVGFitToViewBox {
  val SVG_MARKERUNITS_STROKEWIDTH: scala.Double = js.native
  val SVG_MARKERUNITS_UNKNOWN: scala.Double = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: scala.Double = js.native
  val SVG_MARKER_ORIENT_ANGLE: scala.Double = js.native
  val SVG_MARKER_ORIENT_AUTO: scala.Double = js.native
  val SVG_MARKER_ORIENT_UNKNOWN: scala.Double = js.native
  val markerHeight: SVGAnimatedLength = js.native
  val markerUnits: SVGAnimatedEnumeration = js.native
  val markerWidth: SVGAnimatedLength = js.native
  val orientAngle: SVGAnimatedAngle = js.native
  val orientType: SVGAnimatedEnumeration = js.native
  val refX: SVGAnimatedLength = js.native
  val refY: SVGAnimatedLength = js.native
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
  def setOrientToAngle(angle: SVGAngle): scala.Unit = js.native
  def setOrientToAuto(): scala.Unit = js.native
}

@JSGlobal("SVGMarkerElement")
@js.native
object SVGMarkerElement
  extends org.scalablytyped.runtime.Instantiable0[SVGMarkerElement] {
  val SVG_MARKERUNITS_STROKEWIDTH: scala.Double = js.native
  val SVG_MARKERUNITS_UNKNOWN: scala.Double = js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: scala.Double = js.native
  val SVG_MARKER_ORIENT_ANGLE: scala.Double = js.native
  val SVG_MARKER_ORIENT_AUTO: scala.Double = js.native
  val SVG_MARKER_ORIENT_UNKNOWN: scala.Double = js.native
}

