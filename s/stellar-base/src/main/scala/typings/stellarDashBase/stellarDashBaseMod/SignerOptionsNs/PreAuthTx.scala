package typings.stellarDashBase.stellarDashBaseMod.SignerOptionsNs

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx extends SignerOptions {
  var preAuthTx: Buffer | String
  var weight: js.UndefOr[Double | String] = js.undefined
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: Buffer | String, weight: Double | String = null): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}

