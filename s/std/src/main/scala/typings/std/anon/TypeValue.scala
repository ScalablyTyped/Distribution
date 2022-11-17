package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue extends StObject {
  
  /* standard es2021.intl */
  var `type`: "element" | "literal"
  
  /* standard es2021.intl */
  var value: String
}
object TypeValue {
  
  inline def apply(`type`: "element" | "literal", value: String): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: "element" | "literal"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
