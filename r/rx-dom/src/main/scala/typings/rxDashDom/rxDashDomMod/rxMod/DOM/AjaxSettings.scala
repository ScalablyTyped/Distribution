package typings.rxDashDom.rxDashDomMod.rxMod.DOM

import typings.rxDashCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  // This options does not seem to be used in the code yet
  // contentType?: string;
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var progressObserver: js.UndefOr[Observer[_]] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    body: String = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    method: String = null,
    password: String = null,
    progressObserver: Observer[_] = null,
    responseType: String = null,
    url: String = null,
    user: String = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (password != null) __obj.updateDynamic("password")(password)
    if (progressObserver != null) __obj.updateDynamic("progressObserver")(progressObserver)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (url != null) __obj.updateDynamic("url")(url)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[AjaxSettings]
  }
}

