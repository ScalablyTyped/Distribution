package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BLimitToList extends StObject {
  
  var bLimitToList: Boolean
  
  var id: String
  
  var items: js.Array[js.Any]
}
object BLimitToList {
  
  @scala.inline
  def apply(bLimitToList: Boolean, id: String, items: js.Array[js.Any]): BLimitToList = {
    val __obj = js.Dynamic.literal(bLimitToList = bLimitToList.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLimitToList]
  }
  
  @scala.inline
  implicit class BLimitToListMutableBuilder[Self <: BLimitToList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBLimitToList(value: Boolean): Self = StObject.set(x, "bLimitToList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
