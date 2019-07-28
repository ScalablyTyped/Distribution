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
  def apply(alpha: Int | Double = null, beta: Int | Double = null, gamma: Int | Double = null): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
}

