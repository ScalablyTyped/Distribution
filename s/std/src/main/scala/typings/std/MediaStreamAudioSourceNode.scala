package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs. */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode {
  val mediaStream: MediaStream = js.native
}

