package typings
package sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequestMessageOptions extends js.Object {
  var callId: js.UndefOr[java.lang.String] = js.undefined
  var callIdPrefix: js.UndefOr[java.lang.String] = js.undefined
  var cseq: js.UndefOr[scala.Double] = js.undefined
  var forceRport: js.UndefOr[scala.Boolean] = js.undefined
  var fromDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var fromTag: js.UndefOr[java.lang.String] = js.undefined
  var hackViaTcp: js.UndefOr[scala.Boolean] = js.undefined
  var optionTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var routeSet: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var toDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var toTag: js.UndefOr[java.lang.String] = js.undefined
  var userAgentString: js.UndefOr[java.lang.String] = js.undefined
  var viaHost: js.UndefOr[java.lang.String] = js.undefined
}

object OutgoingRequestMessageOptions {
  @scala.inline
  def apply(
    callId: java.lang.String = null,
    callIdPrefix: java.lang.String = null,
    cseq: scala.Int | scala.Double = null,
    forceRport: js.UndefOr[scala.Boolean] = js.undefined,
    fromDisplayName: java.lang.String = null,
    fromTag: java.lang.String = null,
    hackViaTcp: js.UndefOr[scala.Boolean] = js.undefined,
    optionTags: js.Array[java.lang.String] = null,
    routeSet: js.Array[java.lang.String] = null,
    toDisplayName: java.lang.String = null,
    toTag: java.lang.String = null,
    userAgentString: java.lang.String = null,
    viaHost: java.lang.String = null
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

