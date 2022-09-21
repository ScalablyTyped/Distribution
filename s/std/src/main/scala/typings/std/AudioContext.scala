package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext
  extends StObject
     with BaseAudioContext {
  
  /* standard dom */
  val baseLatency: Double = js.native
  
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  
  /* standard dom */
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native
  
  /* standard dom */
  def createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode = js.native
  
  /* standard dom */
  def getOutputTimestamp(): AudioTimestamp = js.native
  
  /* standard dom */
  val outputLatency: Double = js.native
  
  /* standard dom */
  def resume(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def suspend(): js.Promise[Unit] = js.native
}
