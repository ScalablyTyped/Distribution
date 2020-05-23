package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DeviceMotionEvent provides web developers with information about the speed of changes for the device's position and orientation. */
@js.native
trait DeviceMotionEvent extends Event {
  val acceleration: DeviceMotionEventAcceleration | Null = js.native
  val accelerationIncludingGravity: DeviceMotionEventAcceleration | Null = js.native
  val interval: Double = js.native
  val rotationRate: DeviceMotionEventRotationRate | Null = js.native
}

