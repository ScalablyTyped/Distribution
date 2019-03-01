package typings
package stellarDashBaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hint extends js.Object {
  var hint: stellarDashBaseLib.stellarDashBaseMod.xdrNs.SignatureHint
  var signature: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature
}

object Anon_Hint {
  @scala.inline
  def apply(
    hint: stellarDashBaseLib.stellarDashBaseMod.xdrNs.SignatureHint,
    signature: stellarDashBaseLib.stellarDashBaseMod.xdrNs.Signature
  ): Anon_Hint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hint")(hint)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[Anon_Hint]
  }
}

