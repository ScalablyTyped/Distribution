package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ConvolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ConvolverNode")
@js.native
class ConvolverNode protected ()
  extends typings.std.ConvolverNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: ConvolverOptions) = this()
}

@JSGlobal("ConvolverNode")
@js.native
object ConvolverNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.ConvolverNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ ConvolverOptions, 
      typings.std.ConvolverNode
    ]

