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
  * Corresponds to the <feColorMatrix> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement)
  */
@js.native
trait SVGFEColorMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: `3` = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: `4` = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_MATRIX: `1` = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_SATURATE: `2` = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: `0` = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/in1) */
  /* standard dom */
  val in1: SVGAnimatedString = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/type) */
  /* standard dom */
  val `type`: SVGAnimatedEnumeration = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEColorMatrixElement/values) */
  /* standard dom */
  val values: SVGAnimatedNumberList = js.native
}
