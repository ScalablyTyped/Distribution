package typings.retryDashRequest.retryDashRequestMod

import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequestResponse
import typings.request.requestMod.RequiredUriUrl
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
    currentRetryAttempt: Int | Double = null,
    noResponseRetries: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    request: RequestAPI[Request, CoreOptions, RequiredUriUrl] = null,
    retries: Int | Double = null,
    shouldRetryFn: /* response */ RequestResponse => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (currentRetryAttempt != null) __obj.updateDynamic("currentRetryAttempt")(currentRetryAttempt.asInstanceOf[js.Any])
    if (noResponseRetries != null) __obj.updateDynamic("noResponseRetries")(noResponseRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (shouldRetryFn != null) __obj.updateDynamic("shouldRetryFn")(js.Any.fromFunction1(shouldRetryFn))
    __obj.asInstanceOf[Options]
  }
}

