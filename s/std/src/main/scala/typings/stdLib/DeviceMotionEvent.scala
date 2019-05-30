package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
@js.native
trait DeviceMotionEvent extends Event {
  val acceleration: DeviceMotionEventAcceleration | scala.Null = js.native
  val accelerationIncludingGravity: DeviceMotionEventAcceleration | scala.Null = js.native
  val interval: scala.Double = js.native
  val rotationRate: DeviceMotionEventRotationRate | scala.Null = js.native
}

@JSGlobal("DeviceMotionEvent")
@js.native
class DeviceMotionEventCls protected () extends DeviceMotionEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceMotionEventInit) = this()
}

@JSGlobal("DeviceMotionEvent")
@js.native
object DeviceMotionEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, DeviceMotionEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceMotionEventInit, 
      DeviceMotionEvent
    ]

