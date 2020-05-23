package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext extends BaseAudioContext {
  val baseLatency: Double = js.native
  val outputLatency: Double = js.native
  def close(): js.Promise[Unit] = js.native
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native
  def createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode = js.native
  def createMediaStreamTrackSource(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceNode = js.native
  def getOutputTimestamp(): AudioTimestamp = js.native
  def resume(): js.Promise[Unit] = js.native
  def suspend(): js.Promise[Unit] = js.native
}

