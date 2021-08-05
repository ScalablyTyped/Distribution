package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateSetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpStateSetResponse extends StObject {
  
  /** TpStateSetResponse addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** TpStateSetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpStateSetResponse {
  
  inline def apply(): ITpStateSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateSetResponse]
  }
  
  extension [Self <: ITpStateSetResponse](x: Self) {
    
    inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
