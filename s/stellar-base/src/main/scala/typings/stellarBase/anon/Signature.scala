package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signature extends js.Object {
  var signature: Buffer = js.native
  var statement: ScpStatement = js.native
}

object Signature {
  @scala.inline
  def apply(signature: Buffer, statement: ScpStatement): Signature = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signature]
  }
  @scala.inline
  implicit class SignatureOps[Self <: Signature] (val x: Self) extends AnyVal {
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
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatement(value: ScpStatement): Self = this.set("statement", value.asInstanceOf[js.Any])
  }
  
}

