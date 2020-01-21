package typings.sipJs.outgoingRequestMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequestMessageOptions extends js.Object {
  var callId: js.UndefOr[String] = js.undefined
  var callIdPrefix: js.UndefOr[String] = js.undefined
  var cseq: js.UndefOr[Double] = js.undefined
  var forceRport: js.UndefOr[Boolean] = js.undefined
  var fromDisplayName: js.UndefOr[String] = js.undefined
  var fromTag: js.UndefOr[String] = js.undefined
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  var optionTags: js.UndefOr[js.Array[String]] = js.undefined
  var routeSet: js.UndefOr[js.Array[String]] = js.undefined
  var toDisplayName: js.UndefOr[String] = js.undefined
  var toTag: js.UndefOr[String] = js.undefined
  var userAgentString: js.UndefOr[String] = js.undefined
  var viaHost: js.UndefOr[String] = js.undefined
}

object OutgoingRequestMessageOptions {
  @scala.inline
  def apply(
    callId: String = null,
    callIdPrefix: String = null,
    cseq: Int | Double = null,
    forceRport: js.UndefOr[Boolean] = js.undefined,
    fromDisplayName: String = null,
    fromTag: String = null,
    hackViaTcp: js.UndefOr[Boolean] = js.undefined,
    optionTags: js.Array[String] = null,
    routeSet: js.Array[String] = null,
    toDisplayName: String = null,
    toTag: String = null,
    userAgentString: String = null,
    viaHost: String = null
  ): OutgoingRequestMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (callId != null) __obj.updateDynamic("callId")(callId.asInstanceOf[js.Any])
    if (callIdPrefix != null) __obj.updateDynamic("callIdPrefix")(callIdPrefix.asInstanceOf[js.Any])
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport.asInstanceOf[js.Any])
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName.asInstanceOf[js.Any])
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag.asInstanceOf[js.Any])
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp.asInstanceOf[js.Any])
    if (optionTags != null) __obj.updateDynamic("optionTags")(optionTags.asInstanceOf[js.Any])
    if (routeSet != null) __obj.updateDynamic("routeSet")(routeSet.asInstanceOf[js.Any])
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName.asInstanceOf[js.Any])
    if (toTag != null) __obj.updateDynamic("toTag")(toTag.asInstanceOf[js.Any])
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString.asInstanceOf[js.Any])
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingRequestMessageOptions]
  }
}

