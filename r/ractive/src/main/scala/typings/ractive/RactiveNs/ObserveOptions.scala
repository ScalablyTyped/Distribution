package typings.ractive.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveOptions extends ObserveOnceOptions {
  // Default true
  var init: js.UndefOr[Boolean] = js.undefined
}

object ObserveOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    init: js.UndefOr[Boolean] = js.undefined
  ): ObserveOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    __obj.asInstanceOf[ObserveOptions]
  }
}

