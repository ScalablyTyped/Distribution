package typings
package stdLib

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
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, ChannelMergerNode]
     with org.scalablytyped.runtime.Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ChannelMergerOptions, 
      ChannelMergerNode
    ]

