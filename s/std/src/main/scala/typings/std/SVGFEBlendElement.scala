package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`10`
import typings.std.stdInts.`11`
import typings.std.stdInts.`12`
import typings.std.stdInts.`13`
import typings.std.stdInts.`14`
import typings.std.stdInts.`15`
import typings.std.stdInts.`16`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import typings.std.stdInts.`5`
import typings.std.stdInts.`6`
import typings.std.stdInts.`7`
import typings.std.stdInts.`8`
import typings.std.stdInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feBlend> element. */
@js.native
trait SVGFEBlendElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR: `15` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR_BURN: `8` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_COLOR_DODGE: `7` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_DARKEN: `4` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_DIFFERENCE: `11` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_EXCLUSION: `12` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_HARD_LIGHT: `9` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_HUE: `13` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_LIGHTEN: `5` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_LUMINOSITY: `16` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_MULTIPLY: `2` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_NORMAL: `1` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_OVERLAY: `6` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SATURATION: `14` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SCREEN: `3` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_SOFT_LIGHT: `10` = js.native
  
  /* standard dom */
  val SVG_FEBLEND_MODE_UNKNOWN: `0` = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val in1: SVGAnimatedString = js.native
  
  /* standard dom */
  val in2: SVGAnimatedString = js.native
  
  /* standard dom */
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
