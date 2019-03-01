package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceAccelerationDict extends js.Object {
  var x: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var z: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object DeviceAccelerationDict {
  @scala.inline
  def apply(
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): DeviceAccelerationDict = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceAccelerationDict]
  }
}

