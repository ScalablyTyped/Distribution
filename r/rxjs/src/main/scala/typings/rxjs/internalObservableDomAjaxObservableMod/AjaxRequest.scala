package typings.rxjs.internalObservableDomAjaxObservableMod

import typings.rxjs.internalSubscriberMod.Subscriber
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxRequest extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var createXHR: js.UndefOr[js.Function0[XMLHttpRequest]] = js.undefined
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  var hasContent: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var progressSubscriber: js.UndefOr[Subscriber[_]] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AjaxRequest {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    body: js.Any = null,
    createXHR: () => XMLHttpRequest = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    hasContent: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    method: String = null,
    password: String = null,
    progressSubscriber: Subscriber[_] = null,
    responseType: String = null,
    timeout: Int | Double = null,
    url: String = null,
    user: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AjaxRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (createXHR != null) __obj.updateDynamic("createXHR")(js.Any.fromFunction0(createXHR))
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(hasContent)) __obj.updateDynamic("hasContent")(hasContent.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (progressSubscriber != null) __obj.updateDynamic("progressSubscriber")(progressSubscriber.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxRequest]
  }
}

