package typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperMod

import typings.reactDashNativeDashChartsDashWrapper.Anon_Colors
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.BOTTOM
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.CENTER
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.CIRCLE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.DEFAULT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.EMPTY
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.HORIZONTAL
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LEFT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LEFT_TO_RIGHT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.LINE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.NONE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.RIGHT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.RIGHT_TO_LEFT
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.SQUARE
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.TOP
import typings.reactDashNativeDashChartsDashWrapper.reactDashNativeDashChartsDashWrapperStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegend extends js.Object {
  var custom: js.UndefOr[Anon_Colors] = js.undefined
  var direction: js.UndefOr[LEFT_TO_RIGHT | RIGHT_TO_LEFT] = js.undefined
  var drawInside: js.UndefOr[Boolean] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontStyle: js.UndefOr[Double] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var form: js.UndefOr[NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE] = js.undefined
  var formSize: js.UndefOr[Double] = js.undefined
  var formToTextSpace: js.UndefOr[Double] = js.undefined
  var horizontalAlignment: js.UndefOr[LEFT | CENTER | RIGHT] = js.undefined
  var maxSizePercent: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[HORIZONTAL | VERTICAL] = js.undefined
  var textColor: js.UndefOr[Color] = js.undefined
  var textSize: js.UndefOr[Double] = js.undefined
  var verticalAlignment: js.UndefOr[TOP | CENTER | BOTTOM] = js.undefined
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  var xEntrySpace: js.UndefOr[Double] = js.undefined
  var yEntrySpace: js.UndefOr[Double] = js.undefined
}

object ChartLegend {
  @scala.inline
  def apply(
    custom: Anon_Colors = null,
    direction: LEFT_TO_RIGHT | RIGHT_TO_LEFT = null,
    drawInside: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontStyle: Int | Double = null,
    fontWeight: Int | Double = null,
    form: NONE | EMPTY | DEFAULT | SQUARE | CIRCLE | LINE = null,
    formSize: Int | Double = null,
    formToTextSpace: Int | Double = null,
    horizontalAlignment: LEFT | CENTER | RIGHT = null,
    maxSizePercent: Int | Double = null,
    orientation: HORIZONTAL | VERTICAL = null,
    textColor: Int | Double = null,
    textSize: Int | Double = null,
    verticalAlignment: TOP | CENTER | BOTTOM = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined,
    xEntrySpace: Int | Double = null,
    yEntrySpace: Int | Double = null
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(drawInside)) __obj.updateDynamic("drawInside")(drawInside.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formSize != null) __obj.updateDynamic("formSize")(formSize.asInstanceOf[js.Any])
    if (formToTextSpace != null) __obj.updateDynamic("formToTextSpace")(formToTextSpace.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (maxSizePercent != null) __obj.updateDynamic("maxSizePercent")(maxSizePercent.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    if (xEntrySpace != null) __obj.updateDynamic("xEntrySpace")(xEntrySpace.asInstanceOf[js.Any])
    if (yEntrySpace != null) __obj.updateDynamic("yEntrySpace")(yEntrySpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegend]
  }
}

