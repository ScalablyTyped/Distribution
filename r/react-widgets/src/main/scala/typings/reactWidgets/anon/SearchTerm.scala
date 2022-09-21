package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTerm extends StObject {
  
  var searchTerm: String
  
  var text: String
}
object SearchTerm {
  
  inline def apply(searchTerm: String, text: String): SearchTerm = {
    val __obj = js.Dynamic.literal(searchTerm = searchTerm.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTerm]
  }
  
  extension [Self <: SearchTerm](x: Self) {
    
    inline def setSearchTerm(value: String): Self = StObject.set(x, "searchTerm", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
