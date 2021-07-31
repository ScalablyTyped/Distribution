package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusFinalizeBlockResponse extends StObject {
  
  /** ConsensusFinalizeBlockResponse blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
  
  /** ConsensusFinalizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusFinalizeBlockResponse {
  
  @scala.inline
  def apply(): IConsensusFinalizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusFinalizeBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusFinalizeBlockResponseMutableBuilder[Self <: IConsensusFinalizeBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
