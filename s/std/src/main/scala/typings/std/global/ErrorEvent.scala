package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ErrorEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends typings.std.ErrorEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ErrorEventInit) = this()
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.ErrorEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ErrorEventInit, 
      typings.std.ErrorEvent
    ]

