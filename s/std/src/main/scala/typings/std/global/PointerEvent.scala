package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PointerEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PointerEvent")
@js.native
class PointerEvent protected ()
  extends typings.std.PointerEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: PointerEventInit) = this()
}

@JSGlobal("PointerEvent")
@js.native
object PointerEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.PointerEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      typings.std.PointerEvent
    ]

