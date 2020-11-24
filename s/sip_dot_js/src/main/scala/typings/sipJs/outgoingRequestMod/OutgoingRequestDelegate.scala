package typings.sipJs.outgoingRequestMod

import typings.sipJs.incomingResponseMod.IncomingResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingRequestDelegate extends js.Object {
  
  /**
    * Received a 2xx positive final response to this request.
    * @param response - Incoming response.
    */
  var onAccept: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response - Incoming response.
    */
  var onProgress: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  
  /**
    * Received a 3xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onRedirect: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  
  /**
    * Received a 4xx, 5xx, or 6xx negative final response to this request.
    * @param response - Incoming response.
    */
  var onReject: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
  
  /**
    * Received a 100 provisional response.
    * @param response - Incoming response.
    */
  var onTrying: js.UndefOr[js.Function1[/* response */ IncomingResponse, Unit]] = js.native
}
object OutgoingRequestDelegate {
  
  @scala.inline
  def apply(): OutgoingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingRequestDelegate]
  }
  
  @scala.inline
  implicit class OutgoingRequestDelegateOps[Self <: OutgoingRequestDelegate] (val x: Self) extends AnyVal {
    
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
    def setOnAccept(value: /* response */ IncomingResponse => Unit): Self = this.set("onAccept", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAccept: Self = this.set("onAccept", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* response */ IncomingResponse => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnRedirect(value: /* response */ IncomingResponse => Unit): Self = this.set("onRedirect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRedirect: Self = this.set("onRedirect", js.undefined)
    
    @scala.inline
    def setOnReject(value: /* response */ IncomingResponse => Unit): Self = this.set("onReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReject: Self = this.set("onReject", js.undefined)
    
    @scala.inline
    def setOnTrying(value: /* response */ IncomingResponse => Unit): Self = this.set("onTrying", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTrying: Self = this.set("onTrying", js.undefined)
  }
}
