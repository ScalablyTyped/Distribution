package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsArray extends StObject {
  
  var isArray: Domain
  
  var name: Domain
  
  var value: Domain
  
  var values: Domain
}
object IsArray {
  
  inline def apply(isArray: Domain, name: Domain, value: Domain, values: Domain): IsArray = {
    val __obj = js.Dynamic.literal(isArray = isArray.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsArray]
  }
  
  extension [Self <: IsArray](x: Self) {
    
    inline def setIsArray(value: Domain): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Domain): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Domain): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
