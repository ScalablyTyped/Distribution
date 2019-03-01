package typings
package reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownMod.RNModalDropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDropdownProps extends js.Object {
  var accessible: js.UndefOr[scala.Boolean] = js.undefined
  var adjustFrame: js.UndefOr[js.Function1[/* positionStyle */ PositionStyle, scala.Unit]] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var defaultIndex: js.UndefOr[scala.Double] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextHighlightStyle: js.UndefOr[js.Any] = js.undefined
  var dropdownTextStyle: js.UndefOr[js.Any] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[
    reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.always | reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.never | reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.handled
  ] = js.undefined
  var onDropdownWillHide: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var onDropdownWillShow: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* index */ scala.Double, /* option */ js.Any, scala.Unit]] = js.undefined
  var options: js.UndefOr[js.Array[_]] = js.undefined
  var renderButtonText: js.UndefOr[js.Function1[/* text */ js.Any, _]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function3[/* option */ js.Any, /* index */ scala.Double, /* isSelected */ scala.Boolean, _]
  ] = js.undefined
  var renderSeparator: js.UndefOr[js.Function0[_]] = js.undefined
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var textStyle: js.UndefOr[js.Any] = js.undefined
}

object ModalDropdownProps {
  @scala.inline
  def apply(
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    adjustFrame: js.Function1[/* positionStyle */ PositionStyle, scala.Unit] = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    defaultIndex: scala.Int | scala.Double = null,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dropdownStyle: js.Any = null,
    dropdownTextHighlightStyle: js.Any = null,
    dropdownTextStyle: js.Any = null,
    keyboardShouldPersistTaps: reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.always | reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.never | reactDashNativeDashModalDashDropdownLib.reactDashNativeDashModalDashDropdownLibStrings.handled = null,
    onDropdownWillHide: js.Function0[scala.Boolean] = null,
    onDropdownWillShow: js.Function0[scala.Boolean] = null,
    onSelect: js.Function2[/* index */ scala.Double, /* option */ js.Any, scala.Unit] = null,
    options: js.Array[_] = null,
    renderButtonText: js.Function1[/* text */ js.Any, _] = null,
    renderRow: js.Function3[/* option */ js.Any, /* index */ scala.Double, /* isSelected */ scala.Boolean, _] = null,
    renderSeparator: js.Function0[_] = null,
    scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    textStyle: js.Any = null
  ): ModalDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (adjustFrame != null) __obj.updateDynamic("adjustFrame")(adjustFrame)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle)
    if (dropdownTextHighlightStyle != null) __obj.updateDynamic("dropdownTextHighlightStyle")(dropdownTextHighlightStyle)
    if (dropdownTextStyle != null) __obj.updateDynamic("dropdownTextStyle")(dropdownTextStyle)
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (onDropdownWillHide != null) __obj.updateDynamic("onDropdownWillHide")(onDropdownWillHide)
    if (onDropdownWillShow != null) __obj.updateDynamic("onDropdownWillShow")(onDropdownWillShow)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (options != null) __obj.updateDynamic("options")(options)
    if (renderButtonText != null) __obj.updateDynamic("renderButtonText")(renderButtonText)
    if (renderRow != null) __obj.updateDynamic("renderRow")(renderRow)
    if (renderSeparator != null) __obj.updateDynamic("renderSeparator")(renderSeparator)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ModalDropdownProps]
  }
}

