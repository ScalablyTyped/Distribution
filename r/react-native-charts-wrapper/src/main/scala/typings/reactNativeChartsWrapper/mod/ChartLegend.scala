package typings.reactNativeChartsWrapper.mod

import typings.reactNativeChartsWrapper.anon.Colors
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.BOTTOM
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CENTER
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.CIRCLE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.DEFAULT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.EMPTY
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.HORIZONTAL
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LEFT_TO_RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.LINE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.NONE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.RIGHT_TO_LEFT
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.SQUARE
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.TOP
import typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartLegend extends js.Object {
  var custom: js.UndefOr[Colors] = js.native
  var direction: js.UndefOr[LEFT_TO_RIGHT | RIGHT_TO_LEFT] = js.native
  var drawInside: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontStyle: js.UndefOr[Double] = js.native
  var fontWeight: js.UndefOr[Double] = js.native
  var form: js.UndefOr[NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE] = js.native
  var formSize: js.UndefOr[Double] = js.native
  var formToTextSpace: js.UndefOr[Double] = js.native
  var horizontalAlignment: js.UndefOr[LEFT | CENTER | RIGHT] = js.native
  var maxSizePercent: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[HORIZONTAL | VERTICAL] = js.native
  var textColor: js.UndefOr[Color] = js.native
  var textSize: js.UndefOr[Double] = js.native
  var verticalAlignment: js.UndefOr[TOP | CENTER | BOTTOM] = js.native
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
  var xEntrySpace: js.UndefOr[Double] = js.native
  var yEntrySpace: js.UndefOr[Double] = js.native
}

object ChartLegend {
  @scala.inline
  def apply(): ChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegend]
  }
  @scala.inline
  implicit class ChartLegendOps[Self <: ChartLegend] (val x: Self) extends AnyVal {
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
    def setCustom(value: Colors): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDirection(value: LEFT_TO_RIGHT | RIGHT_TO_LEFT): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDrawInside(value: Boolean): Self = this.set("drawInside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawInside: Self = this.set("drawInside", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: Double): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setForm(value: NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormSize(value: Double): Self = this.set("formSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormSize: Self = this.set("formSize", js.undefined)
    @scala.inline
    def setFormToTextSpace(value: Double): Self = this.set("formToTextSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormToTextSpace: Self = this.set("formToTextSpace", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: LEFT | CENTER | RIGHT): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setMaxSizePercent(value: Double): Self = this.set("maxSizePercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSizePercent: Self = this.set("maxSizePercent", js.undefined)
    @scala.inline
    def setOrientation(value: HORIZONTAL | VERTICAL): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setTextColor(value: Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: TOP | CENTER | BOTTOM): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = this.set("wordWrapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrapEnabled: Self = this.set("wordWrapEnabled", js.undefined)
    @scala.inline
    def setXEntrySpace(value: Double): Self = this.set("xEntrySpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXEntrySpace: Self = this.set("xEntrySpace", js.undefined)
    @scala.inline
    def setYEntrySpace(value: Double): Self = this.set("yEntrySpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYEntrySpace: Self = this.set("yEntrySpace", js.undefined)
  }
  
}

