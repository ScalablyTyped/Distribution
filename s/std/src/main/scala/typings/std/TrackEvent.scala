package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TrackEvent interface, part of the HTML DOM specification, is used for events which represent changes to the set of available tracks on an HTML media element; these events are addtrack and removetrack.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent)
  */
@js.native
trait TrackEvent
  extends StObject
     with Event {
  
  /**
    * Returns the track object (TextTrack, AudioTrack, or VideoTrack) to which the event relates.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent/track)
    */
  /* standard dom */
  val track: TextTrack | Null = js.native
}
