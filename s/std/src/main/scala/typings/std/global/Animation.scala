package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Animation")
@js.native
class Animation ()
  extends typings.std.Animation {
  def this(effect: typings.std.AnimationEffect) = this()
  def this(effect: Null, timeline: typings.std.AnimationTimeline) = this()
  def this(effect: typings.std.AnimationEffect, timeline: typings.std.AnimationTimeline) = this()
}

@JSGlobal("Animation")
@js.native
object Animation
  extends Instantiable0[typings.std.Animation]
     with Instantiable1[/* effect */ typings.std.AnimationEffect, typings.std.Animation]
     with Instantiable2[
      (/* effect */ typings.std.AnimationEffect) | (/* effect */ Null), 
      /* timeline */ typings.std.AnimationTimeline, 
      typings.std.Animation
    ]

