package typings
package rmcDashStepsLib.libStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStepsProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var current: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var iconPrefix: js.UndefOr[java.lang.String] = js.undefined
  var labelPlacement: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var progressDot: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object IStepsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    current: scala.Int | scala.Double = null,
    direction: java.lang.String = null,
    iconPrefix: java.lang.String = null,
    labelPlacement: java.lang.String = null,
    prefixCls: java.lang.String = null,
    progressDot: scala.Boolean | js.Function = null,
    size: java.lang.String = null,
    status: java.lang.String = null,
    style: js.Any = null
  ): IStepsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (progressDot != null) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (status != null) __obj.updateDynamic("status")(status)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IStepsProps]
  }
}

