package typings.std

import org.scalablytyped.runtime.Instantiable2
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
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCDataChannelEventInit, 
      RTCDataChannelEvent
    ]

