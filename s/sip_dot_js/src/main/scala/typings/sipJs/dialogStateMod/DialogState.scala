package typings.sipJs.dialogStateMod

import typings.sipJs.grammarMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogState extends js.Object {
  var callId: String = js.native
  var early: Boolean = js.native
  var id: String = js.native
  var localSequenceNumber: js.UndefOr[Double] = js.native
  var localTag: String = js.native
  var localURI: URI = js.native
  var remoteSequenceNumber: js.UndefOr[Double] = js.native
  var remoteTag: String = js.native
  var remoteTarget: URI = js.native
  var remoteURI: URI = js.native
  var routeSet: js.Array[String] = js.native
  var secure: Boolean = js.native
}

object DialogState {
  @scala.inline
  def apply(
    callId: String,
    early: Boolean,
    id: String,
    localTag: String,
    localURI: URI,
    remoteTag: String,
    remoteTarget: URI,
    remoteURI: URI,
    routeSet: js.Array[String],
    secure: Boolean
  ): DialogState = {
    val __obj = js.Dynamic.literal(callId = callId.asInstanceOf[js.Any], early = early.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localTag = localTag.asInstanceOf[js.Any], localURI = localURI.asInstanceOf[js.Any], remoteTag = remoteTag.asInstanceOf[js.Any], remoteTarget = remoteTarget.asInstanceOf[js.Any], remoteURI = remoteURI.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogState]
  }
  @scala.inline
  implicit class DialogStateOps[Self <: DialogState] (val x: Self) extends AnyVal {
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
    def setEarly(value: Boolean): Self = this.set("early", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalTag(value: String): Self = this.set("localTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalURI(value: URI): Self = this.set("localURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteTag(value: String): Self = this.set("remoteTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteTarget(value: URI): Self = this.set("remoteTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteURI(value: URI): Self = this.set("remoteURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteSetVarargs(value: String*): Self = this.set("routeSet", js.Array(value :_*))
    @scala.inline
    def setRouteSet(value: js.Array[String]): Self = this.set("routeSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalSequenceNumber(value: Double): Self = this.set("localSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalSequenceNumber: Self = this.set("localSequenceNumber", js.undefined)
    @scala.inline
    def setRemoteSequenceNumber(value: Double): Self = this.set("remoteSequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteSequenceNumber: Self = this.set("remoteSequenceNumber", js.undefined)
  }
  
}

