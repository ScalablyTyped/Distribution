package typings.sipJs.sessionInviteOptionsMod

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionInviteOptions extends js.Object {
  
  /**
    * See `core` API.
    */
  var requestDelegate: js.UndefOr[OutgoingRequestDelegate] = js.native
  
  /**
    * See `core` API.
    */
  var requestOptions: js.UndefOr[RequestOptions] = js.native
  
  /**
    * Modifiers to pass to SessionDescriptionHandler during re-INVITE transaction.
    */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  
  /**
    * Options to pass to SessionDescriptionHandler during re-INVITE transaction.
    */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  
  /**
    * If true, send INVITE without SDP. Default is false.
    */
  var withoutSdp: js.UndefOr[Boolean] = js.native
}
object SessionInviteOptions {
  
  @scala.inline
  def apply(): SessionInviteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionInviteOptions]
  }
  
  @scala.inline
  implicit class SessionInviteOptionsOps[Self <: SessionInviteOptions] (val x: Self) extends AnyVal {
    
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
    def setRequestDelegate(value: OutgoingRequestDelegate): Self = this.set("requestDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestDelegate: Self = this.set("requestDelegate", js.undefined)
    
    @scala.inline
    def setRequestOptions(value: RequestOptions): Self = this.set("requestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestOptions: Self = this.set("requestOptions", js.undefined)
    
    @scala.inline
    def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = this.set("sessionDescriptionHandlerModifiers", js.Array(value :_*))
    
    @scala.inline
    def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = this.set("sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDescriptionHandlerModifiers: Self = this.set("sessionDescriptionHandlerModifiers", js.undefined)
    
    @scala.inline
    def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = this.set("sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDescriptionHandlerOptions: Self = this.set("sessionDescriptionHandlerOptions", js.undefined)
    
    @scala.inline
    def setWithoutSdp(value: Boolean): Self = this.set("withoutSdp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithoutSdp: Self = this.set("withoutSdp", js.undefined)
  }
}
