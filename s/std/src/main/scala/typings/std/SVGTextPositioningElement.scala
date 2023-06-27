package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implemented by elements that support attributes that position individual text glyphs. It is inherited by SVGTextElement, SVGTSpanElement, SVGTRefElement and SVGAltGlyphElement.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement)
  */
@js.native
trait SVGTextPositioningElement
  extends StObject
     with SVGTextContentElement {
  
  /* standard dom */
  val dx: SVGAnimatedLengthList = js.native
  
  /* standard dom */
  val dy: SVGAnimatedLengthList = js.native
  
  /* standard dom */
  val rotate: SVGAnimatedNumberList = js.native
  
  /* standard dom */
  val x: SVGAnimatedLengthList = js.native
  
  /* standard dom */
  val y: SVGAnimatedLengthList = js.native
}
