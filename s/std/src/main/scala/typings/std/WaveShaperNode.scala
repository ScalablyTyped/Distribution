package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A WaveShaperNode always has exactly one input and one output. */
@js.native
trait WaveShaperNode extends AudioNode {
  var curve: Float32Array | Null = js.native
  var oversample: OverSampleType = js.native
}

