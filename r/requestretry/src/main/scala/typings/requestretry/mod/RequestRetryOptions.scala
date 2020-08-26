package typings.requestretry.mod

import typings.node.httpMod.IncomingMessage
import typings.request.mod.CoreOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestRetryOptions extends CoreOptions {
  var delayStrategy: js.UndefOr[DelayStrategy] = js.native
  var fullResponse: js.UndefOr[Boolean] = js.native
  var maxAttempts: js.UndefOr[Double] = js.native
  var promiseFactory: js.UndefOr[js.Function1[/* resolver */ js.Any, _]] = js.native
  var retryDelay: js.UndefOr[Double] = js.native
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
}

object RequestRetryOptions {
  @scala.inline
  def apply(): RequestRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestRetryOptions]
  }
  @scala.inline
  implicit class RequestRetryOptionsOps[Self <: RequestRetryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelayStrategy(value: (/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any) => Double): Self = this.set("delayStrategy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDelayStrategy: Self = this.set("delayStrategy", js.undefined)
    @scala.inline
    def setFullResponse(value: Boolean): Self = this.set("fullResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullResponse: Self = this.set("fullResponse", js.undefined)
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    @scala.inline
    def setPromiseFactory(value: /* resolver */ js.Any => _): Self = this.set("promiseFactory", js.Any.fromFunction1(value))
    @scala.inline
    def deletePromiseFactory: Self = this.set("promiseFactory", js.undefined)
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    @scala.inline
    def setRetryStrategy(value: (/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any) => Boolean): Self = this.set("retryStrategy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
  }
  
}

