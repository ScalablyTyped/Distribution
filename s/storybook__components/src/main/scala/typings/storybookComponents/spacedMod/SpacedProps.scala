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
  def apply(col: Int | Double = null, outer: Double | Boolean = null, row: Int | Double = null): SpacedProps = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacedProps]
  }
}

