package typings.stellarDashBase.stellarDashBaseMod.SignerOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ed25519PublicKey extends js.Object {
  var ed25519PublicKey: String
  var weight: js.UndefOr[Double | String] = js.undefined
}

object Ed25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: String, weight: Double | String = null): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
}

