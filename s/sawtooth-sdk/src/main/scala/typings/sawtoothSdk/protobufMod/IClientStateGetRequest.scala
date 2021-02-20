package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientStateGetRequest extends StObject {
  
  /** ClientStateGetRequest address */
  var address: js.UndefOr[String | Null] = js.native
  
  /** ClientStateGetRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.native
}
object IClientStateGetRequest {
  
  @scala.inline
  def apply(): IClientStateGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateGetRequest]
  }
  
  @scala.inline
  implicit class IClientStateGetRequestMutableBuilder[Self <: IClientStateGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    @scala.inline
    def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
  }
}
