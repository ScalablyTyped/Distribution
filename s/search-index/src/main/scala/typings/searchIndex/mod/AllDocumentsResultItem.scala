package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllDocumentsResultItem extends StObject {
  
  var _doc: Any
  
  var _id: Double
}
object AllDocumentsResultItem {
  
  inline def apply(_doc: Any, _id: Double): AllDocumentsResultItem = {
    val __obj = js.Dynamic.literal(_doc = _doc.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocumentsResultItem]
  }
  
  extension [Self <: AllDocumentsResultItem](x: Self) {
    
    inline def set_doc(value: Any): Self = StObject.set(x, "_doc", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
