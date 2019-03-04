package typings
package stellarDashBaseLib.stellarDashBaseMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256Hash
  extends stellarDashBaseLib.stellarDashBaseMod.Signer {
  var sha256Hash: nodeLib.Buffer
  var weight: js.UndefOr[scala.Double]
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: nodeLib.Buffer, weight: scala.Int | scala.Double = null): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
}

