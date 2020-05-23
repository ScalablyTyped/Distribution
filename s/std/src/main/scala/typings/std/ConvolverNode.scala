package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output. */
@js.native
trait ConvolverNode extends AudioNode {
  var buffer: AudioBuffer | Null = js.native
  var normalize: scala.Boolean = js.native
}

