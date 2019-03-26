package typings
package stdLib

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
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, ChannelSplitterNode]
     with org.scalablytyped.runtime.Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ChannelSplitterOptions, 
      ChannelSplitterNode
    ]

