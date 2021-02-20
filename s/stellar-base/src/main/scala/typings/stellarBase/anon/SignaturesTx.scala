package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.DecoratedSignature
import typings.stellarBase.xdrMod.xdr.FeeBumpTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaturesTx extends StObject {
  
  var signatures: js.Array[DecoratedSignature] = js.native
  
  var tx: FeeBumpTransaction = js.native
}
object SignaturesTx {
  
  @scala.inline
  def apply(signatures: js.Array[DecoratedSignature], tx: FeeBumpTransaction): SignaturesTx = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaturesTx]
  }
  
  @scala.inline
  implicit class SignaturesTxMutableBuilder[Self <: SignaturesTx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatures(value: js.Array[DecoratedSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: DecoratedSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTx(value: FeeBumpTransaction): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
