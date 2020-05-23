package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AudioBufferSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioBufferSourceNode")
@js.native
class AudioBufferSourceNode protected ()
  extends typings.std.AudioBufferSourceNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: AudioBufferSourceOptions) = this()
}

@JSGlobal("AudioBufferSourceNode")
@js.native
object AudioBufferSourceNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.AudioBufferSourceNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ AudioBufferSourceOptions, 
      typings.std.AudioBufferSourceNode
    ]

