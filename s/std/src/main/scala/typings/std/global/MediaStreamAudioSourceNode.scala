package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaStreamAudioSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
class MediaStreamAudioSourceNode protected ()
  extends typings.std.MediaStreamAudioSourceNode {
  def this(context: typings.std.AudioContext, options: MediaStreamAudioSourceOptions) = this()
}

@JSGlobal("MediaStreamAudioSourceNode")
@js.native
object MediaStreamAudioSourceNode
  extends Instantiable2[
      /* context */ typings.std.AudioContext, 
      /* options */ MediaStreamAudioSourceOptions, 
      typings.std.MediaStreamAudioSourceNode
    ]

