package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelSplitterNode")
@js.native
class ChannelSplitterNodeCls protected () extends ChannelSplitterNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: ChannelSplitterOptions) = this()
}

@JSGlobal("ChannelSplitterNode")
@js.native
object ChannelSplitterNode
  extends Instantiable1[/* context */ BaseAudioContext, ChannelSplitterNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ChannelSplitterOptions, 
      ChannelSplitterNode
    ]

