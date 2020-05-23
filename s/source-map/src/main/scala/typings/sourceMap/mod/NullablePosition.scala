package typings.sourceMap.mod

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
  def apply(
    column: Double = null.asInstanceOf[Double],
    lastColumn: Double = null.asInstanceOf[Double],
    line: Double = null.asInstanceOf[Double]
  ): NullablePosition = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullablePosition]
  }
}

