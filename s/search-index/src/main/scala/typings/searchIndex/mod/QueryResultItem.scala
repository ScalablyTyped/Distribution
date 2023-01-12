package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultItem extends StObject {
  
  var _doc: js.Array[Any]
  
  var _id: String
  
  var _match: js.Array[String]
}
object QueryResultItem {
  
  inline def apply(_doc: js.Array[Any], _id: String, _match: js.Array[String]): QueryResultItem = {
    val __obj = js.Dynamic.literal(_doc = _doc.asInstanceOf[js.Any], _id = _id.asInstanceOf[js.Any], _match = _match.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResultItem] (val x: Self) extends AnyVal {
    
    inline def set_doc(value: js.Array[Any]): Self = StObject.set(x, "_doc", value.asInstanceOf[js.Any])
    
    inline def set_docVarargs(value: Any*): Self = StObject.set(x, "_doc", js.Array(value*))
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_match(value: js.Array[String]): Self = StObject.set(x, "_match", value.asInstanceOf[js.Any])
    
    inline def set_matchVarargs(value: String*): Self = StObject.set(x, "_match", js.Array(value*))
  }
}
