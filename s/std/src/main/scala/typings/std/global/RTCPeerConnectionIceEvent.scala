package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RTCPeerConnectionIceEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
class RTCPeerConnectionIceEvent protected ()
  extends typings.std.RTCPeerConnectionIceEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: RTCPeerConnectionIceEventInit) = this()
}

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
object RTCPeerConnectionIceEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.RTCPeerConnectionIceEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceEventInit, 
      typings.std.RTCPeerConnectionIceEvent
    ]

