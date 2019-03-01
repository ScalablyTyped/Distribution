package typings
package reactDashFnsLib.distDeviceOrientationDeviceOrientationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOrientationProps extends js.Object {
  var absolute: scala.Boolean
  var alpha: scala.Double | scala.Null
  var beta: scala.Double | scala.Null
  var gamma: scala.Double | scala.Null
}

object DeviceOrientationProps {
  @scala.inline
  def apply(
    absolute: scala.Boolean,
    alpha: scala.Int | scala.Double = null,
    beta: scala.Int | scala.Double = null,
    gamma: scala.Int | scala.Double = null
  ): DeviceOrientationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absolute")(absolute)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceOrientationProps]
  }
}

