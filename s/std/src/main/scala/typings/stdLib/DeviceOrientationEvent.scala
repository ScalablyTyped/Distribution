package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceOrientationEvent provides web developers with information from the physical orientation of the device running the web page. */
@js.native
trait DeviceOrientationEvent extends Event {
  val absolute: scala.Boolean = js.native
  val alpha: scala.Double | scala.Null = js.native
  val beta: scala.Double | scala.Null = js.native
  val gamma: scala.Double | scala.Null = js.native
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
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, DeviceOrientationEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ DeviceOrientationEventInit, 
      DeviceOrientationEvent
    ]

