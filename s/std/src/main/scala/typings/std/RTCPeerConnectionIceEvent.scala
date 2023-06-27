package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this type: icecandidate.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent)
  */
@js.native
trait RTCPeerConnectionIceEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCPeerConnectionIceEvent/candidate) */
  /* standard dom */
  val candidate: RTCIceCandidate | Null = js.native
}
