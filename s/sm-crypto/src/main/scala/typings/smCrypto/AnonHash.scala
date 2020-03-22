package typings.smCrypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  var der: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[Boolean] = js.undefined
  var publicKey: js.UndefOr[String] = js.undefined
}

object AnonHash {
  @scala.inline
  def apply(
    der: js.UndefOr[Boolean] = js.undefined,
    hash: js.UndefOr[Boolean] = js.undefined,
    publicKey: String = null
  ): AnonHash = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(der)) __obj.updateDynamic("der")(der.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

