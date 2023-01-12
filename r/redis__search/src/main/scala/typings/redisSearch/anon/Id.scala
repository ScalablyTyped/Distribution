package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.SearchDocumentValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var value: SearchDocumentValue
}
object Id {
  
  inline def apply(id: String, value: SearchDocumentValue): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SearchDocumentValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
