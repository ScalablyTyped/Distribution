package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlaybackEvent extends Event {
  val currentTime: Double | Null = js.native
  val timelineTime: Double | Null = js.native
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
class AnimationPlaybackEventCls protected () extends AnimationPlaybackEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: AnimationPlaybackEventInit) = this()
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends Instantiable1[/* type */ java.lang.String, AnimationPlaybackEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

