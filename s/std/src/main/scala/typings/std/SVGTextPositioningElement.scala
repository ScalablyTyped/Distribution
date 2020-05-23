package typings.std

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

