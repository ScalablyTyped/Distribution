package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullablePosition extends js.Object {
  var column: scala.Double | scala.Null
  var lastColumn: scala.Double | scala.Null
  var line: scala.Double | scala.Null
}

object NullablePosition {
  @scala.inline
  def apply(
    column: scala.Int | scala.Double = null,
    lastColumn: scala.Int | scala.Double = null,
    line: scala.Int | scala.Double = null
  ): NullablePosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (lastColumn != null) __obj.updateDynamic("lastColumn")(lastColumn.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullablePosition]
  }
}

