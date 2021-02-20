package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends StObject {
  
  var ContentTypeId: String = js.native
  
  var ID: Double = js.native
}
object ListItem {
  
  @scala.inline
  def apply(ContentTypeId: String, ID: Double): ListItem = {
    val __obj = js.Dynamic.literal(ContentTypeId = ContentTypeId.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentTypeId(value: String): Self = StObject.set(x, "ContentTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
