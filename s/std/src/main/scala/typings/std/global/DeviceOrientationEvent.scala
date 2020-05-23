package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.DeviceOrientationEventInit
import typings.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEvent protected ()
  extends typings.std.DeviceOrientationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.DeviceOrientationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      typings.std.DeviceOrientationEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

