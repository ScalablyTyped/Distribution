package typings
package reactDashNativeDashSortableDashListLib.reactDashNativeDashSortableDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var active: scala.Boolean
  var data: reactDashNativeDashSortableDashListLib.DataValue
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[reactDashNativeDashSortableDashListLib.DataKey] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    active: scala.Boolean,
    data: reactDashNativeDashSortableDashListLib.DataValue,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    key: reactDashNativeDashSortableDashListLib.DataKey = null
  ): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("data")(data)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

