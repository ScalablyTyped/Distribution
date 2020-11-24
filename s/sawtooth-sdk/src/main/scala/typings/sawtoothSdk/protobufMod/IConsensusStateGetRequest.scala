package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusStateGetRequest extends js.Object {
  
  /** ConsensusStateGetRequest addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ConsensusStateGetRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusStateGetRequest {
  
  @scala.inline
  def apply(): IConsensusStateGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateGetRequest]
  }
  
  @scala.inline
  implicit class IConsensusStateGetRequestOps[Self <: IConsensusStateGetRequest] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAddressesNull: Self = this.set("addresses", null)
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = this.set("blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockId: Self = this.set("blockId", js.undefined)
    
    @scala.inline
    def setBlockIdNull: Self = this.set("blockId", null)
  }
}
