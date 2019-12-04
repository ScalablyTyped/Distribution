package typings.reactDashDom.reactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// exposeConcurrentModeAPIs features
trait RootOptions extends js.Object {
  var hydrate: js.UndefOr[Boolean] = js.undefined
  var hydrationOptions: js.UndefOr[typings.reactDashDom.experimentalMod.reactDashDomMod.HydrationOptions] = js.undefined
}

object RootOptions {
  @scala.inline
  def apply(
    hydrate: js.UndefOr[Boolean] = js.undefined,
    hydrationOptions: typings.reactDashDom.experimentalMod.reactDashDomMod.HydrationOptions = null
  ): RootOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hydrate)) __obj.updateDynamic("hydrate")(hydrate.asInstanceOf[js.Any])
    if (hydrationOptions != null) __obj.updateDynamic("hydrationOptions")(hydrationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootOptions]
  }
}

