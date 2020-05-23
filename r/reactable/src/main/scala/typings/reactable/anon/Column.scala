package typings.reactable.anon

import typings.reactable.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: String
  var direction: SortDirection
}

object Column {
  @scala.inline
  def apply(column: String, direction: SortDirection): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

