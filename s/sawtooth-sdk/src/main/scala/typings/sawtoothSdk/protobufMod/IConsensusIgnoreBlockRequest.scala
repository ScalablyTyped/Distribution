package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusIgnoreBlockRequest extends StObject {
  
  /** ConsensusIgnoreBlockRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IConsensusIgnoreBlockRequest {
  
  inline def apply(): IConsensusIgnoreBlockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusIgnoreBlockRequest]
  }
  
  extension [Self <: IConsensusIgnoreBlockRequest](x: Self) {
    
    inline def setBlockId(value: Uint8Array): Self = StObject.set(x, "blockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdNull: Self = StObject.set(x, "blockId", null)
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "blockId", js.undefined)
  }
}
