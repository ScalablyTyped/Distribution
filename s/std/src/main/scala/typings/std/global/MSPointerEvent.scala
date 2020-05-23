package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PointerEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSPointerEvent")
@js.native
class MSPointerEvent protected ()
  extends typings.std.MSPointerEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: PointerEventInit) = this()
}

@JSGlobal("MSPointerEvent")
@js.native
object MSPointerEvent
  extends Instantiable1[/* typeArg */ java.lang.String, typings.std.MSPointerEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ PointerEventInit, 
      typings.std.MSPointerEvent
    ]

