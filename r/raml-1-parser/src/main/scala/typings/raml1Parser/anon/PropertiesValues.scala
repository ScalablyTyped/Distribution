package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesValues extends StObject {
  
  var name: java.lang.String
  
  var properties: Values
}
object PropertiesValues {
  
  inline def apply(name: java.lang.String, properties: Values): PropertiesValues = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesValues] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Values): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
