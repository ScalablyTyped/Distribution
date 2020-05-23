package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import typings.std.GamepadEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GamepadEvent")
@js.native
class GamepadEvent protected ()
  extends typings.std.GamepadEvent {
  def this(`type`: java.lang.String, eventInitDict: GamepadEventInit) = this()
}

@JSGlobal("GamepadEvent")
@js.native
object GamepadEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ GamepadEventInit, 
      typings.std.GamepadEvent
    ]

