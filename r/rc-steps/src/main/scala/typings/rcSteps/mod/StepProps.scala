package typings.rcSteps.mod

import typings.rcSteps.AnonError
import typings.rcSteps.rcStepsStrings.error
import typings.rcSteps.rcStepsStrings.finish
import typings.rcSteps.rcStepsStrings.process
import typings.rcSteps.rcStepsStrings.wait
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends js.Object {
  var description: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[AnonError] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onStepClick: js.UndefOr[js.Function1[/* stepIndex */ Double, Unit]] = js.undefined
  // The following are undocumented upstream, but listed in PropTypes
  var prefixCls: js.UndefOr[String] = js.undefined
  var progressDot: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[error | process | finish | wait] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[ReactNode] = js.undefined
  var tailContent: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    description: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    iconPrefix: String = null,
    icons: AnonError = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onStepClick: /* stepIndex */ Double => Unit = null,
    prefixCls: String = null,
    progressDot: js.UndefOr[Boolean] = js.undefined,
    status: error | process | finish | wait = null,
    style: CSSProperties = null,
    subTitle: ReactNode = null,
    tailContent: ReactNode = null,
    title: ReactNode = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onStepClick != null) __obj.updateDynamic("onStepClick")(js.Any.fromFunction1(onStepClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(progressDot)) __obj.updateDynamic("progressDot")(progressDot.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (tailContent != null) __obj.updateDynamic("tailContent")(tailContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

