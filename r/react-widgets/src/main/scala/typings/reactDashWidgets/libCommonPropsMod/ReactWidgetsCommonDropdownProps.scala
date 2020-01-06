package typings.reactDashWidgets.libCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWidgetsCommonDropdownProps extends ReactWidgetsCommonProps {
  /**
    * Show "drop up" not "drop down"
    * @default false
    */
  var dropUp: js.UndefOr[Boolean] = js.undefined
}

object ReactWidgetsCommonDropdownProps {
  @scala.inline
  def apply(
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    readOnly: Boolean | js.Array[_] = null
  ): ReactWidgetsCommonDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWidgetsCommonDropdownProps]
  }
}

