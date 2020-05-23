package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.CloseEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CloseEvent")
@js.native
class CloseEvent protected ()
  extends typings.std.CloseEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: CloseEventInit) = this()
}

@JSGlobal("CloseEvent")
@js.native
object CloseEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.CloseEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ CloseEventInit, 
      typings.std.CloseEvent
    ]

