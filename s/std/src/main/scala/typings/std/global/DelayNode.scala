package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.DelayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DelayNode")
@js.native
class DelayNode protected ()
  extends typings.std.DelayNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: DelayOptions) = this()
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.DelayNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ DelayOptions, 
      typings.std.DelayNode
    ]

