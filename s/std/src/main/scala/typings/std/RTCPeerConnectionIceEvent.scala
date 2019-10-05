package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this type: icecandidate. */
@js.native
trait RTCPeerConnectionIceEvent extends Event {
  val candidate: RTCIceCandidate | Null = js.native
  val url: java.lang.String | Null = js.native
}

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
object RTCPeerConnectionIceEvent
  extends Instantiable1[/* type */ java.lang.String, RTCPeerConnectionIceEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceEventInit, 
      RTCPeerConnectionIceEvent
    ]

