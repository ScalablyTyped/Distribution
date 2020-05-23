package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ChannelSplitterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelSplitterNode")
@js.native
class ChannelSplitterNode protected ()
  extends typings.std.AudioNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: ChannelSplitterOptions) = this()
}

@JSGlobal("ChannelSplitterNode")
@js.native
object ChannelSplitterNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.ChannelSplitterNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ ChannelSplitterOptions, 
      typings.std.ChannelSplitterNode
    ]

