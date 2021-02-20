package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkEntry...
  */
@js.native
trait IGenericBookmarkEntry extends StObject {
  
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
  implicit class IGenericBookmarkEntryMutableBuilder[Self <: IGenericBookmarkEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQBookmark(value: INxBookmark): Self = StObject.set(x, "qBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQProperties(value: IGenericBookmarkProperties): Self = StObject.set(x, "qProperties", value.asInstanceOf[js.Any])
  }
}
