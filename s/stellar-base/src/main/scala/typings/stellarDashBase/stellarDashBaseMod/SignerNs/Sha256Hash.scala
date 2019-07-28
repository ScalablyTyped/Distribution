package typings.stellarDashBase.stellarDashBaseMod.SignerNs

import typings.node.Buffer
import typings.stellarDashBase.stellarDashBaseMod.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sha256Hash extends Signer {
  var sha256Hash: Buffer
  var weight: js.UndefOr[Double] = js.undefined
}

object Sha256Hash {
  @scala.inline
  def apply(sha256Hash: Buffer, weight: Int | Double = null): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
}

