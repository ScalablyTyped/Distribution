package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the bookmarks. Is the layout for BookmarkListDef.
  */
trait IBookmarkList extends js.Object {
  /**
    * Information about the list of bookmarks
    */
  var qItems: js.Array[IGenericBookmarkLayout]
}

object IBookmarkList {
  @scala.inline
  def apply(qItems: js.Array[IGenericBookmarkLayout]): IBookmarkList = {
    val __obj = js.Dynamic.literal(qItems = qItems)
  
    __obj.asInstanceOf[IBookmarkList]
  }
}

