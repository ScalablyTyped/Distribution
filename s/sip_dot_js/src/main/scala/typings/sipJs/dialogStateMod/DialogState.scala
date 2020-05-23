package typings.sipJs.dialogStateMod

import typings.sipJs.uriMod.URI
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
    localSequenceNumber: js.UndefOr[Double] = js.undefined,
    remoteSequenceNumber: js.UndefOr[Double] = js.undefined
  ): DialogState = {
    val __obj = js.Dynamic.literal(callId = callId.asInstanceOf[js.Any], early = early.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localTag = localTag.asInstanceOf[js.Any], localURI = localURI.asInstanceOf[js.Any], remoteTag = remoteTag.asInstanceOf[js.Any], remoteTarget = remoteTarget.asInstanceOf[js.Any], remoteURI = remoteURI.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    if (!js.isUndefined(localSequenceNumber)) __obj.updateDynamic("localSequenceNumber")(localSequenceNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSequenceNumber)) __obj.updateDynamic("remoteSequenceNumber")(remoteSequenceNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogState]
  }
}

