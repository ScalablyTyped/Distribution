package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineColumn extends js.Object {
  var column: Double
  var line: Double
}

object LineColumn {
  @scala.inline
  def apply(column: Double, line: Double): LineColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineColumn]
  }
}

