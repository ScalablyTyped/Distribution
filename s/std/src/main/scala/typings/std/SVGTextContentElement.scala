package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement extends SVGGraphicsElement {
  val LENGTHADJUST_SPACING: Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  val LENGTHADJUST_UNKNOWN: Double = js.native
  val lengthAdjust: SVGAnimatedEnumeration = js.native
  val textLength: SVGAnimatedLength = js.native
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  def getComputedTextLength(): Double = js.native
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  def getExtentOfChar(charnum: Double): DOMRect = js.native
  def getNumberOfChars(): Double = js.native
  def getRotationOfChar(charnum: Double): Double = js.native
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
}

