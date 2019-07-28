package typings.sipDotJs.libCoreDialogsDialogDashStateMod

import typings.sipDotJs.libCoreMessagesUriMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogState extends js.Object {
  var callId: String
  var early: Boolean
  var id: String
  var localSequenceNumber: js.UndefOr[Double] = js.undefined
  var localTag: String
  var localURI: URI
  var remoteSequenceNumber: js.UndefOr[Double] = js.undefined
  var remoteTag: String
  var remoteTarget: URI
  var remoteURI: URI
  var routeSet: js.Array[String]
  var secure: Boolean
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
    secure: Boolean,
    localSequenceNumber: Int | Double = null,
    remoteSequenceNumber: Int | Double = null
  ): DialogState = {
    val __obj = js.Dynamic.literal(callId = callId, early = early, id = id, localTag = localTag, localURI = localURI, remoteTag = remoteTag, remoteTarget = remoteTarget, remoteURI = remoteURI, routeSet = routeSet, secure = secure)
    if (localSequenceNumber != null) __obj.updateDynamic("localSequenceNumber")(localSequenceNumber.asInstanceOf[js.Any])
    if (remoteSequenceNumber != null) __obj.updateDynamic("remoteSequenceNumber")(remoteSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogState]
  }
}

