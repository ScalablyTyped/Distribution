package typings.reactNativeChartsWrapper.anon

import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BL_TR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM_TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BR_TL
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TL_BR
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP_BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TR_BL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var colors: js.UndefOr[js.Array[typings.reactNativeChartsWrapper.mod.Color]] = js.native
  var orientation: js.UndefOr[
    TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR
  ] = js.native
  var positions: js.UndefOr[js.Array[Double]] = js.native
}

object Angle {
  @scala.inline
  def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  @scala.inline
  implicit class AngleOps[Self <: Angle] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setColorsVarargs(value: typings.reactNativeChartsWrapper.mod.Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[typings.reactNativeChartsWrapper.mod.Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setOrientation(value: TOP_BOTTOM | TR_BL | RIGHT_LEFT | BR_TL | BOTTOM_TOP | BL_TR | LEFT_RIGHT | TL_BR): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPositionsVarargs(value: Double*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[Double]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
  }
  
}

