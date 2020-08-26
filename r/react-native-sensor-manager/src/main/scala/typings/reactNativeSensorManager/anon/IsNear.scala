package typings.reactNativeSensorManager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNear extends js.Object {
  var isNear: Boolean = js.native
  var maxRange: Double = js.native
  var value: Double = js.native
}

object IsNear {
  @scala.inline
  def apply(isNear: Boolean, maxRange: Double, value: Double): IsNear = {
    val __obj = js.Dynamic.literal(isNear = isNear.asInstanceOf[js.Any], maxRange = maxRange.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNear]
  }
  @scala.inline
  implicit class IsNearOps[Self <: IsNear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsNear(value: Boolean): Self = this.set("isNear", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRange(value: Double): Self = this.set("maxRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

