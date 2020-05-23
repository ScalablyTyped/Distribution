package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AudioNodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
class MediaStreamAudioDestinationNode protected ()
  extends typings.std.MediaStreamAudioDestinationNode {
  def this(context: typings.std.AudioContext) = this()
  def this(context: typings.std.AudioContext, options: AudioNodeOptions) = this()
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends Instantiable1[
      /* context */ typings.std.AudioContext, 
      typings.std.MediaStreamAudioDestinationNode
    ]
     with Instantiable2[
      /* context */ typings.std.AudioContext, 
      /* options */ AudioNodeOptions, 
      typings.std.MediaStreamAudioDestinationNode
    ]

