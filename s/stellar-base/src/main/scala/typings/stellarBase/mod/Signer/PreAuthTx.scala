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
  def apply(preAuthTx: Buffer, weight: Int | Double = null): PreAuthTx = {
    val __obj = js.Dynamic.literal(preAuthTx = preAuthTx.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreAuthTx]
  }
}

