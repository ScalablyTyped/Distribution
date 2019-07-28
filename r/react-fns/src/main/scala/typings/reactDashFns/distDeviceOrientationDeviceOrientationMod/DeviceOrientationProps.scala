package typings.reactDashFns.distDeviceOrientationDeviceOrientationMod

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
    alpha: Int | Double = null,
    beta: Int | Double = null,
    gamma: Int | Double = null
  ): DeviceOrientationProps = {
    val __obj = js.Dynamic.literal(absolute = absolute)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationProps]
  }
}

