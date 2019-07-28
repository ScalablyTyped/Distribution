package typings.reactDashCircularDashProgressbar.reactDashCircularDashProgressbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var background: js.UndefOr[Boolean] = js.undefined
  var backgroundPadding: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[ProgressbarClasses] = js.undefined
  var counterClockwise: js.UndefOr[Boolean] = js.undefined
  var initialAnimation: js.UndefOr[Boolean] = js.undefined
  var percentage: Double
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[ProgressbarStyles] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    percentage: Double,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundPadding: Int | Double = null,
    className: String = null,
    classes: ProgressbarClasses = null,
    counterClockwise: js.UndefOr[Boolean] = js.undefined,
    initialAnimation: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: Int | Double = null,
    styles: ProgressbarStyles = null,
    text: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(percentage = percentage)
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background)
    if (backgroundPadding != null) __obj.updateDynamic("backgroundPadding")(backgroundPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(counterClockwise)) __obj.updateDynamic("counterClockwise")(counterClockwise)
    if (!js.isUndefined(initialAnimation)) __obj.updateDynamic("initialAnimation")(initialAnimation)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Props]
  }
}

