package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events which indicate that a MediaStream has had tracks added to or removed from the stream through calls to Media Stream API methods. These events are sent to the stream when these changes occur.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent)
  */
@js.native
trait MediaStreamTrackEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track) */
  /* standard dom */
  val track: MediaStreamTrack = js.native
}
