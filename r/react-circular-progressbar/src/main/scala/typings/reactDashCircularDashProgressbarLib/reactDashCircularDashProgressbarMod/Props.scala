package typings
package reactDashCircularDashProgressbarLib.reactDashCircularDashProgressbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var background: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundPadding: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[ProgressbarClasses] = js.undefined
  var counterClockwise: js.UndefOr[scala.Boolean] = js.undefined
  var initialAnimation: js.UndefOr[scala.Boolean] = js.undefined
  var percentage: scala.Double
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var styles: js.UndefOr[ProgressbarStyles] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    percentage: scala.Double,
    background: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundPadding: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    classes: ProgressbarClasses = null,
    counterClockwise: js.UndefOr[scala.Boolean] = js.undefined,
    initialAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    strokeWidth: scala.Int | scala.Double = null,
    styles: ProgressbarStyles = null,
    text: java.lang.String = null
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

