package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredValue extends StObject {
  
  var name: NameString
  
  var structuredValue: NameString
}
object StructuredValue {
  
  inline def apply(name: NameString, structuredValue: NameString): StructuredValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], structuredValue = structuredValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredValue]
  }
  
  extension [Self <: StructuredValue](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStructuredValue(value: NameString): Self = StObject.set(x, "structuredValue", value.asInstanceOf[js.Any])
  }
}
