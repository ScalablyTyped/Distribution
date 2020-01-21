package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnLine extends js.Object {
  var column: Double
  var line: Double
}

object AnonColumnLine {
  @scala.inline
  def apply(column: Double, line: Double): AnonColumnLine = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnLine]
  }
}

