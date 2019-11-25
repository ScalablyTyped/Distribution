package typings.stellarDashBase.stellarDashBaseMod.Signer

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256Hash extends js.Object {
  var sha256Hash: Buffer
  var weight: js.UndefOr[Double] = js.undefined
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: Buffer, weight: Int | Double = null): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
}

