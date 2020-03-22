package typings.rcPicker.pickerTriggerMod

import typings.rcPicker.rcPickerStrings.ltr
import typings.rcPicker.rcPickerStrings.rtl
import typings.rcTrigger.interfaceMod.AlignType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerTriggerProps extends js.Object {
  var children: ReactElement
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var dropdownAlign: js.UndefOr[AlignType] = js.undefined
  var dropdownClassName: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  var popupElement: ReactElement
  var popupPlacement: js.UndefOr[Placement] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: String
  var range: js.UndefOr[Boolean] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: Boolean
}

object PickerTriggerProps {
  @scala.inline
  def apply(
    children: ReactElement,
    popupElement: ReactElement,
    prefixCls: String,
    visible: Boolean,
    direction: ltr | rtl = null,
    dropdownAlign: AlignType = null,
    dropdownClassName: String = null,
    getPopupContainer: /* node */ HTMLElement => HTMLElement = null,
    popupPlacement: Placement = null,
    popupStyle: CSSProperties = null,
    range: js.UndefOr[Boolean] = js.undefined,
    transitionName: String = null
  ): PickerTriggerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (dropdownAlign != null) __obj.updateDynamic("dropdownAlign")(dropdownAlign.asInstanceOf[js.Any])
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerTriggerProps]
  }
}

