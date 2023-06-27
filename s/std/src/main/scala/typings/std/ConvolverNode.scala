package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode)
  */
@js.native
trait ConvolverNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/buffer) */
  /* standard dom */
  var buffer: AudioBuffer | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ConvolverNode/normalize) */
  /* standard dom */
  var normalize: scala.Boolean = js.native
}
