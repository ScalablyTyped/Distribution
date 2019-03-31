package typings
package rmcDashStepsLib.libStepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStepProps extends js.Object {
  var adjustMarginRight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[js.Any] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var iconPrefix: js.UndefOr[java.lang.String] = js.undefined
  var itemWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var progressDot: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var stepNumber: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var wrapperStyle: js.UndefOr[js.Any] = js.undefined
}

object IStepProps {
  @scala.inline
  def apply(
    adjustMarginRight: scala.Double | java.lang.String = null,
    className: java.lang.String = null,
    description: js.Any = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    iconPrefix: java.lang.String = null,
    itemWidth: scala.Double | java.lang.String = null,
    prefixCls: java.lang.String = null,
    progressDot: scala.Boolean | js.Function = null,
    status: java.lang.String = null,
    stepNumber: scala.Int | scala.Double = null,
    style: js.Any = null,
    title: js.Any = null,
    wrapperStyle: js.Any = null
  ): IStepProps = {
    val __obj = js.Dynamic.literal()
    if (adjustMarginRight != null) __obj.updateDynamic("adjustMarginRight")(adjustMarginRight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (stepNumber != null) __obj.updateDynamic("stepNumber")(stepNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[IStepProps]
  }
}

