package typings.rcCascader.cascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderState extends js.Object {
  var activeValue: js.UndefOr[CascaderValueType] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prevProps: js.UndefOr[CascaderProps] = js.undefined
  var value: js.UndefOr[CascaderValueType] = js.undefined
}

object CascaderState {
  @scala.inline
  def apply(
    activeValue: CascaderValueType = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prevProps: CascaderProps = null,
    value: CascaderValueType = null
  ): CascaderState = {
    val __obj = js.Dynamic.literal()
    if (activeValue != null) __obj.updateDynamic("activeValue")(activeValue.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.get.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderState]
  }
}

