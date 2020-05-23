package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AnimationEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AnimationEvent")
@js.native
class AnimationEvent protected ()
  extends typings.std.AnimationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, animationEventInitDict: AnimationEventInit) = this()
}

@JSGlobal("AnimationEvent")
@js.native
object AnimationEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.AnimationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* animationEventInitDict */ AnimationEventInit, 
      typings.std.AnimationEvent
    ]

