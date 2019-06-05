package typings
package sipDotJsLib.libCoreDialogsDialogDashStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogState extends js.Object {
  var callId: java.lang.String
  var early: scala.Boolean
  var id: java.lang.String
  var localSequenceNumber: js.UndefOr[scala.Double] = js.undefined
  var localTag: java.lang.String
  var localURI: sipDotJsLib.libCoreMessagesUriMod.URI
  var remoteSequenceNumber: js.UndefOr[scala.Double] = js.undefined
  var remoteTag: java.lang.String
  var remoteTarget: sipDotJsLib.libCoreMessagesUriMod.URI
  var remoteURI: sipDotJsLib.libCoreMessagesUriMod.URI
  var routeSet: js.Array[java.lang.String]
  var secure: scala.Boolean
}

object DialogState {
  @scala.inline
  def apply(
    callId: java.lang.String,
    early: scala.Boolean,
    id: java.lang.String,
    localTag: java.lang.String,
    localURI: sipDotJsLib.libCoreMessagesUriMod.URI,
    remoteTag: java.lang.String,
    remoteTarget: sipDotJsLib.libCoreMessagesUriMod.URI,
    remoteURI: sipDotJsLib.libCoreMessagesUriMod.URI,
    routeSet: js.Array[java.lang.String],
    secure: scala.Boolean,
    localSequenceNumber: scala.Int | scala.Double = null,
    remoteSequenceNumber: scala.Int | scala.Double = null
  ): DialogState = {
    val __obj = js.Dynamic.literal(callId = callId, early = early, id = id, localTag = localTag, localURI = localURI, remoteTag = remoteTag, remoteTarget = remoteTarget, remoteURI = remoteURI, routeSet = routeSet, secure = secure)
    if (localSequenceNumber != null) __obj.updateDynamic("localSequenceNumber")(localSequenceNumber.asInstanceOf[js.Any])
    if (remoteSequenceNumber != null) __obj.updateDynamic("remoteSequenceNumber")(remoteSequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogState]
  }
}

