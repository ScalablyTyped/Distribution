package typings
package atStorybookComponentsLib.distSpacedSpacedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpacedProps extends js.Object {
  var col: js.UndefOr[scala.Double] = js.undefined
  var outer: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var row: js.UndefOr[scala.Double] = js.undefined
}

object SpacedProps {
  @scala.inline
  def apply(
    col: scala.Int | scala.Double = null,
    outer: scala.Double | scala.Boolean = null,
    row: scala.Int | scala.Double = null
  ): SpacedProps = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacedProps]
  }
}

