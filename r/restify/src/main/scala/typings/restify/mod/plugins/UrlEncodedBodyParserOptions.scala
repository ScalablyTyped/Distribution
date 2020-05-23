package typings.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlEncodedBodyParserOptions extends js.Object {
  var bodyReader: js.UndefOr[Boolean] = js.undefined
  var mapParams: js.UndefOr[Boolean] = js.undefined
  var overrideParams: js.UndefOr[Boolean] = js.undefined
}

object UrlEncodedBodyParserOptions {
  @scala.inline
  def apply(
    bodyReader: js.UndefOr[Boolean] = js.undefined,
    mapParams: js.UndefOr[Boolean] = js.undefined,
    overrideParams: js.UndefOr[Boolean] = js.undefined
  ): UrlEncodedBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bodyReader)) __obj.updateDynamic("bodyReader")(bodyReader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapParams)) __obj.updateDynamic("mapParams")(mapParams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideParams)) __obj.updateDynamic("overrideParams")(overrideParams.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlEncodedBodyParserOptions]
  }
}

