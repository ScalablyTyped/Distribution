package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feColorMatrix> element. */
@js.native
trait SVGFEColorMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  
  /* standard dom */
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
  
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
  val `type`: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val values: SVGAnimatedNumberList = js.native
}
