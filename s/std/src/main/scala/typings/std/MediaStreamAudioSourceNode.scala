package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A type of AudioNode which operates as an audio source whose media is received from a MediaStream obtained using the WebRTC or Media Capture and Streams APIs. */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode {
  val mediaStream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
object MediaStreamAudioSourceNode extends Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaStreamAudioSourceOptions, 
      MediaStreamAudioSourceNode
    ]

