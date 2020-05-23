package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.AnimationPlaybackEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AnimationPlaybackEvent")
@js.native
class AnimationPlaybackEvent protected ()
  extends typings.std.AnimationPlaybackEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: AnimationPlaybackEventInit) = this()
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.AnimationPlaybackEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      typings.std.AnimationPlaybackEvent
    ]

