package typings.retryRequest.mod

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequestResponse
import typings.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var currentRetryAttempt: js.UndefOr[Double] = js.native
  
  var noResponseRetries: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.native
  
  var retries: js.UndefOr[Double] = js.native
  
  var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setNoResponseRetries(value: Double): Self = this.set("noResponseRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResponseRetries: Self = this.set("noResponseRetries", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setShouldRetryFn(value: /* response */ RequestResponse => Boolean): Self = this.set("shouldRetryFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldRetryFn: Self = this.set("shouldRetryFn", js.undefined)
  }
}
