package typings.sipJs.sessionReferOptionsMod

import typings.sipJs.notificationMod.Notification
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionReferOptions extends js.Object {
  
  /** Called upon receiving an incoming NOTIFY associated with a REFER. */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.native
  
  /** See `core` API. */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  
  /** See `core` API. */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
}
object SessionReferOptions {
  
  @scala.inline
  def apply(): SessionReferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReferOptions]
  }
  
  @scala.inline
  implicit class SessionReferOptionsOps[Self <: SessionReferOptions] (val x: Self) extends AnyVal {
    
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
    def setOnNotify(value: /* notification */ Notification => Unit): Self = this.set("onNotify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNotify: Self = this.set("onNotify", js.undefined)
    
    @scala.inline
    def setRequestDelegate(value: OutgoingRequestDelegate): Self = this.set("requestDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDelegate: Self = this.set("requestDelegate", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
  }
}
