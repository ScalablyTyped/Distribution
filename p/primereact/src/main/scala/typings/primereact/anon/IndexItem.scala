package typings.primereact.anon

import typings.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexItem extends js.Object {
  var index: Double
  var item: MenuItem
  var originalEvent: typings.std.Event
}

object IndexItem {
  @scala.inline
  def apply(index: Double, item: MenuItem, originalEvent: typings.std.Event): IndexItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexItem]
  }
}

