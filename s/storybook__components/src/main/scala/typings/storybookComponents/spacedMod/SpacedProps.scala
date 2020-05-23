package typings.storybookComponents.spacedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpacedProps extends js.Object {
  var col: js.UndefOr[Double] = js.native
  var outer: js.UndefOr[Double | Boolean] = js.native
  var row: js.UndefOr[Double] = js.native
}

object SpacedProps {
  @scala.inline
  def apply(
    col: js.UndefOr[Double] = js.undefined,
    outer: Double | Boolean = null,
    row: js.UndefOr[Double] = js.undefined
  ): SpacedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(col)) __obj.updateDynamic("col")(col.get.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacedProps]
  }
}

