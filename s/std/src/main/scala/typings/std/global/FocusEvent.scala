package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.FocusEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FocusEvent")
@js.native
class FocusEvent protected ()
  extends typings.std.FocusEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: FocusEventInit) = this()
}

@JSGlobal("FocusEvent")
@js.native
object FocusEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.FocusEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ FocusEventInit, 
      typings.std.FocusEvent
    ]

