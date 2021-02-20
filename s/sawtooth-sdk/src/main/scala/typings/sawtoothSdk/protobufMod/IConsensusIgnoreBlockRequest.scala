package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusIgnoreBlockRequest extends StObject {
  
  /** ConsensusIgnoreBlockRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusIgnoreBlockRequest {
  
  @scala.inline
  def apply(): IConsensusIgnoreBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusIgnoreBlockRequest]
  }
  
  @scala.inline
  implicit class IConsensusIgnoreBlockRequestMutableBuilder[Self <: IConsensusIgnoreBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
