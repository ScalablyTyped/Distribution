package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the amount of acceleration the device is experiencing along all three axes. */
trait DeviceAcceleration extends js.Object {
  val x: Double | Null
  val y: Double | Null
  val z: Double | Null
}

object DeviceAcceleration {
  @scala.inline
  def apply(
    x: Double = null.asInstanceOf[Double],
    y: Double = null.asInstanceOf[Double],
    z: Double = null.asInstanceOf[Double]
  ): DeviceAcceleration = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAcceleration]
  }
}

