package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ConstantSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConstantSourceNode")
@js.native
class ConstantSourceNode protected ()
  extends typings.std.ConstantSourceNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: ConstantSourceOptions) = this()
}

@JSGlobal("ConstantSourceNode")
@js.native
object ConstantSourceNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.ConstantSourceNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ ConstantSourceOptions, 
      typings.std.ConstantSourceNode
    ]

