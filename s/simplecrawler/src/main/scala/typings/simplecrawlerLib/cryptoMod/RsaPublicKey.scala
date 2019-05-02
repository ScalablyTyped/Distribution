package typings
package simplecrawlerLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPublicKey extends js.Object {
  var key: java.lang.String
  var padding: js.UndefOr[scala.Double] = js.undefined
}

object RsaPublicKey {
  @scala.inline
  def apply(key: java.lang.String, padding: scala.Int | scala.Double = null): RsaPublicKey = {
    val __obj = js.Dynamic.literal(key = key)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPublicKey]
  }
}

