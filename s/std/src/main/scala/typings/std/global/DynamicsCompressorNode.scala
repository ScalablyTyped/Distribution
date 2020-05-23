package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.DynamicsCompressorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DynamicsCompressorNode")
@js.native
class DynamicsCompressorNode protected ()
  extends typings.std.DynamicsCompressorNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: DynamicsCompressorOptions) = this()
}

@JSGlobal("DynamicsCompressorNode")
@js.native
object DynamicsCompressorNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.DynamicsCompressorNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ DynamicsCompressorOptions, 
      typings.std.DynamicsCompressorNode
    ]

