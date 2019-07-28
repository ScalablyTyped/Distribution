package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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

@JSGlobal("AudioContext")
@js.native
class AudioContextCls () extends AudioContext {
  def this(contextOptions: AudioContextOptions) = this()
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends Instantiable0[AudioContext]
     with Instantiable1[/* contextOptions */ AudioContextOptions, AudioContext]

