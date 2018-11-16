package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCErrorEvent extends Event {
  val error: RTCError | scala.Null = js.native
}

@JSGlobal("RTCErrorEvent")
@js.native
object RTCErrorEvent
  extends ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCErrorEventInit, RTCErrorEvent]

