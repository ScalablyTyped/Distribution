package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDataChannelEvent extends Event {
  val channel: RTCDataChannel = js.native
}

@JSGlobal("RTCDataChannelEvent")
@js.native
object RTCDataChannelEvent
  extends ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCDataChannelEventInit, 
      RTCDataChannelEvent
    ]

