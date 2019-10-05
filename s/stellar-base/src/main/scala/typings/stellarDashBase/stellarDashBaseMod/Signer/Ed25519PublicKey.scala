package typings.stellarDashBase.stellarDashBaseMod.Signer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ed25519PublicKey extends js.Object {
  var ed25519PublicKey: String
  var weight: js.UndefOr[Double] = js.undefined
}

object Ed25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: String, weight: Int | Double = null): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
}

