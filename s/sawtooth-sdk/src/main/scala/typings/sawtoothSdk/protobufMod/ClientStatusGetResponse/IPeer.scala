package typings.sawtoothSdk.protobufMod.ClientStatusGetResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Peer. */
@js.native
trait IPeer extends js.Object {
  
  /** Peer endpoint */
  var endpoint: js.UndefOr[String | Null] = js.native
}
object IPeer {
  
  @scala.inline
  def apply(): IPeer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeer]
  }
  
  @scala.inline
  implicit class IPeerOps[Self <: IPeer] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEndpointNull: Self = this.set("endpoint", null)
  }
}
