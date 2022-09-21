package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientStateGetResponse extends StObject {
  
  /** ClientStateGetResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
  
  /** ClientStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  
  /** ClientStateGetResponse value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IClientStateGetResponse {
  
  inline def apply(): IClientStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateGetResponse]
  }
  
  extension [Self <: IClientStateGetResponse](x: Self) {
    
    inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    inline def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    inline def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
