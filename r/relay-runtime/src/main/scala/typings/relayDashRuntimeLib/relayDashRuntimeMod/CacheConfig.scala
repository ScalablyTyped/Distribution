package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheConfig extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var poll: js.UndefOr[scala.Double] = js.undefined
}

object CacheConfig {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined, poll: scala.Int | scala.Double = null): CacheConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (poll != null) __obj.updateDynamic("poll")(poll.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheConfig]
  }
}

