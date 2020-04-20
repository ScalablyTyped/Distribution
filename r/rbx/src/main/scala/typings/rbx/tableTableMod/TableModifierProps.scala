package typings.rbx.tableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableModifierProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var fullwidth: js.UndefOr[Boolean] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var narrow: js.UndefOr[Boolean] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
}

object TableModifierProps {
  @scala.inline
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    fullwidth: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    narrow: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined
  ): TableModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (!js.isUndefined(fullwidth)) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableModifierProps]
  }
}

