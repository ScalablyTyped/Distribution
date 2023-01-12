package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyBlockCommit extends StObject {
  
  /** ConsensusNotifyBlockCommit blockId */
  var blockId: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IConsensusNotifyBlockCommit {
  
  inline def apply(): IConsensusNotifyBlockCommit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockCommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusNotifyBlockCommit] (val x: Self) extends AnyVal {
    
    inline def setBlockId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
