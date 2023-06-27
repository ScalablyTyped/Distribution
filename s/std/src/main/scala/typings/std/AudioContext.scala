package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An audio-processing graph built from audio modules linked together, each represented by an AudioNode.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext)
  */
@js.native
trait AudioContext
  extends StObject
     with BaseAudioContext {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/baseLatency) */
  /* standard dom */
  val baseLatency: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/close) */
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaElementSource) */
  /* standard dom */
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamDestination) */
  /* standard dom */
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/createMediaStreamSource) */
  /* standard dom */
  def createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/getOutputTimestamp) */
  /* standard dom */
  def getOutputTimestamp(): AudioTimestamp = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/outputLatency) */
  /* standard dom */
  val outputLatency: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/resume) */
  /* standard dom */
  def resume(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioContext/suspend) */
  /* standard dom */
  def suspend(): js.Promise[Unit] = js.native
}
