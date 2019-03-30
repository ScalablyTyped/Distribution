package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The GamepadEvent interface of the Gamepad API contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to. */
@js.native
trait GamepadEvent extends Event {
  val gamepad: Gamepad = js.native
}

@JSGlobal("GamepadEvent")
@js.native
class GamepadEventCls protected () extends GamepadEvent {
  def this(`type`: java.lang.String, eventInitDict: GamepadEventInit) = this()
}

@JSGlobal("GamepadEvent")
@js.native
object GamepadEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ GamepadEventInit, GamepadEvent]

