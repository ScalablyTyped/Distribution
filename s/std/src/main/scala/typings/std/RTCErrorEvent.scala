package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCErrorEvent extends Event {
  val error: RTCError | Null = js.native
}

@JSGlobal("RTCErrorEvent")
@js.native
object RTCErrorEvent
  extends Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCErrorEventInit, RTCErrorEvent]

