package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullablePosition extends js.Object {
  var column: Double | Null
  var lastColumn: Double | Null
  var line: Double | Null
}

object NullablePosition {
  @scala.inline
  def apply(column: Int | Double = null, lastColumn: Int | Double = null, line: Int | Double = null): NullablePosition = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (lastColumn != null) __obj.updateDynamic("lastColumn")(lastColumn.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullablePosition]
  }
}

