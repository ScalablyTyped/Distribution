package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventRotationRate extends js.Object {
  val alpha: Double | Null
  val beta: Double | Null
  val gamma: Double | Null
}

object DeviceMotionEventRotationRate {
  @scala.inline
  def apply(
    alpha: Double = null.asInstanceOf[Double],
    beta: Double = null.asInstanceOf[Double],
    gamma: Double = null.asInstanceOf[Double]
  ): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
}

