package typings.restifyDashPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MapParams extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  var reviver: js.UndefOr[js.Any] = js.undefined
}

object Anon_MapParams {
  @scala.inline
  def apply(
    mapParams: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    reviver: js.Any = null
  ): Anon_MapParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams)
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams)
    if (reviver != null) __obj.updateDynamic("reviver")(reviver)
    __obj.asInstanceOf[Anon_MapParams]
  }
}

