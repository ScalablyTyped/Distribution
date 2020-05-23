package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropResult extends js.Object {
  var dropped: Double
}

object DropResult {
  @scala.inline
  def apply(dropped: Double): DropResult = {
    val __obj = js.Dynamic.literal(dropped = dropped.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
}

