package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCTrackEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val receiver: RTCRtpReceiver = js.native
  
  /* standard dom */
  val streams: js.Array[MediaStream] = js.native
  
  /* standard dom */
  val track: MediaStreamTrack = js.native
  
  /* standard dom */
  val transceiver: RTCRtpTransceiver = js.native
}
