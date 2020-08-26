package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTH_SIDED
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_INSIDE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_INSIDE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait xAxis extends Axis {
  var avoidFirstLastClipping: js.UndefOr[Boolean] = js.native
  var labelRotationAngle: js.UndefOr[Double] = js.native
  var position: js.UndefOr[TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE] = js.native
  var yOffset: js.UndefOr[Double] = js.native
}

object xAxis {
  @scala.inline
  def apply(): xAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[xAxis]
  }
  @scala.inline
  implicit class xAxisOps[Self <: xAxis] (val x: Self) extends AnyVal {
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
    def setAvoidFirstLastClipping(value: Boolean): Self = this.set("avoidFirstLastClipping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidFirstLastClipping: Self = this.set("avoidFirstLastClipping", js.undefined)
    @scala.inline
    def setLabelRotationAngle(value: Double): Self = this.set("labelRotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelRotationAngle: Self = this.set("labelRotationAngle", js.undefined)
    @scala.inline
    def setPosition(value: TOP | BOTTOM | BOTH_SIDED | TOP_INSIDE | BOTTOM_INSIDE): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
  
}

