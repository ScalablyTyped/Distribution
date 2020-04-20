package typings.reactable

import typings.reactable.mod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: String
  var direction: SortDirection
}

object AnonColumn {
  @scala.inline
  def apply(column: String, direction: SortDirection): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

