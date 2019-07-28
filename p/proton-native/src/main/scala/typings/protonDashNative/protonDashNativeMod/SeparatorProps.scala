package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the Separator is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the line is vertical or horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the Separator can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SeparatorProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    column: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: Anon_H = null,
    label: String = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeparatorProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SeparatorProps]
  }
}

