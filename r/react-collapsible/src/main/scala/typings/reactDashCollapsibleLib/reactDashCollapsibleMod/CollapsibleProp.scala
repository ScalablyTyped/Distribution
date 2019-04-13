package typings
package reactDashCollapsibleLib.reactDashCollapsibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleProp extends js.Object {
  var accordionPosition: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var children: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var classParentString: js.UndefOr[java.lang.String] = js.undefined
  var contentInnerClassName: js.UndefOr[java.lang.String] = js.undefined
  var contentOuterClassName: js.UndefOr[java.lang.String] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var handleTriggerClick: js.UndefOr[
    js.Function1[/* accordionPosition */ js.UndefOr[java.lang.String | scala.Double], scala.Unit]
  ] = js.undefined
  var lazyRender: js.UndefOr[scala.Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClosing: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOpening: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var openedClassName: js.UndefOr[java.lang.String] = js.undefined
  var overflowWhenOpen: js.UndefOr[
    reactDashCollapsibleLib.reactDashCollapsibleLibStrings.hidden | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.visible | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.auto | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.scroll | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.inherit | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.initial | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.unset
  ] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var transitionCloseTime: js.UndefOr[scala.Double] = js.undefined
  var transitionTime: js.UndefOr[scala.Double] = js.undefined
  var trigger: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var triggerClassName: js.UndefOr[java.lang.String] = js.undefined
  var triggerDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var triggerOpenedClassName: js.UndefOr[java.lang.String] = js.undefined
  var triggerSibling: js.UndefOr[reactLib.reactMod.ReactNode | java.lang.String | js.Function0[scala.Unit]] = js.undefined
  var triggerStyle: js.UndefOr[js.Object] = js.undefined
  var triggerTagName: js.UndefOr[java.lang.String] = js.undefined
  var triggerWhenOpen: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
}

object CollapsibleProp {
  @scala.inline
  def apply(
    accordionPosition: java.lang.String | scala.Double = null,
    children: java.lang.String | reactLib.reactMod.ReactNode = null,
    classParentString: java.lang.String = null,
    contentInnerClassName: java.lang.String = null,
    contentOuterClassName: java.lang.String = null,
    easing: java.lang.String = null,
    handleTriggerClick: /* accordionPosition */ js.UndefOr[java.lang.String | scala.Double] => scala.Unit = null,
    lazyRender: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: () => scala.Unit = null,
    onClosing: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    onOpening: () => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openedClassName: java.lang.String = null,
    overflowWhenOpen: reactDashCollapsibleLib.reactDashCollapsibleLibStrings.hidden | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.visible | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.auto | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.scroll | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.inherit | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.initial | reactDashCollapsibleLib.reactDashCollapsibleLibStrings.unset = null,
    tabIndex: scala.Int | scala.Double = null,
    transitionCloseTime: scala.Int | scala.Double = null,
    transitionTime: scala.Int | scala.Double = null,
    trigger: java.lang.String | reactLib.reactMod.ReactNode = null,
    triggerClassName: java.lang.String = null,
    triggerDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    triggerOpenedClassName: java.lang.String = null,
    triggerSibling: reactLib.reactMod.ReactNode | java.lang.String | js.Function0[scala.Unit] = null,
    triggerStyle: js.Object = null,
    triggerTagName: java.lang.String = null,
    triggerWhenOpen: java.lang.String | reactLib.reactMod.ReactNode = null
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

