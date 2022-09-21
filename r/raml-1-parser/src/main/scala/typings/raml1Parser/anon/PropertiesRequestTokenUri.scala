package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesRequestTokenUri extends StObject {
  
  var name: java.lang.String
  
  var properties: RequestTokenUri
}
object PropertiesRequestTokenUri {
  
  inline def apply(name: java.lang.String, properties: RequestTokenUri): PropertiesRequestTokenUri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesRequestTokenUri]
  }
  
  extension [Self <: PropertiesRequestTokenUri](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: RequestTokenUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
