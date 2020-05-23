package typings.reactCircularProgressbar.circularProgressbarWithChildrenMod

import typings.react.mod.ReactNode
import typings.reactCircularProgressbar.anon.Background
import typings.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-circular-progressbar.react-circular-progressbar/dist/types.CircularProgressbarWrapperProps & {  children ? :react.react.ReactNode} */
trait CircularProgressbarWithChildrenProps extends js.Object {
  var background: js.UndefOr[Boolean] = js.undefined
  var backgroundPadding: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var circleRatio: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[Background] = js.undefined
  var counterClockwise: js.UndefOr[Boolean] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var styles: js.UndefOr[CircularProgressbarStyles] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: Double
}

object CircularProgressbarWithChildrenProps {
  @scala.inline
  def apply(
    value: Double,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundPadding: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    circleRatio: js.UndefOr[Double] = js.undefined,
    className: String = null,
    classes: Background = null,
    counterClockwise: js.UndefOr[Boolean] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    styles: CircularProgressbarStyles = null,
    text: String = null
  ): CircularProgressbarWithChildrenProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundPadding)) __obj.updateDynamic("backgroundPadding")(backgroundPadding.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circleRatio)) __obj.updateDynamic("circleRatio")(circleRatio.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(counterClockwise)) __obj.updateDynamic("counterClockwise")(counterClockwise.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarWithChildrenProps]
  }
}

