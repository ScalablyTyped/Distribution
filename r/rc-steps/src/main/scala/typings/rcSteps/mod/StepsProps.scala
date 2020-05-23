package typings.rcSteps.mod

import typings.rcSteps.anon.Error
import typings.rcSteps.rcStepsStrings.error
import typings.rcSteps.rcStepsStrings.finish
import typings.rcSteps.rcStepsStrings.horizontal
import typings.rcSteps.rcStepsStrings.navigation
import typings.rcSteps.rcStepsStrings.process
import typings.rcSteps.rcStepsStrings.small
import typings.rcSteps.rcStepsStrings.vertical
import typings.rcSteps.rcStepsStrings.wait
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepsProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[Error] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
  var labelPlacement: js.UndefOr[vertical] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
  // The following are undocumented upstream, but listed in PropTypes
  var prefixCls: js.UndefOr[String] = js.undefined
  var progressDot: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small] = js.undefined
  var status: js.UndefOr[error | process | finish | wait] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[typings.rcSteps.rcStepsStrings.default | navigation] = js.undefined
}

object StepsProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    current: js.UndefOr[Double] = js.undefined,
    direction: horizontal | vertical = null,
    iconPrefix: String = null,
    icons: Error = null,
    initial: js.UndefOr[Double] = js.undefined,
    labelPlacement: vertical = null,
    onChange: /* current */ Double => Unit = null,
    prefixCls: String = null,
    progressDot: js.UndefOr[Boolean] = js.undefined,
    size: small = null,
    status: error | process | finish | wait = null,
    style: CSSProperties = null,
    `type`: typings.rcSteps.rcStepsStrings.default | navigation = null
  ): StepsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(progressDot)) __obj.updateDynamic("progressDot")(progressDot.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepsProps]
  }
}

