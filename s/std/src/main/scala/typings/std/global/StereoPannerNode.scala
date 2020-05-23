package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.StereoPannerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StereoPannerNode")
@js.native
class StereoPannerNode protected ()
  extends typings.std.StereoPannerNode {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: StereoPannerOptions) = this()
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.StereoPannerNode]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ StereoPannerOptions, 
      typings.std.StereoPannerNode
    ]

