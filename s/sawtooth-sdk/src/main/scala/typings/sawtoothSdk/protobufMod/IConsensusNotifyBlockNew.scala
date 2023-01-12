package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusNotifyBlockNew extends StObject {
  
  /** ConsensusNotifyBlockNew block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.undefined
}
object IConsensusNotifyBlockNew {
  
  inline def apply(): IConsensusNotifyBlockNew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockNew]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IConsensusNotifyBlockNew] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: IConsensusBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockNull: Self = StObject.set(x, "block", null)
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
  }
}
