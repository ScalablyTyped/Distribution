package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupTableInfo extends StObject {
  
  var id: String
  
  var limitToList: js.UndefOr[Boolean] = js.undefined
  
  var lookup: js.Array[ILookupInfo]
  
  var showImage: js.UndefOr[Boolean] = js.undefined
  
  var showText: js.UndefOr[Boolean] = js.undefined
}
object ILookupTableInfo {
  
  inline def apply(id: String, lookup: js.Array[ILookupInfo]): ILookupTableInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookupTableInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILookupTableInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLimitToList(value: Boolean): Self = StObject.set(x, "limitToList", value.asInstanceOf[js.Any])
    
    inline def setLimitToListUndefined: Self = StObject.set(x, "limitToList", js.undefined)
    
    inline def setLookup(value: js.Array[ILookupInfo]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
    
    inline def setLookupVarargs(value: ILookupInfo*): Self = StObject.set(x, "lookup", js.Array(value*))
    
    inline def setShowImage(value: Boolean): Self = StObject.set(x, "showImage", value.asInstanceOf[js.Any])
    
    inline def setShowImageUndefined: Self = StObject.set(x, "showImage", js.undefined)
    
    inline def setShowText(value: Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
  }
}
