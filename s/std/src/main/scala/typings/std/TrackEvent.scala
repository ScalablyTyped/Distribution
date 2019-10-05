package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TrackEvent interface, part of the HTML DOM specification, is used for events which represent changes to the set of available tracks on an HTML media element; these events are addtrack and removetrack. */
@js.native
trait TrackEvent extends Event {
  val track: VideoTrack | AudioTrack | TextTrack | Null = js.native
}

@JSGlobal("TrackEvent")
@js.native
object TrackEvent
  extends Instantiable1[/* typeArg */ java.lang.String, TrackEvent]
     with Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ TrackEventInit, TrackEvent]

