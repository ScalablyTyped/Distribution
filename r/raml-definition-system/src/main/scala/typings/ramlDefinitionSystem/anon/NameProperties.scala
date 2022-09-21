package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameProperties extends StObject {
  
  var name: String
  
  var properties: Content
}
object NameProperties {
  
  inline def apply(name: String, properties: Content): NameProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameProperties]
  }
  
  extension [Self <: NameProperties](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Content): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
