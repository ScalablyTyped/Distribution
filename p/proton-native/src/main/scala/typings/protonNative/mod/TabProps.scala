package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends GridChildrenProps {
  /**
    * Whether the Tab is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the Tab can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: H = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

