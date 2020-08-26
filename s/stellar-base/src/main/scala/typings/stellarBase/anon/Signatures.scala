package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.DecoratedSignature
import typings.stellarBase.xdrMod.xdr.TransactionV0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signatures extends js.Object {
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
  implicit class SignaturesOps[Self <: Signatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSignaturesVarargs(value: DecoratedSignature*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[DecoratedSignature]): Self = this.set("signatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setTx(value: TransactionV0): Self = this.set("tx", value.asInstanceOf[js.Any])
  }
  
}

