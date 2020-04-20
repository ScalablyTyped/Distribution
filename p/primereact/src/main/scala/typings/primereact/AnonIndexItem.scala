package typings.primereact

import typings.primereact.menuItemMod.MenuItem
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexItem extends js.Object {
  var index: Double
  var item: MenuItem
  var originalEvent: Event_
}

object AnonIndexItem {
  @scala.inline
  def apply(index: Double, item: MenuItem, originalEvent: Event_): AnonIndexItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexItem]
  }
}

