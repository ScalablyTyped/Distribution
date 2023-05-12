package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasMetafieldsIdentifier extends StObject {
  
  var key: String
  
  var namespace: String
}
object HasMetafieldsIdentifier {
  
  inline def apply(key: String, namespace: String): HasMetafieldsIdentifier = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasMetafieldsIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasMetafieldsIdentifier] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
