package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ChannelMergerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelMergerNode")
@js.native
class ChannelMergerNode protected ()
  extends typings.std.AudioNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: ChannelMergerOptions) = this()
}

@JSGlobal("ChannelMergerNode")
@js.native
object ChannelMergerNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.ChannelMergerNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ ChannelMergerOptions, 
      typings.std.ChannelMergerNode
    ]

