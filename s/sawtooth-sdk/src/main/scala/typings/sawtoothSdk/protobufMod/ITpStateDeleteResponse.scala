package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateDeleteResponse extends StObject {
  
  /** TpStateDeleteResponse addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TpStateDeleteResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpStateDeleteResponse {
  
  @scala.inline
  def apply(): ITpStateDeleteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateDeleteResponse]
  }
  
  @scala.inline
  implicit class ITpStateDeleteResponseMutableBuilder[Self <: ITpStateDeleteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
