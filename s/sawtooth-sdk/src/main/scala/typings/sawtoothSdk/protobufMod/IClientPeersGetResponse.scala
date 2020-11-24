package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientPeersGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientPeersGetResponse extends js.Object {
  
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
  implicit class IClientPeersGetResponseOps[Self <: IClientPeersGetResponse] (val x: Self) extends AnyVal {
    
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
    def setPeersVarargs(value: String*): Self = this.set("peers", js.Array(value :_*))
    
    @scala.inline
    def setPeers(value: js.Array[String]): Self = this.set("peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeers: Self = this.set("peers", js.undefined)
    
    @scala.inline
    def setPeersNull: Self = this.set("peers", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
