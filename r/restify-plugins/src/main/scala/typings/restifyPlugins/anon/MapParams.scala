package typings.restifyPlugins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapParams extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
  var reviver: js.UndefOr[js.Any] = js.undefined
}

object MapParams {
  @scala.inline
  def apply(
    mapParams: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined,
    reviver: js.Any = null
  ): MapParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.get.asInstanceOf[js.Any])
    if (reviver != null) __obj.updateDynamic("reviver")(reviver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapParams]
  }
}

