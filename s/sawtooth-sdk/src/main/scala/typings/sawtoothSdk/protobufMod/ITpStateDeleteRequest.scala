package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateDeleteRequest extends StObject {
  
  /** TpStateDeleteRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TpStateDeleteRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.undefined
}
object ITpStateDeleteRequest {
  
  inline def apply(): ITpStateDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateDeleteRequest]
  }
  
  extension [Self <: ITpStateDeleteRequest](x: Self) {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setContextId(value: String): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setContextIdNull: Self = StObject.set(x, "contextId", null)
    
    inline def setContextIdUndefined: Self = StObject.set(x, "contextId", js.undefined)
  }
}
