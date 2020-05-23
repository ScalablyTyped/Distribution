package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PannerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PannerNode")
@js.native
class PannerNode protected ()
  extends typings.std.PannerNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: PannerOptions) = this()
}

@JSGlobal("PannerNode")
@js.native
object PannerNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.PannerNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ PannerOptions, 
      typings.std.PannerNode
    ]

