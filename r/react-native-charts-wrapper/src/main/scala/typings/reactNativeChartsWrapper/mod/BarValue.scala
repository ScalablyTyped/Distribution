package typings.reactNativeChartsWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarValue extends js.Object {
  var marker: js.UndefOr[String | js.Array[String]] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double | js.Array[Double]] = js.native
}

object BarValue {
  @scala.inline
  def apply(): BarValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarValue]
  }
  @scala.inline
  implicit class BarValueOps[Self <: BarValue] (val x: Self) extends AnyVal {
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
    def setMarkerVarargs(value: String*): Self = this.set("marker", js.Array(value :_*))
    @scala.inline
    def setMarker(value: String | js.Array[String]): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("y", js.Array(value :_*))
    @scala.inline
    def setY(value: Double | js.Array[Double]): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

