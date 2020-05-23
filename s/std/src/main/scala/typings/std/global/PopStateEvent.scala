package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PopStateEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PopStateEvent")
@js.native
class PopStateEvent protected ()
  extends typings.std.PopStateEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PopStateEventInit) = this()
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.PopStateEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PopStateEventInit, 
      typings.std.PopStateEvent
    ]

