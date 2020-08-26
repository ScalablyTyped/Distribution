package typings.reactGaugeChart.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeChartProps extends js.Object {
  var animDelay: js.UndefOr[Double] = js.native
  var animate: js.UndefOr[Boolean] = js.native
  var arcPadding: js.UndefOr[Double] = js.native
  var arcWidth: js.UndefOr[Double] = js.native
  var arcsLength: js.UndefOr[js.Array[Double]] = js.native
  var className: js.UndefOr[String] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var cornerRadius: js.UndefOr[Double] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var formatTextValue: js.UndefOr[js.Function1[/* value */ String, String]] = js.native
  var hideText: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var marginInPercent: js.UndefOr[Double] = js.native
  var needleBaseColor: js.UndefOr[String] = js.native
  var needleColor: js.UndefOr[String] = js.native
  var nrOfLevels: js.UndefOr[Double] = js.native
  var percent: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var textColor: js.UndefOr[String] = js.native
}

object GaugeChartProps {
  @scala.inline
  def apply(id: String): GaugeChartProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeChartProps]
  }
  @scala.inline
  implicit class GaugeChartPropsOps[Self <: GaugeChartProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimDelay(value: Double): Self = this.set("animDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimDelay: Self = this.set("animDelay", js.undefined)
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setArcPadding(value: Double): Self = this.set("arcPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcPadding: Self = this.set("arcPadding", js.undefined)
    @scala.inline
    def setArcWidth(value: Double): Self = this.set("arcWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcWidth: Self = this.set("arcWidth", js.undefined)
    @scala.inline
    def setArcsLengthVarargs(value: Double*): Self = this.set("arcsLength", js.Array(value :_*))
    @scala.inline
    def setArcsLength(value: js.Array[Double]): Self = this.set("arcsLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcsLength: Self = this.set("arcsLength", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFormatTextValue(value: /* value */ String => String): Self = this.set("formatTextValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatTextValue: Self = this.set("formatTextValue", js.undefined)
    @scala.inline
    def setHideText(value: Boolean): Self = this.set("hideText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideText: Self = this.set("hideText", js.undefined)
    @scala.inline
    def setMarginInPercent(value: Double): Self = this.set("marginInPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginInPercent: Self = this.set("marginInPercent", js.undefined)
    @scala.inline
    def setNeedleBaseColor(value: String): Self = this.set("needleBaseColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleBaseColor: Self = this.set("needleBaseColor", js.undefined)
    @scala.inline
    def setNeedleColor(value: String): Self = this.set("needleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedleColor: Self = this.set("needleColor", js.undefined)
    @scala.inline
    def setNrOfLevels(value: Double): Self = this.set("nrOfLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNrOfLevels: Self = this.set("nrOfLevels", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

