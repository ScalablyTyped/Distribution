package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalListItem extends StObject {
  
  var ExternalListItem: Boolean = js.native
  
  var FsObjType: Double = js.native
  
  var Id: Double = js.native
  
  var Url: String = js.native
}
object ExternalListItem {
  
  @scala.inline
  def apply(ExternalListItem: Boolean, FsObjType: Double, Id: Double, Url: String): ExternalListItem = {
    val __obj = js.Dynamic.literal(ExternalListItem = ExternalListItem.asInstanceOf[js.Any], FsObjType = FsObjType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalListItem]
  }
  
  @scala.inline
  implicit class ExternalListItemMutableBuilder[Self <: ExternalListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalListItem(value: Boolean): Self = StObject.set(x, "ExternalListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsObjType(value: Double): Self = StObject.set(x, "FsObjType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
