package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BiquadFilterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BiquadFilterNode")
@js.native
class BiquadFilterNode protected ()
  extends typings.std.BiquadFilterNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: BiquadFilterOptions) = this()
}

@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.BiquadFilterNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ BiquadFilterOptions, 
      typings.std.BiquadFilterNode
    ]

