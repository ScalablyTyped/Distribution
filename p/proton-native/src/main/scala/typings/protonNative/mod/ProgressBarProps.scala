package typings.protonNative.mod

import typings.protonNative.anon.H
import typings.protonNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Whether the ProgressBar is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The current value of the ProgressBar (0-100). A value of -1 indicates an indeterminate progressbar.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Whether the ProgressBar can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    align: H = null,
    column: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: H = null,
    label: String = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

