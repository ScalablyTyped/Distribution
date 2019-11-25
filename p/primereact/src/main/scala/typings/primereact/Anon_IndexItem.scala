package typings.primereact

import typings.primereact.componentsMenuitemMenuItemMod.MenuItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexItem extends js.Object {
  var index: Double
  var item: MenuItem
  var originalEvent: Event
}

object Anon_IndexItem {
  @scala.inline
  def apply(index: Double, item: MenuItem, originalEvent: Event): Anon_IndexItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IndexItem]
  }
}

