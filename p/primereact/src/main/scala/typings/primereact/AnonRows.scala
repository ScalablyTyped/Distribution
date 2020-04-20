package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRows extends js.Object {
  var first: Double
  var originalEvent: Event_
  var rows: Double
}

object AnonRows {
  @scala.inline
  def apply(first: Double, originalEvent: Event_, rows: Double): AnonRows = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRows]
  }
}

