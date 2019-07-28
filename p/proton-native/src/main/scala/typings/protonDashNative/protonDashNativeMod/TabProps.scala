package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
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
    align: Anon_H = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    row: Int | Double = null,
    span: Anon_X = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TabProps]
  }
}

