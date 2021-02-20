package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusNotifyBlockNew extends StObject {
  
  /** ConsensusNotifyBlockNew block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.native
}
object IConsensusNotifyBlockNew {
  
  @scala.inline
  def apply(): IConsensusNotifyBlockNew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockNew]
  }
  
  @scala.inline
  implicit class IConsensusNotifyBlockNewMutableBuilder[Self <: IConsensusNotifyBlockNew] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: IConsensusBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockNull: Self = StObject.set(x, "block", null)
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
  }
}
