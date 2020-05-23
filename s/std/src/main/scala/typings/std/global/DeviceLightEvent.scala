package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.DeviceLightEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceLightEvent")
@js.native
class DeviceLightEvent protected ()
  extends typings.std.DeviceLightEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: DeviceLightEventInit) = this()
}

@JSGlobal("DeviceLightEvent")
@js.native
object DeviceLightEvent
  extends Instantiable1[/* typeArg */ java.lang.String, typings.std.DeviceLightEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceLightEventInit, 
      typings.std.DeviceLightEvent
    ]

