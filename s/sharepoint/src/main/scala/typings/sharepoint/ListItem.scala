package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem extends StObject {
  
  var ContentTypeId: String
  
  var ID: Double
}
object ListItem {
  
  inline def apply(ContentTypeId: String, ID: Double): ListItem = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    inline def setContentTypeId(value: String): Self = StObject.set(x, "ContentTypeId", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
