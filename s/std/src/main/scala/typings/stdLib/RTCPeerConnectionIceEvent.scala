package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceEvent extends Event {
  val candidate: RTCIceCandidate | scala.Null = js.native
  val url: java.lang.String | scala.Null = js.native
}

@JSGlobal("RTCPeerConnectionIceEvent")
@js.native
object RTCPeerConnectionIceEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, RTCPeerConnectionIceEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceEventInit, 
      RTCPeerConnectionIceEvent
    ]

