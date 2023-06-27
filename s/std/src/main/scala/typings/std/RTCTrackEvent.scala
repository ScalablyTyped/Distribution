package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent) */
@js.native
trait RTCTrackEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/receiver) */
  /* standard dom */
  val receiver: RTCRtpReceiver = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/streams) */
  /* standard dom */
  val streams: js.Array[MediaStream] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/track) */
  /* standard dom */
  val track: MediaStreamTrack = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCTrackEvent/transceiver) */
  /* standard dom */
  val transceiver: RTCRtpTransceiver = js.native
}
