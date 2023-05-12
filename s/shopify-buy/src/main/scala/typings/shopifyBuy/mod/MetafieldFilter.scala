package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetafieldFilter extends StObject {
  
  var key: String
  
  var namespace: String
  
  var value: String
}
object MetafieldFilter {
  
  inline def apply(key: String, namespace: String, value: String): MetafieldFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetafieldFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetafieldFilter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
