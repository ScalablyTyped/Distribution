package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFEBlendElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FEBLEND_MODE_COLOR: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_BURN: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_DODGE: scala.Double = js.native
  val SVG_FEBLEND_MODE_DARKEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_DIFFERENCE: scala.Double = js.native
  val SVG_FEBLEND_MODE_EXCLUSION: scala.Double = js.native
  val SVG_FEBLEND_MODE_HARD_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_HUE: scala.Double = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_LUMINOSITY: scala.Double = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: scala.Double = js.native
  val SVG_FEBLEND_MODE_NORMAL: scala.Double = js.native
  val SVG_FEBLEND_MODE_OVERLAY: scala.Double = js.native
  val SVG_FEBLEND_MODE_SATURATION: scala.Double = js.native
  val SVG_FEBLEND_MODE_SCREEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: scala.Double = js.native
  val in1: SVGAnimatedString = js.native
  val in2: SVGAnimatedString = js.native
  val mode: SVGAnimatedEnumeration = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("SVGFEBlendElement")
@js.native
object SVGFEBlendElement
  extends org.scalablytyped.runtime.Instantiable0[SVGFEBlendElement] {
  val SVG_FEBLEND_MODE_COLOR: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_BURN: scala.Double = js.native
  val SVG_FEBLEND_MODE_COLOR_DODGE: scala.Double = js.native
  val SVG_FEBLEND_MODE_DARKEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_DIFFERENCE: scala.Double = js.native
  val SVG_FEBLEND_MODE_EXCLUSION: scala.Double = js.native
  val SVG_FEBLEND_MODE_HARD_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_HUE: scala.Double = js.native
  val SVG_FEBLEND_MODE_LIGHTEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_LUMINOSITY: scala.Double = js.native
  val SVG_FEBLEND_MODE_MULTIPLY: scala.Double = js.native
  val SVG_FEBLEND_MODE_NORMAL: scala.Double = js.native
  val SVG_FEBLEND_MODE_OVERLAY: scala.Double = js.native
  val SVG_FEBLEND_MODE_SATURATION: scala.Double = js.native
  val SVG_FEBLEND_MODE_SCREEN: scala.Double = js.native
  val SVG_FEBLEND_MODE_SOFT_LIGHT: scala.Double = js.native
  val SVG_FEBLEND_MODE_UNKNOWN: scala.Double = js.native
}

