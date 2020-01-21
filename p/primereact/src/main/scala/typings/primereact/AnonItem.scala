package typings.primereact

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var item: this.type
  var originalEvent: Event_
}

object AnonItem {
  @scala.inline
  def apply(item: AnonItem, originalEvent: Event_): AnonItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

