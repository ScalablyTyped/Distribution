package typings.stackMapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callsite extends js.Object {
  var column: Double
  var filename: String
  var line: Double
}

object Callsite {
  @scala.inline
  def apply(column: Double, filename: String, line: Double): Callsite = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callsite]
  }
}

