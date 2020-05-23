package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.DeviceMotionEventInit
import typings.std.PermissionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEvent protected ()
  extends typings.std.DeviceMotionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
}

@JSGlobal("DeviceMotionEvent")
@js.native
object DeviceMotionEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.DeviceMotionEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceMotionEventInit, 
      typings.std.DeviceMotionEvent
    ] {
  def requestPermission(): js.Promise[PermissionState] = js.native
}

