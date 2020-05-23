package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.TouchEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TouchEvent")
@js.native
class TouchEvent protected ()
  extends typings.std.TouchEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: TouchEventInit) = this()
}

@JSGlobal("TouchEvent")
@js.native
object TouchEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.TouchEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ TouchEventInit, 
      typings.std.TouchEvent
    ]

