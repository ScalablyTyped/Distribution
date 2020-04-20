package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var end: LineColumn
  var start: LineColumn
}

object Location {
  @scala.inline
  def apply(end: LineColumn, start: LineColumn): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

