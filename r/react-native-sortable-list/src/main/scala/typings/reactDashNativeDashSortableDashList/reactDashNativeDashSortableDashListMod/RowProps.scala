package typings.reactDashNativeDashSortableDashList.reactDashNativeDashSortableDashListMod

import typings.reactDashNativeDashSortableDashList.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var active: Boolean
  var data: DataValue
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[DataKey] = js.undefined
}

object RowProps {
  @scala.inline
  def apply(
    active: Boolean,
    data: DataValue,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    key: DataKey = null
  ): RowProps = {
    val __obj = js.Dynamic.literal(active = active, data = data)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

