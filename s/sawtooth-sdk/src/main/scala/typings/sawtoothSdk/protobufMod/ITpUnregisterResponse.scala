package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpUnregisterResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITpUnregisterResponse extends StObject {
  
  /** TpUnregisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object ITpUnregisterResponse {
  
  inline def apply(): ITpUnregisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpUnregisterResponse]
  }
  
  extension [Self <: ITpUnregisterResponse](x: Self) {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
