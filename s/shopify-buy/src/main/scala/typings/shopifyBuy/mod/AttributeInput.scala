package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// end GraphQL Types - Interfaces
// GraphQL Types - Input Objects
trait AttributeInput extends StObject {
  
  var key: String
  
  var value: String
}
object AttributeInput {
  
  inline def apply(key: String, value: String): AttributeInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeInput] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
