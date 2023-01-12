package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesExamples extends StObject {
  
  var name: String
  
  var properties: Examples
}
object PropertiesExamples {
  
  inline def apply(name: String, properties: Examples): PropertiesExamples = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesExamples] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Examples): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
