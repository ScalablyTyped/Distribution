package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implemented by elements that support attributes that position individual text glyphs. It is inherited by SVGTextElement, SVGTSpanElement, SVGTRefElement and SVGAltGlyphElement. */
@js.native
trait SVGTextPositioningElement extends SVGTextContentElement {
  val dx: SVGAnimatedLengthList = js.native
  val dy: SVGAnimatedLengthList = js.native
  val rotate: SVGAnimatedNumberList = js.native
  val x: SVGAnimatedLengthList = js.native
  val y: SVGAnimatedLengthList = js.native
}

@JSGlobal("SVGTextPositioningElement")
@js.native
class SVGTextPositioningElementCls () extends SVGTextPositioningElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val requiredExtensions: SVGStringList = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* CompleteClass */
  override val systemLanguage: SVGStringList = js.native
}

@JSGlobal("SVGTextPositioningElement")
@js.native
object SVGTextPositioningElement extends Instantiable0[SVGTextPositioningElement]

