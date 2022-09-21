package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A base interface used by the component transfer function interfaces. */
@js.native
trait SVGComponentTransferFunctionElement
  extends StObject
     with SVGElement {
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Double = js.native
  
  /* standard dom */
  val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Double = js.native
  
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
  val amplitude: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val exponent: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val intercept: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val offset: SVGAnimatedNumber = js.native
  
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
  val slope: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val tableValues: SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val `type`: SVGAnimatedEnumeration = js.native
}
