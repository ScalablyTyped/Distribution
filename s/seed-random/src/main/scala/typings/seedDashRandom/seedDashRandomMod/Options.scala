package typings.seedDashRandom.seedDashRandomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var entropy: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(entropy: js.UndefOr[Boolean] = js.undefined, global: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(entropy)) __obj.updateDynamic("entropy")(entropy.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

