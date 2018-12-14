package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationPlaybackEvent extends Event {
  val currentTime: scala.Double | scala.Null = js.native
  val timelineTime: scala.Double | scala.Null = js.native
}

@JSGlobal("AnimationPlaybackEvent")
@js.native
object AnimationPlaybackEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, AnimationPlaybackEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AnimationPlaybackEventInit, 
      AnimationPlaybackEvent
    ]

