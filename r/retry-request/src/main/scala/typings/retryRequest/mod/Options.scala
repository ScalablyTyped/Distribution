package typings.retryRequest.mod

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequestResponse
import typings.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var currentRetryAttempt: js.UndefOr[Double] = js.undefined
  var noResponseRetries: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    currentRetryAttempt: js.UndefOr[Double] = js.undefined,
    noResponseRetries: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    request: RequestAPI[Request, CoreOptions, RequiredUriUrl] = null,
    retries: js.UndefOr[Double] = js.undefined,
    shouldRetryFn: /* response */ RequestResponse => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentRetryAttempt)) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noResponseRetries)) __obj.updateDynamic("noResponseRetries")(noResponseRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(js.Any.fromFunction1(shouldRetryFn))
    __obj.asInstanceOf[Options]
  }
}

