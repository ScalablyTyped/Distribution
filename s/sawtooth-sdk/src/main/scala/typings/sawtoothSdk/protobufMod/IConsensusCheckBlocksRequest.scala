package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusCheckBlocksRequest extends StObject {
  
  /** ConsensusCheckBlocksRequest blockIds */
  var blockIds: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
}
object IConsensusCheckBlocksRequest {
  
  @scala.inline
  def apply(): IConsensusCheckBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksRequest]
  }
  
  @scala.inline
  implicit class IConsensusCheckBlocksRequestMutableBuilder[Self <: IConsensusCheckBlocksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIds(value: js.Array[Uint8Array]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    @scala.inline
    def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsVarargs(value: Uint8Array*): Self = StObject.set(x, "blockIds", js.Array(value :_*))
  }
}
