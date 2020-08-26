package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Enabled
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.INSIDE_CHART
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.OUTSIDE_CHART
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait yAxis extends Axis {
  var inverted: js.UndefOr[Boolean] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var position: js.UndefOr[OUTSIDE_CHART | INSIDE_CHART] = js.native
  var spaceBottom: js.UndefOr[Double] = js.native
  var spaceTop: js.UndefOr[Double] = js.native
  var zeroLine: js.UndefOr[Enabled] = js.native
}

object yAxis {
  @scala.inline
  def apply(): yAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[yAxis]
  }
  @scala.inline
  implicit class yAxisOps[Self <: yAxis] (val x: Self) extends AnyVal {
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
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPosition(value: OUTSIDE_CHART | INSIDE_CHART): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSpaceBottom(value: Double): Self = this.set("spaceBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBottom: Self = this.set("spaceBottom", js.undefined)
    @scala.inline
    def setSpaceTop(value: Double): Self = this.set("spaceTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceTop: Self = this.set("spaceTop", js.undefined)
    @scala.inline
    def setZeroLine(value: Enabled): Self = this.set("zeroLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeroLine: Self = this.set("zeroLine", js.undefined)
  }
  
}

