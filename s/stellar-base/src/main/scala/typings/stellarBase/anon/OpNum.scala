package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.MuxedAccount
import typings.stellarBase.xdrMod.xdr.SequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpNum extends StObject {
  
  var opNum: Double = js.native
  
  var seqNum: SequenceNumber = js.native
  
  var sourceAccount: MuxedAccount = js.native
}
object OpNum {
  
  @scala.inline
  def apply(opNum: Double, seqNum: SequenceNumber, sourceAccount: MuxedAccount): OpNum = {
    val __obj = js.Dynamic.literal(opNum = opNum.asInstanceOf[js.Any], seqNum = seqNum.asInstanceOf[js.Any], sourceAccount = sourceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpNum]
  }
  
  @scala.inline
  implicit class OpNumMutableBuilder[Self <: OpNum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpNum(value: Double): Self = StObject.set(x, "opNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeqNum(value: SequenceNumber): Self = StObject.set(x, "seqNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = StObject.set(x, "sourceAccount", value.asInstanceOf[js.Any])
  }
}
