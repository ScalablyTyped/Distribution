package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEncodedBodyParser_ extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
}

object UrlEncodedBodyParser_ {
  @scala.inline
  def apply(mapParams: js.UndefOr[Boolean] = js.undefined, overrideParams: js.UndefOr[Boolean] = js.undefined): UrlEncodedBodyParser_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlEncodedBodyParser_]
  }
}

