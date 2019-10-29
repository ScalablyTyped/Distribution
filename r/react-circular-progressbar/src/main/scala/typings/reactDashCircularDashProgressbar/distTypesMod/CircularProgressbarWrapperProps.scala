package typings.reactDashCircularDashProgressbar.distTypesMod

import typings.reactDashCircularDashProgressbar.Anon_Background
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularProgressbarWrapperProps extends js.Object {
  var background: js.UndefOr[Boolean] = js.undefined
  var backgroundPadding: js.UndefOr[Double] = js.undefined
  var circleRatio: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[Anon_Background] = js.undefined
  var counterClockwise: js.UndefOr[Boolean] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[CircularProgressbarStyles] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: Double
}

object CircularProgressbarWrapperProps {
  @scala.inline
  def apply(
    value: Double,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundPadding: Int | Double = null,
    circleRatio: Int | Double = null,
    className: String = null,
    classes: Anon_Background = null,
    counterClockwise: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    strokeWidth: Int | Double = null,
    styles: CircularProgressbarStyles = null,
    text: String = null
  ): CircularProgressbarWrapperProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (circleRatio != null) __obj.updateDynamic("circleRatio")(circleRatio.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(counterClockwise)) __obj.updateDynamic("counterClockwise")(counterClockwise)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CircularProgressbarWrapperProps]
  }
}

