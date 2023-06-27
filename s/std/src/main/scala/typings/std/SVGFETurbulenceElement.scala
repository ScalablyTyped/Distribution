package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feTurbulence> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFETurbulenceElement)
  */
@js.native
trait SVGFETurbulenceElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_STITCHTYPE_NOSTITCH: `2` = js.native
  
  /* standard dom */
  val SVG_STITCHTYPE_STITCH: `1` = js.native
  
  /* standard dom */
  val SVG_STITCHTYPE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: `1` = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_TURBULENCE: `2` = js.native
  
  /* standard dom */
  val SVG_TURBULENCE_TYPE_UNKNOWN: `0` = js.native
  
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
  val baseFrequencyX: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val baseFrequencyY: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val numOctaves: SVGAnimatedInteger = js.native
  
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
  val seed: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val stitchTiles: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val `type`: SVGAnimatedEnumeration = js.native
}
