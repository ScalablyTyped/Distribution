package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import typings.std.stdInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feDisplacementMap> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDisplacementMapElement)
  */
@js.native
trait SVGFEDisplacementMapElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_CHANNEL_A: `4` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_B: `3` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_G: `2` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_R: `1` = js.native
  
  /* standard dom */
  val SVG_CHANNEL_UNKNOWN: `0` = js.native
  
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
  
  /* standard dom */
  val scale: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val xChannelSelector: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val yChannelSelector: SVGAnimatedEnumeration = js.native
}
