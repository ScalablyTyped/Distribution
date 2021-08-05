package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyBlockCommit extends StObject {
  
  /** ConsensusNotifyBlockCommit blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IConsensusNotifyBlockCommit {
  
  inline def apply(): IConsensusNotifyBlockCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockCommit]
  }
  
  extension [Self <: IConsensusNotifyBlockCommit](x: Self) {
    
    inline def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
