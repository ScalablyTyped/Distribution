package typings.reactDashWidgets.libCommonPropsMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWidgetsCommonDropdownProps[C] extends ReactWidgetsCommonProps[C] {
  /**
    * Show "drop up" not "drop down"
    * @default false
    */
  var dropUp: js.UndefOr[Boolean] = js.undefined
}

object ReactWidgetsCommonDropdownProps {
  @scala.inline
  def apply[C](
    children: ReactNode = null,
    disabled: Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isRtl: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    readOnly: Boolean | js.Array[_] = null,
    ref: LegacyRef[C] = null
  ): ReactWidgetsCommonDropdownProps[C] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dropUp)) __obj.updateDynamic("dropUp")(dropUp)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isRtl)) __obj.updateDynamic("isRtl")(isRtl)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactWidgetsCommonDropdownProps[C]]
  }
}

