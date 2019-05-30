package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement extends SVGGraphicsElement {
  val LENGTHADJUST_SPACING: scala.Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: scala.Double = js.native
  val LENGTHADJUST_UNKNOWN: scala.Double = js.native
  val lengthAdjust: SVGAnimatedEnumeration = js.native
  val textLength: SVGAnimatedLength = js.native
  def getCharNumAtPosition(point: SVGPoint): scala.Double = js.native
  def getComputedTextLength(): scala.Double = js.native
  def getEndPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getExtentOfChar(charnum: scala.Double): SVGRect = js.native
  def getNumberOfChars(): scala.Double = js.native
  def getRotationOfChar(charnum: scala.Double): scala.Double = js.native
  def getStartPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getSubStringLength(charnum: scala.Double, nchars: scala.Double): scala.Double = js.native
  def selectSubString(charnum: scala.Double, nchars: scala.Double): scala.Unit = js.native
}

@JSGlobal("SVGTextContentElement")
@js.native
class SVGTextContentElementCls () extends SVGTextContentElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
}

@JSGlobal("SVGTextContentElement")
@js.native
object SVGTextContentElement
  extends org.scalablytyped.runtime.Instantiable0[SVGTextContentElement] {
  val LENGTHADJUST_SPACING: scala.Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: scala.Double = js.native
  val LENGTHADJUST_UNKNOWN: scala.Double = js.native
}

