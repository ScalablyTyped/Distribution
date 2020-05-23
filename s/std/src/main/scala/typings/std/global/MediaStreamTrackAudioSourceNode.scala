package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaStreamTrackAudioSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamTrackAudioSourceNode")
@js.native
class MediaStreamTrackAudioSourceNode protected ()
  extends typings.std.AudioNode {
  def this(context: typings.std.AudioContext, options: MediaStreamTrackAudioSourceOptions) = this()
}

@JSGlobal("MediaStreamTrackAudioSourceNode")
@js.native
object MediaStreamTrackAudioSourceNode
  extends Instantiable2[
      /* context */ typings.std.AudioContext, 
      /* options */ MediaStreamTrackAudioSourceOptions, 
      typings.std.MediaStreamTrackAudioSourceNode
    ]

