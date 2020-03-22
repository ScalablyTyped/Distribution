package typings.rcPicker.getRangesMod

import typings.rcPicker.interfaceMod.Components
import typings.rcPicker.interfaceMod.Locale
import typings.rcPicker.interfaceMod.RangeList
import typings.rcPicker.rcPickerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangesProps extends js.Object {
  var components: js.UndefOr[Components] = js.undefined
  var locale: Locale
  var needConfirmButton: Boolean
  var okDisabled: js.UndefOr[Boolean] = js.undefined
  var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
  var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.undefined
  var prefixCls: String
  var rangeList: js.UndefOr[RangeList] = js.undefined
}

object RangesProps {
  @scala.inline
  def apply(
    locale: Locale,
    needConfirmButton: Boolean,
    prefixCls: String,
    components: Components = null,
    okDisabled: js.UndefOr[Boolean] = js.undefined,
    onNow: js.Function0[Unit] | `false` = null,
    onOk: js.Function0[Unit] | `false` = null,
    rangeList: RangeList = null
  ): RangesProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (!js.isUndefined(okDisabled)) __obj.updateDynamic("okDisabled")(okDisabled.asInstanceOf[js.Any])
    if (onNow != null) __obj.updateDynamic("onNow")(onNow.asInstanceOf[js.Any])
    if (onOk != null) __obj.updateDynamic("onOk")(onOk.asInstanceOf[js.Any])
    if (rangeList != null) __obj.updateDynamic("rangeList")(rangeList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangesProps]
  }
}

