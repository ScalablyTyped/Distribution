package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var isArray: NameString
  
  var isScalar: NameString
  
  var items: NameString
  
  var properties: NameString
  
  var value: NameString
}
object Items {
  
  inline def apply(
    isArray: NameString,
    isScalar: NameString,
    items: NameString,
    properties: NameString,
    value: NameString
  ): Items = {
    val __obj = js.Dynamic.literal(isArray = isArray.asInstanceOf[js.Any], isScalar = isScalar.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setIsArray(value: NameString): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    inline def setIsScalar(value: NameString): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setItems(value: NameString): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: NameString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NameString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
