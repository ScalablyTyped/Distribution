package typings
package primereactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexItem extends js.Object {
  var index: scala.Double
  var item: primereactLib.componentsMenuitemMenuItemMod.MenuItem
  var originalEvent: stdLib.Event
}

object Anon_IndexItem {
  @scala.inline
  def apply(
    index: scala.Double,
    item: primereactLib.componentsMenuitemMenuItemMod.MenuItem,
    originalEvent: stdLib.Event
  ): Anon_IndexItem = {
    val __obj = js.Dynamic.literal(index = index, item = item, originalEvent = originalEvent)
  
    __obj.asInstanceOf[Anon_IndexItem]
  }
}

