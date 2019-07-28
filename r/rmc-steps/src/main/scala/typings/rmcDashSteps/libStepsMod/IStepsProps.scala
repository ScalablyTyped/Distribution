package typings.rmcDashSteps.libStepsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStepsProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var labelPlacement: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var progressDot: js.UndefOr[Boolean | js.Function] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object IStepsProps {
  @scala.inline
  def apply(
    className: String = null,
    current: Int | Double = null,
    direction: String = null,
    iconPrefix: String = null,
    labelPlacement: String = null,
    prefixCls: String = null,
    progressDot: Boolean | js.Function = null,
    size: String = null,
    status: String = null,
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

