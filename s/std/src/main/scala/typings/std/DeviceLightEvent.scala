package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceLightEvent provides web developers with information from photo sensors or similiar detectors about ambient light levels near the device. For example this may be useful to adjust the screen's brightness based on the current ambient light level in order to save energy or provide better readability. */
@js.native
trait DeviceLightEvent extends Event {
  val value: Double = js.native
}

@JSGlobal("DeviceLightEvent")
@js.native
object DeviceLightEvent
  extends Instantiable1[/* typeArg */ java.lang.String, DeviceLightEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceLightEventInit, 
      DeviceLightEvent
    ]

