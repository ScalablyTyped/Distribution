package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WaveShaperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaveShaperNode")
@js.native
class WaveShaperNode protected ()
  extends typings.std.WaveShaperNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: WaveShaperOptions) = this()
}

@JSGlobal("WaveShaperNode")
@js.native
object WaveShaperNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.WaveShaperNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ WaveShaperOptions, 
      typings.std.WaveShaperNode
    ]

