package typings.rxjs.ajaxObservableMod

import typings.rxjs.subscriberMod.Subscriber
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxRequest extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var createXHR: js.UndefOr[js.Function0[XMLHttpRequest]] = js.native
  
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  var hasContent: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var progressSubscriber: js.UndefOr[Subscriber[_]] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object AjaxRequest {
  
  @scala.inline
  def apply(): AjaxRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxRequest]
  }
  
  @scala.inline
  implicit class AjaxRequestOps[Self <: AjaxRequest] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCreateXHR(value: () => XMLHttpRequest): Self = this.set("createXHR", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreateXHR: Self = this.set("createXHR", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = this.set("crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDomain: Self = this.set("crossDomain", js.undefined)
    
    @scala.inline
    def setHasContent(value: Boolean): Self = this.set("hasContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasContent: Self = this.set("hasContent", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setProgressSubscriber(value: Subscriber[_]): Self = this.set("progressSubscriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressSubscriber: Self = this.set("progressSubscriber", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
