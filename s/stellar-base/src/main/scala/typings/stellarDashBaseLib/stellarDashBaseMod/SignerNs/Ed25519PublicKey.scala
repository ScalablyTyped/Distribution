package typings
package stellarDashBaseLib.stellarDashBaseMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ed25519PublicKey
  extends stellarDashBaseLib.stellarDashBaseMod.Signer {
  var ed25519PublicKey: java.lang.String
  var weight: js.UndefOr[scala.Double]
}

object Ed25519PublicKey {
  @scala.inline
  def apply(ed25519PublicKey: java.lang.String, weight: scala.Int | scala.Double = null): Ed25519PublicKey = {
    val __obj = js.Dynamic.literal(ed25519PublicKey = ed25519PublicKey)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519PublicKey]
  }
}

