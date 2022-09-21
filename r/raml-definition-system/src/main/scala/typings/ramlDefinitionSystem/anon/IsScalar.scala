package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsScalar extends StObject {
  
  var isScalar: Domain
  
  var properties: Domain
  
  var value: Domain
}
object IsScalar {
  
  inline def apply(isScalar: Domain, properties: Domain, value: Domain): IsScalar = {
    val __obj = js.Dynamic.literal(isScalar = isScalar.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsScalar]
  }
  
  extension [Self <: IsScalar](x: Self) {
    
    inline def setIsScalar(value: Domain): Self = StObject.set(x, "isScalar", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Domain): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Domain): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
