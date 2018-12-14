package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadEvent extends Event {
  val gamepad: Gamepad = js.native
}

@JSGlobal("GamepadEvent")
@js.native
object GamepadEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, GamepadEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ GamepadEventInit, GamepadEvent]

