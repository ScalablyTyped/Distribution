package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the bookmarks. Is the layout for BookmarkListDef.
  */
@js.native
trait IBookmarkList extends StObject {
  
  /**
    * Information about the list of bookmarks
    */
  var qItems: js.Array[IGenericBookmarkLayout] = js.native
}
object IBookmarkList {
  
  @scala.inline
  def apply(qItems: js.Array[IGenericBookmarkLayout]): IBookmarkList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkList]
  }
  
  @scala.inline
  implicit class IBookmarkListMutableBuilder[Self <: IBookmarkList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQItems(value: js.Array[IGenericBookmarkLayout]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQItemsVarargs(value: IGenericBookmarkLayout*): Self = StObject.set(x, "qItems", js.Array(value :_*))
  }
}
