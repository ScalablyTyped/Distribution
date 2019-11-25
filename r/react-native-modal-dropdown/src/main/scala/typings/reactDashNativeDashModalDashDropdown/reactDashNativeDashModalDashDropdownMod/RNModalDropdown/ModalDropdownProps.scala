package typings.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownMod.RNModalDropdown

import typings.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.always
import typings.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.handled
import typings.reactDashNativeDashModalDashDropdown.reactDashNativeDashModalDashDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDropdownProps extends js.Object {
  var accessible: js.UndefOr[Boolean] = js.undefined
  var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, Unit]] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var defaultIndex: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextHighlightStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextStyle: js.UndefOr[js.Any] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[always | never | handled] = js.undefined
  var onDropdownWillHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var onDropdownWillShow: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* index */ Double, /* option */ js.Any, Unit]] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var renderButtonText: js.UndefOr[js.Function1[/* text */ js.Any, _]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function3[/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean, _]
  ] = js.undefined
  var renderSeparator: js.UndefOr[js.Function0[_]] = js.undefined
  var scrollEnabled: js.UndefOr[Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var textStyle: js.UndefOr[js.Any] = js.undefined
}

object ModalDropdownProps {
  @scala.inline
  def apply(
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustFrame: /* positionStyle */ PositionStyle => Unit = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownStyle: js.Any = null,
    dropdownTextHighlightStyle: js.Any = null,
    dropdownTextStyle: js.Any = null,
    keyboardShouldPersistTaps: always | never | handled = null,
    onDropdownWillHide: () => Boolean = null,
    onDropdownWillShow: () => Boolean = null,
    onSelect: (/* index */ Double, /* option */ js.Any) => Unit = null,
    options: js.Array[_] = null,
    renderButtonText: /* text */ js.Any => _ = null,
    renderRow: (/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean) => _ = null,
    renderSeparator: () => _ = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    textStyle: js.Any = null
  ): ModalDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (adjustFrame != null) __obj.updateDynamic("adjustFrame")(js.Any.fromFunction1(adjustFrame))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (dropdownTextHighlightStyle != null) __obj.updateDynamic("dropdownTextHighlightStyle")(dropdownTextHighlightStyle.asInstanceOf[js.Any])
    if (dropdownTextStyle != null) __obj.updateDynamic("dropdownTextStyle")(dropdownTextStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onDropdownWillHide != null) __obj.updateDynamic("onDropdownWillHide")(js.Any.fromFunction0(onDropdownWillHide))
    if (onDropdownWillShow != null) __obj.updateDynamic("onDropdownWillShow")(js.Any.fromFunction0(onDropdownWillShow))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderButtonText != null) __obj.updateDynamic("renderButtonText")(js.Any.fromFunction1(renderButtonText))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction3(renderRow))
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(js.Any.fromFunction0(renderSeparator))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalDropdownProps]
  }
}

