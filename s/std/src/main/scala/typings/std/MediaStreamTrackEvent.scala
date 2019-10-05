package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur. */
@js.native
trait MediaStreamTrackEvent extends Event {
  val track: MediaStreamTrack = js.native
}

@JSGlobal("MediaStreamTrackEvent")
@js.native
object MediaStreamTrackEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaStreamTrackEventInit, 
      MediaStreamTrackEvent
    ]

