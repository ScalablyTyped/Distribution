package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceMotionEventRotationRate extends js.Object {
  val alpha: scala.Double | scala.Null
  val beta: scala.Double | scala.Null
  val gamma: scala.Double | scala.Null
}

object DeviceMotionEventRotationRate {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    beta: scala.Int | scala.Double = null,
    gamma: scala.Int | scala.Double = null
  ): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
}

