package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientUrlValue extends StObject {
  
  var Description: String
  
  var URL: String
}
object ClientUrlValue {
  
  inline def apply(Description: String, URL: String): ClientUrlValue = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUrlValue]
  }
  
  extension [Self <: ClientUrlValue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
