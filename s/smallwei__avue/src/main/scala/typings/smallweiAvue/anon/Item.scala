package typings.smallweiAvue.anon

import typings.smallweiAvue.dicMod.DicItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: DicItem
  
  var label: String
  
  var value: String
}
object Item {
  
  inline def apply(item: DicItem, label: String, value: String): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setItem(value: DicItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
