package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.InputEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InputEvent")
@js.native
class InputEvent protected ()
  extends typings.std.InputEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: InputEventInit) = this()
}

@JSGlobal("InputEvent")
@js.native
object InputEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.InputEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ InputEventInit, 
      typings.std.InputEvent
    ]

