package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the bookmarks. Is the layout for BookmarkListDef.
  */
@js.native
trait IBookmarkList extends js.Object {
  
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
  implicit class IBookmarkListOps[Self <: IBookmarkList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQItemsVarargs(value: IGenericBookmarkLayout*): Self = this.set("qItems", js.Array(value :_*))
    
    @scala.inline
    def setQItems(value: js.Array[IGenericBookmarkLayout]): Self = this.set("qItems", value.asInstanceOf[js.Any])
  }
}
