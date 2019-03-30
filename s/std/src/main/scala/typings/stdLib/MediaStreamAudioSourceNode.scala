package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A MediaStreamAudioSourceNode has no inputs and exactly one output, and is created using the AudioContext.createMediaStreamSource method. The number of channels in the output equals the number of channels in AudioMediaStreamTrack. If there is no valid media stream, then the number of output channels will be one silent channel. */
@js.native
trait MediaStreamAudioSourceNode extends AudioNode {
  val mediaStream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
class MediaStreamAudioSourceNodeCls protected () extends MediaStreamAudioSourceNode {
  def this(context: AudioContext, options: MediaStreamAudioSourceOptions) = this()
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
object MediaStreamAudioSourceNode
  extends org.scalablytyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ MediaStreamAudioSourceOptions, 
      MediaStreamAudioSourceNode
    ]

