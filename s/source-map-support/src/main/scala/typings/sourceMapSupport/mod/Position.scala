package typings.sourceMapSupport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: Double
  var line: Double
  var source: String
}

object Position {
  @scala.inline
  def apply(column: Double, line: Double, source: String): Position = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

