package typings.stellarDashBase.stellarDashBaseMod.SignerNs

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx extends Signer {
  var preAuthTx: Buffer
  var weight: js.UndefOr[Double] = js.undefined
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: Buffer, weight: Int | Double = null): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}

