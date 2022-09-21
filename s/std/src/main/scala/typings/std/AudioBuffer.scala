package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A short audio asset residing in memory, created from an audio file using the AudioContext.decodeAudioData() method, or from raw data using AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played by being passed into an AudioBufferSourceNode. */
@js.native
trait AudioBuffer extends StObject {
  
  /* standard dom */
  def copyFromChannel(destination: js.typedarray.Float32Array, channelNumber: Double): Unit = js.native
  def copyFromChannel(destination: js.typedarray.Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  /* standard dom */
  def copyToChannel(source: js.typedarray.Float32Array, channelNumber: Double): Unit = js.native
  def copyToChannel(source: js.typedarray.Float32Array, channelNumber: Double, bufferOffset: Double): Unit = js.native
  
  /* standard dom */
  val duration: Double = js.native
  
  /* standard dom */
  def getChannelData(channel: Double): js.typedarray.Float32Array = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfChannels: Double = js.native
  
  /* standard dom */
  val sampleRate: Double = js.native
}
