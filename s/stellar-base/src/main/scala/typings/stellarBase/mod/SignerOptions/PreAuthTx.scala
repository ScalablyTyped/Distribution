package typings.stellarBase.mod.SignerOptions

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx extends js.Object {
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

