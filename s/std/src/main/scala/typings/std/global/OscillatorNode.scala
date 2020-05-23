package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.OscillatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OscillatorNode")
@js.native
class OscillatorNode protected ()
  extends typings.std.OscillatorNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: OscillatorOptions) = this()
}

@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.OscillatorNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ OscillatorOptions, 
      typings.std.OscillatorNode
    ]

