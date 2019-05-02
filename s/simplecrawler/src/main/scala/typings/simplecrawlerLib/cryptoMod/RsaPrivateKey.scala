package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPrivateKey extends js.Object {
  var key: java.lang.String
  var padding: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

object RsaPrivateKey {
  @scala.inline
  def apply(
    key: java.lang.String,
    padding: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null
  ): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[RsaPrivateKey]
  }
}

