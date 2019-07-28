package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChannelMergerNode")
@js.native
class ChannelMergerNodeCls protected () extends ChannelMergerNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: ChannelMergerOptions) = this()
}

@JSGlobal("ChannelMergerNode")
@js.native
object ChannelMergerNode
  extends Instantiable1[/* context */ BaseAudioContext, ChannelMergerNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ChannelMergerOptions, 
      ChannelMergerNode
    ]

