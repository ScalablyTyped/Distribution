package typings.reactDashNativeDashSensorDashManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsNear extends js.Object {
  var isNear: Boolean
  var maxRange: Double
  var value: Double
}

object Anon_IsNear {
  @scala.inline
  def apply(isNear: Boolean, maxRange: Double, value: Double): Anon_IsNear = {
    val __obj = js.Dynamic.literal(isNear = isNear, maxRange = maxRange, value = value)
  
    __obj.asInstanceOf[Anon_IsNear]
  }
}

