package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The AnalyserNode interface represents a node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations. */
@js.native
trait AnalyserNode extends AudioNode {
  var fftSize: scala.Double = js.native
  val frequencyBinCount: scala.Double = js.native
  var maxDecibels: scala.Double = js.native
  var minDecibels: scala.Double = js.native
  var smoothingTimeConstant: scala.Double = js.native
  def getByteFrequencyData(array: Uint8Array): scala.Unit = js.native
  def getByteTimeDomainData(array: Uint8Array): scala.Unit = js.native
  def getFloatFrequencyData(array: Float32Array): scala.Unit = js.native
  def getFloatTimeDomainData(array: Float32Array): scala.Unit = js.native
}

@JSGlobal("AnalyserNode")
@js.native
class AnalyserNodeCls protected () extends AnalyserNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: AnalyserOptions) = this()
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, AnalyserNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ AnalyserOptions, AnalyserNode]

