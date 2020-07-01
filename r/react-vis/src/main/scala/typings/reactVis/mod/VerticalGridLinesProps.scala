package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerticalGridLinesProps extends js.Object {
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
   // default: 'vertical'
  var attr: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[vertical] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var innerHeight: js.UndefOr[Double] = js.undefined
  var innerWidth: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var marginBottom: js.UndefOr[Double] = js.undefined
  var marginLeft: js.UndefOr[Double] = js.undefined
  var marginRight: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tickTotal: js.UndefOr[Double] = js.undefined
  var tickValues: js.UndefOr[js.Array[_]] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
   // default: 'x'
  var width: js.UndefOr[Double] = js.undefined
}

object VerticalGridLinesProps {
  @scala.inline
  def apply(
    animation: String | AnimationParam | Boolean = null,
    attr: String = null,
    direction: vertical = null,
    height: js.UndefOr[Double] = js.undefined,
    innerHeight: js.UndefOr[Double] = js.undefined,
    innerWidth: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    tickTotal: js.UndefOr[Double] = js.undefined,
    tickValues: js.Array[_] = null,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): VerticalGridLinesProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerHeight)) __obj.updateDynamic("innerHeight")(innerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tickTotal)) __obj.updateDynamic("tickTotal")(tickTotal.get.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalGridLinesProps]
  }
}

