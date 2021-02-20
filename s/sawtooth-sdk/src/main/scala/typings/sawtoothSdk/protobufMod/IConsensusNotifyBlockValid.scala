package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyBlockValid extends StObject {
  
  /** ConsensusNotifyBlockValid blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.native
}
object IConsensusNotifyBlockValid {
  
  @scala.inline
  def apply(): IConsensusNotifyBlockValid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockValid]
  }
  
  @scala.inline
  implicit class IConsensusNotifyBlockValidMutableBuilder[Self <: IConsensusNotifyBlockValid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    @scala.inline
    def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
