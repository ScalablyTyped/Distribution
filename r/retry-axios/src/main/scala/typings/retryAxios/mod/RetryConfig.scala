package typings.retryAxios.mod

import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryConfig extends js.Object {
  /**
    * The number of retries already attempted.
    */
  var currentRetryAttempt: js.UndefOr[Double] = js.native
  /**
    * The HTTP Methods that will be automatically retried.
    * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
    */
  var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.native
  /**
    * The instance of the axios object to which the interceptor is attached.
    */
  var instance: js.UndefOr[AxiosInstance] = js.native
  /**
    * When there is no response, the number of retries to attempt. Defaults to 2.
    */
  var noResponseRetries: js.UndefOr[Double] = js.native
  /**
    * Function to invoke when a retry attempt is made.
    */
  var onRetryAttempt: js.UndefOr[js.Function1[/* err */ AxiosError[_], Unit]] = js.native
  /**
    * The number of times to retry the request.  Defaults to 3.
    */
  var retry: js.UndefOr[Double] = js.native
  /**
    * The amount of time to initially delay the retry.  Defaults to 100.
    */
  var retryDelay: js.UndefOr[Double] = js.native
  /**
    * Function to invoke which determines if you should retry
    */
  var shouldRetry: js.UndefOr[js.Function1[/* err */ AxiosError[_], Boolean]] = js.native
  /**
    * The HTTP response status codes that will automatically be retried.
    * Defaults to: [[100, 199], [429, 429], [500, 599]]
    */
  var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}

object RetryConfig {
  @scala.inline
  def apply(): RetryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryConfig]
  }
  @scala.inline
  implicit class RetryConfigOps[Self <: RetryConfig] (val x: Self) extends AnyVal {
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
    def setCurrentRetryAttempt(value: Double): Self = this.set("currentRetryAttempt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentRetryAttempt: Self = this.set("currentRetryAttempt", js.undefined)
    @scala.inline
    def setHttpMethodsToRetryVarargs(value: String*): Self = this.set("httpMethodsToRetry", js.Array(value :_*))
    @scala.inline
    def setHttpMethodsToRetry(value: js.Array[String]): Self = this.set("httpMethodsToRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpMethodsToRetry: Self = this.set("httpMethodsToRetry", js.undefined)
    @scala.inline
    def setInstance(value: AxiosInstance): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setNoResponseRetries(value: Double): Self = this.set("noResponseRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResponseRetries: Self = this.set("noResponseRetries", js.undefined)
    @scala.inline
    def setOnRetryAttempt(value: /* err */ AxiosError[_] => Unit): Self = this.set("onRetryAttempt", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRetryAttempt: Self = this.set("onRetryAttempt", js.undefined)
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    @scala.inline
    def setShouldRetry(value: /* err */ AxiosError[_] => Boolean): Self = this.set("shouldRetry", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldRetry: Self = this.set("shouldRetry", js.undefined)
    @scala.inline
    def setStatusCodesToRetryVarargs(value: js.Array[Double]*): Self = this.set("statusCodesToRetry", js.Array(value :_*))
    @scala.inline
    def setStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = this.set("statusCodesToRetry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCodesToRetry: Self = this.set("statusCodesToRetry", js.undefined)
  }
  
}

