package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import typings.std.stdInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  /* standard dom */
  val SVG_EDGEMODE_DUPLICATE: `1` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_NONE: `3` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_UNKNOWN: `0` = js.native
  
  /* standard dom */
  val SVG_EDGEMODE_WRAP: `2` = js.native
  
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
  val bias: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val divisor: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val edgeMode: SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val in1: SVGAnimatedString = js.native
  
  /* standard dom */
  val kernelMatrix: SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  
  /* standard dom */
  val orderX: SVGAnimatedInteger = js.native
  
  /* standard dom */
  val orderY: SVGAnimatedInteger = js.native
  
  /* standard dom */
  val preserveAlpha: SVGAnimatedBoolean = js.native
  
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
  val targetX: SVGAnimatedInteger = js.native
  
  /* standard dom */
  val targetY: SVGAnimatedInteger = js.native
}
