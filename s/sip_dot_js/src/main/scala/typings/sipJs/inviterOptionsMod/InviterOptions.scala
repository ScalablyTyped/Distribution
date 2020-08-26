package typings.sipJs.inviterOptionsMod

import typings.sipJs.anon.FromDisplayName
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.sessionOptionsMod.SessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviterOptions extends SessionOptions {
  /** If true, an anonymous call. */
  var anonymous: js.UndefOr[Boolean] = js.native
  /**
    * If true, the first answer to the local offer is immediately utilized for media.
    * Requires that the INVITE request MUST NOT fork.
    * Has no effect if `inviteWithoutSdp` is true.
    * Default is false.
    */
  var earlyMedia: js.UndefOr[Boolean] = js.native
  /** Array of extra headers added to the INVITE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  /** If true, send INVITE without SDP. Default is false. */
  var inviteWithoutSdp: js.UndefOr[Boolean] = js.native
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromDisplayName] = js.native
  /** @deprecated TODO: provide alternative. */
  var renderbody: js.UndefOr[String] = js.native
  /** @deprecated TODO: provide alternative. */
  var rendertype: js.UndefOr[String] = js.native
  /** Modifiers to pass to SessionDescriptionHandler during the initial INVITE transaction. */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /** Modifiers to pass to SessionDescriptionHandler during re-INVITE transactions. */
  var sessionDescriptionHandlerModifiersReInvite: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /** Options to pass to SessionDescriptionHandler during the initial INVITE transaction. */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  /** Options to pass to SessionDescriptionHandler during re-INVITE transactions. */
  var sessionDescriptionHandlerOptionsReInvite: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
}

object InviterOptions {
  @scala.inline
  def apply(): InviterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviterOptions]
  }
  @scala.inline
  implicit class InviterOptionsOps[Self <: InviterOptions] (val x: Self) extends AnyVal {
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
    def setAnonymous(value: Boolean): Self = this.set("anonymous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymous: Self = this.set("anonymous", js.undefined)
    @scala.inline
    def setEarlyMedia(value: Boolean): Self = this.set("earlyMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyMedia: Self = this.set("earlyMedia", js.undefined)
    @scala.inline
    def setExtraHeadersVarargs(value: String*): Self = this.set("extraHeaders", js.Array(value :_*))
    @scala.inline
    def setExtraHeaders(value: js.Array[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setInviteWithoutSdp(value: Boolean): Self = this.set("inviteWithoutSdp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteWithoutSdp: Self = this.set("inviteWithoutSdp", js.undefined)
    @scala.inline
    def setParams(value: FromDisplayName): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setRenderbody(value: String): Self = this.set("renderbody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderbody: Self = this.set("renderbody", js.undefined)
    @scala.inline
    def setRendertype(value: String): Self = this.set("rendertype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRendertype: Self = this.set("rendertype", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = this.set("sessionDescriptionHandlerModifiers", js.Array(value :_*))
    @scala.inline
    def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = this.set("sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerModifiers: Self = this.set("sessionDescriptionHandlerModifiers", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerModifiersReInviteVarargs(value: SessionDescriptionHandlerModifier*): Self = this.set("sessionDescriptionHandlerModifiersReInvite", js.Array(value :_*))
    @scala.inline
    def setSessionDescriptionHandlerModifiersReInvite(value: js.Array[SessionDescriptionHandlerModifier]): Self = this.set("sessionDescriptionHandlerModifiersReInvite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerModifiersReInvite: Self = this.set("sessionDescriptionHandlerModifiersReInvite", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = this.set("sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerOptions: Self = this.set("sessionDescriptionHandlerOptions", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerOptionsReInvite(value: SessionDescriptionHandlerOptions): Self = this.set("sessionDescriptionHandlerOptionsReInvite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerOptionsReInvite: Self = this.set("sessionDescriptionHandlerOptionsReInvite", js.undefined)
  }
  
}

