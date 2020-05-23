package typings.std

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

