package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values extends StObject {
  
  var isArray: NameString
  
  var name: NameString
  
  var value: NameString
  
  var values: NameString
}
object Values {
  
  inline def apply(isArray: NameString, name: NameString, value: NameString, values: NameString): Values = {
    val __obj = js.Dynamic.literal(isArray = isArray.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values]
  }
  
  extension [Self <: Values](x: Self) {
    
    inline def setIsArray(value: NameString): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NameString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValues(value: NameString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
