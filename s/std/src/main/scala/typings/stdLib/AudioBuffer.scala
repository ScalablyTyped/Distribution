package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode. */
@js.native
trait AudioBuffer extends js.Object {
  val duration: scala.Double = js.native
  val length: scala.Double = js.native
  val numberOfChannels: scala.Double = js.native
  val sampleRate: scala.Double = js.native
  def copyFromChannel(destination: Float32Array, channelNumber: scala.Double): scala.Unit = js.native
  def copyFromChannel(destination: Float32Array, channelNumber: scala.Double, startInChannel: scala.Double): scala.Unit = js.native
  def copyToChannel(source: Float32Array, channelNumber: scala.Double): scala.Unit = js.native
  def copyToChannel(source: Float32Array, channelNumber: scala.Double, startInChannel: scala.Double): scala.Unit = js.native
  def getChannelData(channel: scala.Double): Float32Array = js.native
}

@JSGlobal("AudioBuffer")
@js.native
class AudioBufferCls protected () extends AudioBuffer {
  def this(options: AudioBufferOptions) = this()
}

@JSGlobal("AudioBuffer")
@js.native
object AudioBuffer
  extends org.scalablytyped.runtime.Instantiable1[/* options */ AudioBufferOptions, AudioBuffer]

