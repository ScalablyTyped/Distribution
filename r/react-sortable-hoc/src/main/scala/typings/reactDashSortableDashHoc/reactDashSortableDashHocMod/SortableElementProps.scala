package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortableElementProps extends js.Object {
  var collection: js.UndefOr[Offset] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: Double
}

object SortableElementProps {
  @scala.inline
  def apply(index: Double, collection: Offset = null, disabled: js.UndefOr[Boolean] = js.undefined): SortableElementProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableElementProps]
  }
}

