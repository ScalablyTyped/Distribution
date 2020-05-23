package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataIndex extends js.Object {
  var data: js.Any
  var index: Double
  var originalEvent: typings.std.Event
}

object DataIndex {
  @scala.inline
  def apply(data: js.Any, index: Double, originalEvent: typings.std.Event): DataIndex = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
}

