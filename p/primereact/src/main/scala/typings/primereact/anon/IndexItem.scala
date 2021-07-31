package typings.primereact.anon

import typings.primereact.menuItemMod.MenuItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexItem extends StObject {
  
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
  
  @scala.inline
  implicit class IndexItemMutableBuilder[Self <: IndexItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: MenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
