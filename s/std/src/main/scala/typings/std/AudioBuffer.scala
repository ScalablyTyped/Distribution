package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer)
  */
@js.native
trait AudioBuffer extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyFromChannel) */
  /* standard dom */
  def copyFromChannel(destination: js.typedarray.Float32Array, channelNumber: Double): Unit = js.native
  def copyFromChannel(destination: js.typedarray.Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/copyToChannel) */
  /* standard dom */
  def copyToChannel(source: js.typedarray.Float32Array, channelNumber: Double): Unit = js.native
  def copyToChannel(source: js.typedarray.Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/duration) */
  /* standard dom */
  val duration: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/getChannelData) */
  /* standard dom */
  def getChannelData(channel: Double): js.typedarray.Float32Array = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/numberOfChannels) */
  /* standard dom */
  val numberOfChannels: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBuffer/sampleRate) */
  /* standard dom */
  val sampleRate: Double = js.native
}
