package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.DecoratedSignature
import typings.stellarBase.xdrMod.xdr.TransactionV0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signatures extends StObject {
  
  var signatures: js.Array[DecoratedSignature] = js.native
  
  var tx: TransactionV0 = js.native
}
object Signatures {
  
  @scala.inline
  def apply(signatures: js.Array[DecoratedSignature], tx: TransactionV0): Signatures = {
    val __obj = js.Dynamic.literal(signatures = signatures.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signatures]
  }
  
  @scala.inline
  implicit class SignaturesMutableBuilder[Self <: Signatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatures(value: js.Array[DecoratedSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: DecoratedSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
    
    @scala.inline
    def setTx(value: TransactionV0): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
