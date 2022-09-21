package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output. */
@js.native
trait ConvolverNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  var buffer: AudioBuffer | Null = js.native
  
  /* standard dom */
  var normalize: scala.Boolean = js.native
}
