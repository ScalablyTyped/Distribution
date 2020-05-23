package typings.stellarBase.anon

import typings.stellarBase.mod.xdr.Signature
import typings.stellarBase.mod.xdr.SignatureHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hint extends js.Object {
  var hint: SignatureHint
  var signature: Signature
}

object Hint {
  @scala.inline
  def apply(hint: SignatureHint, signature: Signature): Hint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hint]
  }
}

