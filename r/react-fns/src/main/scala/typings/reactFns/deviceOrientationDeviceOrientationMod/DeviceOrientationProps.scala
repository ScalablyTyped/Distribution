package typings.reactFns.deviceOrientationDeviceOrientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationProps extends js.Object {
  var absolute: Boolean
  var alpha: Double | Null
  var beta: Double | Null
  var gamma: Double | Null
}

object DeviceOrientationProps {
  @scala.inline
  def apply(
    absolute: Boolean,
    alpha: Double = null.asInstanceOf[Double],
    beta: Double = null.asInstanceOf[Double],
    gamma: Double = null.asInstanceOf[Double]
  ): DeviceOrientationProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationProps]
  }
}

