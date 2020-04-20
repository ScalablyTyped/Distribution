package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var originalEvent: Event_
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, originalEvent: Event_): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

