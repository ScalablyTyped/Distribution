package typings.rcPicker.panelContextMod

import typings.rcPicker.interfaceMod.OnSelect
import typings.rcPicker.rcPickerStrings.key
import typings.rcPicker.rcPickerStrings.mouse
import typings.rcPicker.rcPickerStrings.submit
import typings.react.mod.MutableRefObject
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelContextProps extends js.Object {
  /** Only used for TimePicker and this is a deprecated prop */
  var defaultOpenValue: js.UndefOr[js.Any] = js.undefined
  /** Only work with time panel */
  var hideHeader: js.UndefOr[Boolean] = js.undefined
  var hideNextBtn: js.UndefOr[Boolean] = js.undefined
  var hidePrevBtn: js.UndefOr[Boolean] = js.undefined
  var hideRanges: js.UndefOr[Boolean] = js.undefined
  var onDateMouseEnter: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  var onDateMouseLeave: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  var onSelect: js.UndefOr[OnSelect[_]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var operationRef: js.UndefOr[MutableRefObject[ContextOperationRefProps | Null]] = js.undefined
  var panelRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
}

object PanelContextProps {
  @scala.inline
  def apply(
    defaultOpenValue: js.Any = null,
    hideHeader: js.UndefOr[Boolean] = js.undefined,
    hideNextBtn: js.UndefOr[Boolean] = js.undefined,
    hidePrevBtn: js.UndefOr[Boolean] = js.undefined,
    hideRanges: js.UndefOr[Boolean] = js.undefined,
    onDateMouseEnter: /* date */ js.Any => Unit = null,
    onDateMouseLeave: /* date */ js.Any => Unit = null,
    onSelect: (_, /* type */ key | mouse | submit) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    operationRef: MutableRefObject[ContextOperationRefProps | Null] = null,
    panelRef: js.UndefOr[Null | Ref[HTMLDivElement]] = js.undefined
  ): PanelContextProps = {
    val __obj = js.Dynamic.literal()
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue.asInstanceOf[js.Any])
    if (!js.isUndefined(hideHeader)) __obj.updateDynamic("hideHeader")(hideHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNextBtn)) __obj.updateDynamic("hideNextBtn")(hideNextBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePrevBtn)) __obj.updateDynamic("hidePrevBtn")(hidePrevBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideRanges)) __obj.updateDynamic("hideRanges")(hideRanges.get.asInstanceOf[js.Any])
    if (onDateMouseEnter != null) __obj.updateDynamic("onDateMouseEnter")(js.Any.fromFunction1(onDateMouseEnter))
    if (onDateMouseLeave != null) __obj.updateDynamic("onDateMouseLeave")(js.Any.fromFunction1(onDateMouseLeave))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (operationRef != null) __obj.updateDynamic("operationRef")(operationRef.asInstanceOf[js.Any])
    if (!js.isUndefined(panelRef)) __obj.updateDynamic("panelRef")(panelRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelContextProps]
  }
}

