package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientStateGetRequest extends js.Object {
  
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
  implicit class IClientStateGetRequestOps[Self <: IClientStateGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setAddressNull: Self = this.set("address", null)
    
    @scala.inline
    def setStateRoot(value: String): Self = this.set("stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateRoot: Self = this.set("stateRoot", js.undefined)
    
    @scala.inline
    def setStateRootNull: Self = this.set("stateRoot", null)
  }
}
