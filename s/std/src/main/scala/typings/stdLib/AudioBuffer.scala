package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Objects of these types are designed to hold small audio snippets, typically less than 45 s. For longer sounds, objects implementing the MediaElementAudioSourceNode are more suitable. The buffer contains data in the following format:  non-interleaved IEEE754 32-bit linear PCM with a nominal range between -1 and +1, that is, 32bits floating point buffer, with each samples between -1.0 and 1.0. If the AudioBuffer has multiple channels, they are stored in separate buffer. */
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

