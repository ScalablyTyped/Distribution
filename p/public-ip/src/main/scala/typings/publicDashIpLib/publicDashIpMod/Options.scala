package typings
package publicDashIpLib.publicDashIpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(https: js.UndefOr[scala.Boolean] = js.undefined, timeout: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

