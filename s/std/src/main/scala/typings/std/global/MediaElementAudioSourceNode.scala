package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaElementAudioSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaElementAudioSourceNode")
@js.native
class MediaElementAudioSourceNode protected ()
  extends typings.std.MediaElementAudioSourceNode {
  def this(context: typings.std.AudioContext, options: MediaElementAudioSourceOptions) = this()
}

@JSGlobal("MediaElementAudioSourceNode")
@js.native
object MediaElementAudioSourceNode
  extends Instantiable2[
      /* context */ typings.std.AudioContext, 
      /* options */ MediaElementAudioSourceOptions, 
      typings.std.MediaElementAudioSourceNode
    ]

