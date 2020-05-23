package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rows extends js.Object {
  var first: Double
  var originalEvent: typings.std.Event
  var rows: Double
}

object Rows {
  @scala.inline
  def apply(first: Double, originalEvent: typings.std.Event, rows: Double): Rows = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rows]
  }
}

