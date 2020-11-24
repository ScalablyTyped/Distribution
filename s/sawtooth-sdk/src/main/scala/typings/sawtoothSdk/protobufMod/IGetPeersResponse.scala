package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGetPeersResponse extends js.Object {
  
  /** GetPeersResponse peerEndpoints */
  var peerEndpoints: js.UndefOr[js.Array[String] | Null] = js.native
}
object IGetPeersResponse {
  
  @scala.inline
  def apply(): IGetPeersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGetPeersResponse]
  }
  
  @scala.inline
  implicit class IGetPeersResponseOps[Self <: IGetPeersResponse] (val x: Self) extends AnyVal {
    
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
    def setPeerEndpointsVarargs(value: String*): Self = this.set("peerEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setPeerEndpoints(value: js.Array[String]): Self = this.set("peerEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerEndpoints: Self = this.set("peerEndpoints", js.undefined)
    
    @scala.inline
    def setPeerEndpointsNull: Self = this.set("peerEndpoints", null)
  }
}
