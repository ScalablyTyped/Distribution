package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonpSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var jsonp: js.UndefOr[String] = js.undefined
  var jsonpCallback: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object JsonpSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    jsonp: String = null,
    jsonpCallback: String = null,
    url: String = null
  ): JsonpSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (jsonp != null) __obj.updateDynamic("jsonp")(jsonp.asInstanceOf[js.Any])
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonpSettings]
  }
}

