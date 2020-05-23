package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.GainOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GainNode")
@js.native
class GainNode protected ()
  extends typings.std.GainNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: GainOptions) = this()
}

@JSGlobal("GainNode")
@js.native
object GainNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.GainNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ GainOptions, 
      typings.std.GainNode
    ]

