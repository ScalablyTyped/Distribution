package typings.smCrypto

import typings.smCrypto.mod.KeyPairPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDer extends js.Object {
  var der: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[Boolean] = js.undefined
  var pointPool: js.UndefOr[js.Array[KeyPairPoint]] = js.undefined
  var publicKey: js.UndefOr[String] = js.undefined
}

object AnonDer {
  @scala.inline
  def apply(
    der: js.UndefOr[Boolean] = js.undefined,
    hash: js.UndefOr[Boolean] = js.undefined,
    pointPool: js.Array[KeyPairPoint] = null,
    publicKey: String = null
  ): AnonDer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(der)) __obj.updateDynamic("der")(der.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (pointPool != null) __obj.updateDynamic("pointPool")(pointPool.asInstanceOf[js.Any])
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDer]
  }
}

