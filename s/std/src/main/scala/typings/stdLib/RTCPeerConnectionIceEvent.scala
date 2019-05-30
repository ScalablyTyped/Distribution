package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Events that occurs in relation to ICE candidates with the target, usually an RTCPeerConnection. Only one event is of this type: icecandidate. */
@js.native
trait RTCPeerConnectionIceEvent extends Event {
  val candidate: RTCIceCandidate | scala.Null = js.native
  val url: java.lang.String | scala.Null = js.native
}

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
class RTCPeerConnectionIceEventCls protected () extends RTCPeerConnectionIceEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: RTCPeerConnectionIceEventInit) = this()
}

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
object RTCPeerConnectionIceEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, RTCPeerConnectionIceEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceEventInit, 
      RTCPeerConnectionIceEvent
    ]

