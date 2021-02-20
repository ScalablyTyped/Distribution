package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientPeersGetResponse extends StObject {
  
  /** ClientPeersGetResponse peers */
  var peers: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientPeersGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientPeersGetResponse {
  
  @scala.inline
  def apply(): IClientPeersGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPeersGetResponse]
  }
  
  @scala.inline
  implicit class IClientPeersGetResponseMutableBuilder[Self <: IClientPeersGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeers(value: js.Array[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeersNull: Self = StObject.set(x, "peers", null)
    
    @scala.inline
    def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
    
    @scala.inline
    def setPeersVarargs(value: String*): Self = StObject.set(x, "peers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
