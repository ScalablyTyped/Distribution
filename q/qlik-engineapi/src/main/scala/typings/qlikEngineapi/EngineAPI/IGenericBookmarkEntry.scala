package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkEntry...
  */
@js.native
trait IGenericBookmarkEntry extends js.Object {
  
  /**
    * Information about the bookmark.
    */
  var qBookmark: INxBookmark = js.native
  
  /**
    * Information about the properties of the bookmark.
    */
  var qProperties: IGenericBookmarkProperties = js.native
}
object IGenericBookmarkEntry {
  
  @scala.inline
  def apply(qBookmark: INxBookmark, qProperties: IGenericBookmarkProperties): IGenericBookmarkEntry = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qProperties = qProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkEntry]
  }
  
  @scala.inline
  implicit class IGenericBookmarkEntryOps[Self <: IGenericBookmarkEntry] (val x: Self) extends AnyVal {
    
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
    def setQBookmark(value: INxBookmark): Self = this.set("qBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQProperties(value: IGenericBookmarkProperties): Self = this.set("qProperties", value.asInstanceOf[js.Any])
  }
}
