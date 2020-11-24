package typings.sipJs.outgoingRequestMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingRequestMessageOptions extends js.Object {
  
  var callId: js.UndefOr[String] = js.native
  
  var callIdPrefix: js.UndefOr[String] = js.native
  
  var cseq: js.UndefOr[Double] = js.native
  
  var forceRport: js.UndefOr[Boolean] = js.native
  
  var fromDisplayName: js.UndefOr[String] = js.native
  
  var fromTag: js.UndefOr[String] = js.native
  
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  
  var optionTags: js.UndefOr[js.Array[String]] = js.native
  
  var routeSet: js.UndefOr[js.Array[String]] = js.native
  
  var toDisplayName: js.UndefOr[String] = js.native
  
  var toTag: js.UndefOr[String] = js.native
  
  var userAgentString: js.UndefOr[String] = js.native
  
  var viaHost: js.UndefOr[String] = js.native
}
object OutgoingRequestMessageOptions {
  
  @scala.inline
  def apply(): OutgoingRequestMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingRequestMessageOptions]
  }
  
  @scala.inline
  implicit class OutgoingRequestMessageOptionsOps[Self <: OutgoingRequestMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setCallId(value: String): Self = this.set("callId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallId: Self = this.set("callId", js.undefined)
    
    @scala.inline
    def setCallIdPrefix(value: String): Self = this.set("callIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallIdPrefix: Self = this.set("callIdPrefix", js.undefined)
    
    @scala.inline
    def setCseq(value: Double): Self = this.set("cseq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCseq: Self = this.set("cseq", js.undefined)
    
    @scala.inline
    def setForceRport(value: Boolean): Self = this.set("forceRport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRport: Self = this.set("forceRport", js.undefined)
    
    @scala.inline
    def setFromDisplayName(value: String): Self = this.set("fromDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromDisplayName: Self = this.set("fromDisplayName", js.undefined)
    
    @scala.inline
    def setFromTag(value: String): Self = this.set("fromTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTag: Self = this.set("fromTag", js.undefined)
    
    @scala.inline
    def setHackViaTcp(value: Boolean): Self = this.set("hackViaTcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHackViaTcp: Self = this.set("hackViaTcp", js.undefined)
    
    @scala.inline
    def setOptionTagsVarargs(value: String*): Self = this.set("optionTags", js.Array(value :_*))
    
    @scala.inline
    def setOptionTags(value: js.Array[String]): Self = this.set("optionTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionTags: Self = this.set("optionTags", js.undefined)
    
    @scala.inline
    def setRouteSetVarargs(value: String*): Self = this.set("routeSet", js.Array(value :_*))
    
    @scala.inline
    def setRouteSet(value: js.Array[String]): Self = this.set("routeSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSet: Self = this.set("routeSet", js.undefined)
    
    @scala.inline
    def setToDisplayName(value: String): Self = this.set("toDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDisplayName: Self = this.set("toDisplayName", js.undefined)
    
    @scala.inline
    def setToTag(value: String): Self = this.set("toTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToTag: Self = this.set("toTag", js.undefined)
    
    @scala.inline
    def setUserAgentString(value: String): Self = this.set("userAgentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgentString: Self = this.set("userAgentString", js.undefined)
    
    @scala.inline
    def setViaHost(value: String): Self = this.set("viaHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViaHost: Self = this.set("viaHost", js.undefined)
  }
}
