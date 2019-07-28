package typings.restifyDashPlugins.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEncodedBodyParser extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
}

object UrlEncodedBodyParser {
  @scala.inline
  def apply(mapParams: js.UndefOr[Boolean] = js.undefined, overrideParams: js.UndefOr[Boolean] = js.undefined): UrlEncodedBodyParser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams)
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams)
    __obj.asInstanceOf[UrlEncodedBodyParser]
  }
}

