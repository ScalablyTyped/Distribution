package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var column: Double
  var line: Double
}

object AnonLine {
  @scala.inline
  def apply(column: Double, line: Double): AnonLine = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLine]
  }
}

