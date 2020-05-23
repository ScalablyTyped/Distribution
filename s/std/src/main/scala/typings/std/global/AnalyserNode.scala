package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AnalyserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AnalyserNode")
@js.native
class AnalyserNode protected ()
  extends typings.std.AnalyserNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: AnalyserOptions) = this()
}

@JSGlobal("AnalyserNode")
@js.native
object AnalyserNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.AnalyserNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ AnalyserOptions, 
      typings.std.AnalyserNode
    ]

