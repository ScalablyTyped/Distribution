package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page. */
@js.native
trait DeviceOrientationEvent extends Event {
  val absolute: scala.Boolean = js.native
  val alpha: Double | Null = js.native
  val beta: Double | Null = js.native
  val gamma: Double | Null = js.native
}

@JSGlobal("DeviceOrientationEvent")
@js.native
class DeviceOrientationEventCls protected () extends DeviceOrientationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: DeviceOrientationEventInit) = this()
}

@JSGlobal("DeviceOrientationEvent")
@js.native
object DeviceOrientationEvent
  extends Instantiable1[/* type */ java.lang.String, DeviceOrientationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      DeviceOrientationEvent
    ]

