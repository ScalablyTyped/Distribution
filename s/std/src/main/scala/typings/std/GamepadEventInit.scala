package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadEventInit
  extends StObject
     with EventInit {
  
  var gamepad: Gamepad
}
object GamepadEventInit {
  
  @scala.inline
  def apply(gamepad: Gamepad): GamepadEventInit = {
    val __obj = js.Dynamic.literal(gamepad = gamepad.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadEventInit]
  }
  
  @scala.inline
  implicit class GamepadEventInitMutableBuilder[Self <: GamepadEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamepad(value: Gamepad): Self = StObject.set(x, "gamepad", value.asInstanceOf[js.Any])
  }
}
