package typings.stellarDashBase

import typings.stellarDashBase.stellarDashBaseMod.xdr.Signature
import typings.stellarDashBase.stellarDashBaseMod.xdr.SignatureHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hint extends js.Object {
  var hint: SignatureHint
  var signature: Signature
}

object Anon_Hint {
  @scala.inline
  def apply(hint: SignatureHint, signature: Signature): Anon_Hint = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hint]
  }
}

