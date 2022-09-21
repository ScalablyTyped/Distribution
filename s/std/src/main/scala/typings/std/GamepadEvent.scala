package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Gamepad API interface contains references to gamepads connected to the system, which is what the gamepad events Window.gamepadconnected and Window.gamepaddisconnected are fired in response to.
  * Available only in secure contexts.
  */
@js.native
trait GamepadEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val gamepad: Gamepad = js.native
}
