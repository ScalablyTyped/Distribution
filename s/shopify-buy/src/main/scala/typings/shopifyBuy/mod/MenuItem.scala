package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem
  extends StObject
     with Node {
  
  var items: js.Array[MenuItem]
  
  var resourceId: js.UndefOr[ID] = js.undefined
  
  var tags: js.Array[String]
  
  var `type`: MenuItemType
  
  var url: URL
}
object MenuItem {
  
  inline def apply(id: ID, items: js.Array[MenuItem], tags: js.Array[String], `type`: MenuItemType, url: URL): MenuItem = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setResourceId(value: ID): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: MenuItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
