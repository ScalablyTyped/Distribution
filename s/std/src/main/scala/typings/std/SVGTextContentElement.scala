package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement)
  */
@js.native
trait SVGTextContentElement
  extends StObject
     with SVGGraphicsElement {
  
  /* standard dom */
  val LENGTHADJUST_SPACING: `1` = js.native
  
  /* standard dom */
  val LENGTHADJUST_SPACINGANDGLYPHS: `2` = js.native
  
  /* standard dom */
  val LENGTHADJUST_UNKNOWN: `0` = js.native
  
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
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  
  /* standard dom */
  def getComputedTextLength(): Double = js.native
  
  /* standard dom */
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard dom */
  def getExtentOfChar(charnum: Double): DOMRect = js.native
  
  /* standard dom */
  def getNumberOfChars(): Double = js.native
  
  /* standard dom */
  def getRotationOfChar(charnum: Double): Double = js.native
  
  /* standard dom */
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /* standard dom */
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  /* standard dom */
  val lengthAdjust: SVGAnimatedEnumeration = js.native
  
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
  
  /** @deprecated */
  /* standard dom */
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  /* standard dom */
  val textLength: SVGAnimatedLength = js.native
}
