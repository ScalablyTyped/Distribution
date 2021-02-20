package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.DecoratedSignature
import typings.stellarBase.xdrMod.xdr.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tx extends StObject {
  
  var signatures: js.Array[DecoratedSignature] = js.native
  
  var tx: Transaction = js.native
}
object Tx {
  
  @scala.inline
  def apply(signatures: js.Array[DecoratedSignature], tx: Transaction): Tx = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tx]
  }
  
  @scala.inline
  implicit class TxMutableBuilder[Self <: Tx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatures(value: js.Array[DecoratedSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: DecoratedSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTx(value: Transaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
