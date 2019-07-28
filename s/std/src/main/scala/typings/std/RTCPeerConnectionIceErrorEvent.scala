package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceErrorEvent extends Event {
  val errorCode: Double = js.native
  val errorText: java.lang.String = js.native
  val hostCandidate: java.lang.String = js.native
  val url: java.lang.String = js.native
}

@JSGlobal("RTCPeerConnectionIceErrorEvent")
@js.native
class RTCPeerConnectionIceErrorEventCls protected () extends RTCPeerConnectionIceErrorEvent {
  def this(`type`: java.lang.String, eventInitDict: RTCPeerConnectionIceErrorEventInit) = this()
}

@JSGlobal("RTCPeerConnectionIceErrorEvent")
@js.native
object RTCPeerConnectionIceErrorEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceErrorEventInit, 
      RTCPeerConnectionIceErrorEvent
    ]

