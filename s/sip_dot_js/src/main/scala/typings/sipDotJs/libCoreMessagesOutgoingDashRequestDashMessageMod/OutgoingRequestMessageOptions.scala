package typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod

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
    if (callId != null) __obj.updateDynamic("callId")(callId)
    if (callIdPrefix != null) __obj.updateDynamic("callIdPrefix")(callIdPrefix)
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport)
    if (fromDisplayName != null) __obj.updateDynamic("fromDisplayName")(fromDisplayName)
    if (fromTag != null) __obj.updateDynamic("fromTag")(fromTag)
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp)
    if (optionTags != null) __obj.updateDynamic("optionTags")(optionTags)
    if (routeSet != null) __obj.updateDynamic("routeSet")(routeSet)
    if (toDisplayName != null) __obj.updateDynamic("toDisplayName")(toDisplayName)
    if (toTag != null) __obj.updateDynamic("toTag")(toTag)
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString)
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost)
    __obj.asInstanceOf[OutgoingRequestMessageOptions]
  }
}

