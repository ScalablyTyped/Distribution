package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAxisProps extends js.Object {
   // default: 'left'
  var attr: js.UndefOr[String] = js.undefined
   // default: 'y'
  var attrAxis: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hideLine: js.UndefOr[Boolean] = js.undefined
  var hideTicks: js.UndefOr[Boolean] = js.undefined
  var innerHeight: js.UndefOr[Double] = js.undefined
  var innerWidth: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var marginBottom: js.UndefOr[Double] = js.undefined
  var marginLeft: js.UndefOr[Double] = js.undefined
  var marginRight: js.UndefOr[Double] = js.undefined
  var marginTop: js.UndefOr[Double] = js.undefined
  var on0: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[left | right] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  var tickLabelAngle: js.UndefOr[Double] = js.undefined
  var tickPadding: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var tickSizeInner: js.UndefOr[Double] = js.undefined
  var tickSizeOuter: js.UndefOr[Double] = js.undefined
  var tickTotal: js.UndefOr[Double] = js.undefined
  var tickValues: js.UndefOr[js.Array[_]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
   // default: 'x'
  var width: js.UndefOr[Double] = js.undefined
}

object YAxisProps {
  @scala.inline
  def apply(
    attr: String = null,
    attrAxis: String = null,
    className: String = null,
    height: js.UndefOr[Double] = js.undefined,
    hideLine: js.UndefOr[Boolean] = js.undefined,
    hideTicks: js.UndefOr[Boolean] = js.undefined,
    innerHeight: js.UndefOr[Double] = js.undefined,
    innerWidth: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    on0: js.UndefOr[Boolean] = js.undefined,
    orientation: left | right = null,
    style: CSSProperties = null,
    tickFormat: /* tick */ js.Any => String = null,
    tickLabelAngle: js.UndefOr[Double] = js.undefined,
    tickPadding: js.UndefOr[Double] = js.undefined,
    tickSize: js.UndefOr[Double] = js.undefined,
    tickSizeInner: js.UndefOr[Double] = js.undefined,
    tickSizeOuter: js.UndefOr[Double] = js.undefined,
    tickTotal: js.UndefOr[Double] = js.undefined,
    tickValues: js.Array[_] = null,
    title: String = null,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): YAxisProps = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (attrAxis != null) __obj.updateDynamic("attrAxis")(attrAxis.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideLine)) __obj.updateDynamic("hideLine")(hideLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTicks)) __obj.updateDynamic("hideTicks")(hideTicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerHeight)) __obj.updateDynamic("innerHeight")(innerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerWidth)) __obj.updateDynamic("innerWidth")(innerWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(on0)) __obj.updateDynamic("on0")(on0.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(js.Any.fromFunction1(tickFormat))
    if (!js.isUndefined(tickLabelAngle)) __obj.updateDynamic("tickLabelAngle")(tickLabelAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickPadding)) __obj.updateDynamic("tickPadding")(tickPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSize)) __obj.updateDynamic("tickSize")(tickSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSizeInner)) __obj.updateDynamic("tickSizeInner")(tickSizeInner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickSizeOuter)) __obj.updateDynamic("tickSizeOuter")(tickSizeOuter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickTotal)) __obj.updateDynamic("tickTotal")(tickTotal.get.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxisProps]
  }
}

