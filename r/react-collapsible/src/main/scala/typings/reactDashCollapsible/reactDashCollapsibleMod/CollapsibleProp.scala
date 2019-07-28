package typings.reactDashCollapsible.reactDashCollapsibleMod

import typings.react.reactMod.ReactNode
import typings.reactDashCollapsible.reactDashCollapsibleStrings.auto
import typings.reactDashCollapsible.reactDashCollapsibleStrings.hidden
import typings.reactDashCollapsible.reactDashCollapsibleStrings.inherit
import typings.reactDashCollapsible.reactDashCollapsibleStrings.initial
import typings.reactDashCollapsible.reactDashCollapsibleStrings.scroll
import typings.reactDashCollapsible.reactDashCollapsibleStrings.unset
import typings.reactDashCollapsible.reactDashCollapsibleStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProp extends js.Object {
  var accordionPosition: js.UndefOr[String | Double] = js.undefined
  var children: js.UndefOr[String | ReactNode] = js.undefined
  var classParentString: js.UndefOr[String] = js.undefined
  var contentInnerClassName: js.UndefOr[String] = js.undefined
  var contentOuterClassName: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var handleTriggerClick: js.UndefOr[js.Function1[/* accordionPosition */ js.UndefOr[String | Double], Unit]] = js.undefined
  var lazyRender: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function0[Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var openedClassName: js.UndefOr[String] = js.undefined
  var overflowWhenOpen: js.UndefOr[hidden | visible | auto | scroll | inherit | initial | unset] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var transitionCloseTime: js.UndefOr[Double] = js.undefined
  var transitionTime: js.UndefOr[Double] = js.undefined
  var trigger: js.UndefOr[String | ReactNode] = js.undefined
  var triggerClassName: js.UndefOr[String] = js.undefined
  var triggerDisabled: js.UndefOr[Boolean] = js.undefined
  var triggerOpenedClassName: js.UndefOr[String] = js.undefined
  var triggerSibling: js.UndefOr[ReactNode | String | js.Function0[Unit]] = js.undefined
  var triggerStyle: js.UndefOr[js.Object] = js.undefined
  var triggerTagName: js.UndefOr[String] = js.undefined
  var triggerWhenOpen: js.UndefOr[String | ReactNode] = js.undefined
}

object CollapsibleProp {
  @scala.inline
  def apply(
    accordionPosition: String | Double = null,
    children: String | ReactNode = null,
    classParentString: String = null,
    contentInnerClassName: String = null,
    contentOuterClassName: String = null,
    easing: String = null,
    handleTriggerClick: /* accordionPosition */ js.UndefOr[String | Double] => Unit = null,
    lazyRender: js.UndefOr[Boolean] = js.undefined,
    onClose: () => Unit = null,
    onClosing: () => Unit = null,
    onOpen: () => Unit = null,
    onOpening: () => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    openedClassName: String = null,
    overflowWhenOpen: hidden | visible | auto | scroll | inherit | initial | unset = null,
    tabIndex: Int | Double = null,
    transitionCloseTime: Int | Double = null,
    transitionTime: Int | Double = null,
    trigger: String | ReactNode = null,
    triggerClassName: String = null,
    triggerDisabled: js.UndefOr[Boolean] = js.undefined,
    triggerOpenedClassName: String = null,
    triggerSibling: ReactNode | String | js.Function0[Unit] = null,
    triggerStyle: js.Object = null,
    triggerTagName: String = null,
    triggerWhenOpen: String | ReactNode = null
  ): CollapsibleProp = {
    val __obj = js.Dynamic.literal()
    if (accordionPosition != null) __obj.updateDynamic("accordionPosition")(accordionPosition.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classParentString != null) __obj.updateDynamic("classParentString")(classParentString)
    if (contentInnerClassName != null) __obj.updateDynamic("contentInnerClassName")(contentInnerClassName)
    if (contentOuterClassName != null) __obj.updateDynamic("contentOuterClassName")(contentOuterClassName)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (handleTriggerClick != null) __obj.updateDynamic("handleTriggerClick")(js.Any.fromFunction1(handleTriggerClick))
    if (!js.isUndefined(lazyRender)) __obj.updateDynamic("lazyRender")(lazyRender)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onClosing != null) __obj.updateDynamic("onClosing")(js.Any.fromFunction0(onClosing))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpening != null) __obj.updateDynamic("onOpening")(js.Any.fromFunction0(onOpening))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (openedClassName != null) __obj.updateDynamic("openedClassName")(openedClassName)
    if (overflowWhenOpen != null) __obj.updateDynamic("overflowWhenOpen")(overflowWhenOpen.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (transitionCloseTime != null) __obj.updateDynamic("transitionCloseTime")(transitionCloseTime.asInstanceOf[js.Any])
    if (transitionTime != null) __obj.updateDynamic("transitionTime")(transitionTime.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerClassName != null) __obj.updateDynamic("triggerClassName")(triggerClassName)
    if (!js.isUndefined(triggerDisabled)) __obj.updateDynamic("triggerDisabled")(triggerDisabled)
    if (triggerOpenedClassName != null) __obj.updateDynamic("triggerOpenedClassName")(triggerOpenedClassName)
    if (triggerSibling != null) __obj.updateDynamic("triggerSibling")(triggerSibling.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle)
    if (triggerTagName != null) __obj.updateDynamic("triggerTagName")(triggerTagName)
    if (triggerWhenOpen != null) __obj.updateDynamic("triggerWhenOpen")(triggerWhenOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsibleProp]
  }
}

