package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultItemNoDoc extends StObject {
  
  var _id: String
  
  var _match: js.Array[String]
}
object QueryResultItemNoDoc {
  
  inline def apply(_id: String, _match: js.Array[String]): QueryResultItemNoDoc = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _match = _match.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultItemNoDoc]
  }
  
  extension [Self <: QueryResultItemNoDoc](x: Self) {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_match(value: js.Array[String]): Self = StObject.set(x, "_match", value.asInstanceOf[js.Any])
    
    inline def set_matchVarargs(value: String*): Self = StObject.set(x, "_match", js.Array(value*))
  }
}
