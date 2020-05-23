package typings.stellarBase.mod.Signer

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreAuthTx extends js.Object {
  var preAuthTx: Buffer
  var weight: js.UndefOr[Double] = js.undefined
}

object PreAuthTx {
  @scala.inline
  def apply(preAuthTx: Buffer, weight: js.UndefOr[Double] = js.undefined): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}

