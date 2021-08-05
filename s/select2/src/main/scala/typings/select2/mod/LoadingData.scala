package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingData extends StObject {
  
  var element: Unit
  
  var id: Unit
  
  var loading: Boolean
  
  var text: String
}
object LoadingData {
  
  inline def apply(element: Unit, id: Unit, loading: Boolean, text: String): LoadingData = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingData]
  }
  
  extension [Self <: LoadingData](x: Self) {
    
    inline def setElement(value: Unit): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
