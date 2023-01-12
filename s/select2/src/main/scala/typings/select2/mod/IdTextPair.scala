package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdTextPair extends StObject {
  
  var element: Unit
  
  var id: String
  
  var loading: Unit
  
  var text: String
}
object IdTextPair {
  
  inline def apply(element: Unit, id: String, loading: Unit, text: String): IdTextPair = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdTextPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdTextPair] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Unit): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Unit): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
