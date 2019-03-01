package typings
package reactDashWidgetsLib.libCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWidgetsCommonDropdownProps[C] extends ReactWidgetsCommonProps[C] {
  /**
    * Show "drop up" not "drop down"
    * @default false
    */
  var dropUp: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactWidgetsCommonDropdownProps {
  @scala.inline
  def apply[C](
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    disabled: scala.Boolean | js.Array[_] = null,
    dropUp: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isRtl: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    readOnly: scala.Boolean | js.Array[_] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[C] = null
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

