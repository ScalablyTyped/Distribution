package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

