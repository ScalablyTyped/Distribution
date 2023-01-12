package typings.redisSearch.distCommandsMod

import typings.redisSearch.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchReply extends StObject {
  
  var documents: js.Array[Id]
  
  var total: Double
}
object SearchReply {
  
  inline def apply(documents: js.Array[Id], total: Double): SearchReply = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchReply] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: js.Array[Id]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsVarargs(value: Id*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
