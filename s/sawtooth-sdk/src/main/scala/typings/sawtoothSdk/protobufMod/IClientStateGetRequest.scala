package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientStateGetRequest extends StObject {
  
  /** ClientStateGetRequest address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** ClientStateGetRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
}
object IClientStateGetRequest {
  
  inline def apply(): IClientStateGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateGetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientStateGetRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    inline def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    inline def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
  }
}
