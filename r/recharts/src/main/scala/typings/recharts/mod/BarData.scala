package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarData extends js.Object {
  var height: Double = js.native
  var radius: Double | js.Array[_] = js.native
  var value: Double | String | js.Array[_] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object BarData {
  @scala.inline
  def apply(
    height: Double,
    radius: Double | js.Array[_],
    value: Double | String | js.Array[_],
    width: Double,
    x: Double,
    y: Double
  ): BarData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarData]
  }
  @scala.inline
  implicit class BarDataOps[Self <: BarData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusVarargs(value: js.Any*): Self = this.set("radius", js.Array(value :_*))
    @scala.inline
    def setRadius(value: Double | js.Array[_]): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Double | String | js.Array[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

