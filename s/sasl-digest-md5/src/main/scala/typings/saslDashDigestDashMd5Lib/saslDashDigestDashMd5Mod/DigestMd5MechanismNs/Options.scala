package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod.DigestMd5MechanismNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var genNonce: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(genNonce: js.Function0[scala.Double] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (genNonce != null) __obj.updateDynamic("genNonce")(genNonce)
    __obj.asInstanceOf[Options]
  }
}

