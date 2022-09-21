package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the bookmarks. Is the layout for BookmarkListDef.
  */
trait IBookmarkList extends StObject {
  
  /**
    * Information about the list of bookmarks
    */
  var qItems: js.Array[IGenericBookmarkLayout]
}
object IBookmarkList {
  
  inline def apply(qItems: js.Array[IGenericBookmarkLayout]): IBookmarkList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkList]
  }
  
  extension [Self <: IBookmarkList](x: Self) {
    
    inline def setQItems(value: js.Array[IGenericBookmarkLayout]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    inline def setQItemsVarargs(value: IGenericBookmarkLayout*): Self = StObject.set(x, "qItems", js.Array(value*))
  }
}
