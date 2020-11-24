package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feBlend> element. */
@js.native
trait SVGFEBlendElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  val SVG_FEBLEND_MODE_COLOR: Double = js.native
  
  val SVG_FEBLEND_MODE_COLOR_BURN: Double = js.native
  
  val SVG_FEBLEND_MODE_COLOR_DODGE: Double = js.native
  
  val SVG_FEBLEND_MODE_DARKEN: Double = js.native
  
  val SVG_FEBLEND_MODE_DIFFERENCE: Double = js.native
  
  val SVG_FEBLEND_MODE_EXCLUSION: Double = js.native
  
  val SVG_FEBLEND_MODE_HARD_LIGHT: Double = js.native
  
  val SVG_FEBLEND_MODE_HUE: Double = js.native
  
  val SVG_FEBLEND_MODE_LIGHTEN: Double = js.native
  
  val SVG_FEBLEND_MODE_LUMINOSITY: Double = js.native
  
  val SVG_FEBLEND_MODE_MULTIPLY: Double = js.native
  
  val SVG_FEBLEND_MODE_NORMAL: Double = js.native
  
  val SVG_FEBLEND_MODE_OVERLAY: Double = js.native
  
  val SVG_FEBLEND_MODE_SATURATION: Double = js.native
  
  val SVG_FEBLEND_MODE_SCREEN: Double = js.native
  
  val SVG_FEBLEND_MODE_SOFT_LIGHT: Double = js.native
  
  val SVG_FEBLEND_MODE_UNKNOWN: Double = js.native
  
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
  
  val in1: SVGAnimatedString = js.native
  
  val in2: SVGAnimatedString = js.native
  
  val mode: SVGAnimatedEnumeration = js.native
  
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
