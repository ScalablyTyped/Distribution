package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkEntry...
  */
trait IGenericBookmarkEntry extends StObject {
  
  /**
    * Information about the bookmark.
    */
  var qBookmark: INxBookmark
  
  /**
    * Information about the properties of the bookmark.
    */
  var qProperties: IGenericBookmarkProperties
}
object IGenericBookmarkEntry {
  
  inline def apply(qBookmark: INxBookmark, qProperties: IGenericBookmarkProperties): IGenericBookmarkEntry = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qProperties = qProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericBookmarkEntry] (val x: Self) extends AnyVal {
    
    inline def setQBookmark(value: INxBookmark): Self = StObject.set(x, "qBookmark", value.asInstanceOf[js.Any])
    
    inline def setQProperties(value: IGenericBookmarkProperties): Self = StObject.set(x, "qProperties", value.asInstanceOf[js.Any])
  }
}
