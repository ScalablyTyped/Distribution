package typings.stellarBase.mod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ed25519PublicKey extends js.Object {
  var ed25519PublicKey: String
  var weight: js.UndefOr[Double] = js.undefined
}

object Ed25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: String, weight: js.UndefOr[Double] = js.undefined): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
}

