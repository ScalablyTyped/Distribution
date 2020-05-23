package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the rate at which the device is rotating around all three axes. */
trait DeviceRotationRate extends js.Object {
  val alpha: Double | Null
  val beta: Double | Null
  val gamma: Double | Null
}

object DeviceRotationRate {
  @scala.inline
  def apply(
    alpha: Double = null.asInstanceOf[Double],
    beta: Double = null.asInstanceOf[Double],
    gamma: Double = null.asInstanceOf[Double]
  ): DeviceRotationRate = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceRotationRate]
  }
}

