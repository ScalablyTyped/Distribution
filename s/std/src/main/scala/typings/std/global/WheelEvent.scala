package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WheelEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WheelEvent")
@js.native
class WheelEvent protected ()
  extends typings.std.WheelEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: WheelEventInit) = this()
}

@JSGlobal("WheelEvent")
@js.native
object WheelEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.WheelEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ WheelEventInit, 
      typings.std.WheelEvent
    ] {
  val DOM_DELTA_LINE: Double = js.native
  val DOM_DELTA_PAGE: Double = js.native
  val DOM_DELTA_PIXEL: Double = js.native
}

