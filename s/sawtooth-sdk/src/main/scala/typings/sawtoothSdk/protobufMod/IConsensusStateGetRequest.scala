package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusStateGetRequest extends StObject {
  
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
  implicit class IConsensusStateGetRequestMutableBuilder[Self <: IConsensusStateGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesNull: Self = StObject.set(x, "addresses", null)
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
