package typings
package stellarDashBaseLib.stellarDashBaseMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx
  extends stellarDashBaseLib.stellarDashBaseMod.Signer {
  var preAuthTx: nodeLib.Buffer
  var weight: js.UndefOr[scala.Double]
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: nodeLib.Buffer, weight: scala.Int | scala.Double = null): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}

