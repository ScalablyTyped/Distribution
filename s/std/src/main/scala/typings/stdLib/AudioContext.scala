package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioContext extends BaseAudioContext {
  val baseLatency: scala.Double = js.native
  val outputLatency: scala.Double = js.native
  def close(): Promise[scala.Unit] = js.native
  def createMediaElementSource(mediaElement: HTMLMediaElement): MediaElementAudioSourceNode = js.native
  def createMediaStreamDestination(): MediaStreamAudioDestinationNode = js.native
  def createMediaStreamSource(mediaStream: MediaStream): MediaStreamAudioSourceNode = js.native
  def createMediaStreamTrackSource(mediaStreamTrack: MediaStreamTrack): MediaStreamTrackAudioSourceNode = js.native
  def getOutputTimestamp(): AudioTimestamp = js.native
  def suspend(): Promise[scala.Unit] = js.native
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends ScalablyTyped.runtime.Instantiable0[AudioContext]
     with ScalablyTyped.runtime.Instantiable1[/* contextOptions */ AudioContextOptions, AudioContext]

