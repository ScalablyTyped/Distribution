package typings
package reactDashNativeDashSensorDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsNear extends js.Object {
  var isNear: scala.Boolean
  var maxRange: scala.Double
  var value: scala.Double
}

object Anon_IsNear {
  @scala.inline
  def apply(isNear: scala.Boolean, maxRange: scala.Double, value: scala.Double): Anon_IsNear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isNear")(isNear)
    __obj.updateDynamic("maxRange")(maxRange)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_IsNear]
  }
}

