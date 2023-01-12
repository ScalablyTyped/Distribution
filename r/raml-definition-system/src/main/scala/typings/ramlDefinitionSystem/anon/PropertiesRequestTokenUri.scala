package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesRequestTokenUri extends StObject {
  
  var name: String
  
  var properties: RequestTokenUri
}
object PropertiesRequestTokenUri {
  
  inline def apply(name: String, properties: RequestTokenUri): PropertiesRequestTokenUri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesRequestTokenUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesRequestTokenUri] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: RequestTokenUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
