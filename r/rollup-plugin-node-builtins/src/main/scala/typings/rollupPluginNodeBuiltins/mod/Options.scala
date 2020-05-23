package typings.rollupPluginNodeBuiltins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var crypto: js.UndefOr[Boolean] = js.undefined
  var fs: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(crypto: js.UndefOr[Boolean] = js.undefined, fs: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crypto)) __obj.updateDynamic("crypto")(crypto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fs)) __obj.updateDynamic("fs")(fs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

