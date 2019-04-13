package typings
package rollupDashPluginDashNodeDashBuiltinsLib.rollupDashPluginDashNodeDashBuiltinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var crypto: js.UndefOr[scala.Boolean] = js.undefined
  var fs: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(crypto: js.UndefOr[scala.Boolean] = js.undefined, fs: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto)
    if (!js.isUndefined(fs)) __obj.updateDynamic("fs")(fs)
    __obj.asInstanceOf[Options]
  }
}

