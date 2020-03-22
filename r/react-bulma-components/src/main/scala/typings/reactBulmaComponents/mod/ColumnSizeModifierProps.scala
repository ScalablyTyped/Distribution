package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSizeModifierProps extends js.Object {
  var narrow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[ColumnSize] = js.undefined
  var size: js.UndefOr[ColumnSize] = js.undefined
}

object ColumnSizeModifierProps {
  @scala.inline
  def apply(narrow: js.UndefOr[Boolean] = js.undefined, offset: ColumnSize = null, size: ColumnSize = null): ColumnSizeModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSizeModifierProps]
  }
}

