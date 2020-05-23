package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var codecPayloadType: js.UndefOr[Double] = js.undefined
  var dtx: js.UndefOr[RTCDtxStatus] = js.undefined
  var maxBitrate: js.UndefOr[Double] = js.undefined
  var maxFramerate: js.UndefOr[Double] = js.undefined
  var ptime: js.UndefOr[Double] = js.undefined
  var scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    codecPayloadType: js.UndefOr[Double] = js.undefined,
    dtx: RTCDtxStatus = null,
    maxBitrate: js.UndefOr[Double] = js.undefined,
    maxFramerate: js.UndefOr[Double] = js.undefined,
    ptime: js.UndefOr[Double] = js.undefined,
    rid: java.lang.String = null,
    scaleResolutionDownBy: js.UndefOr[Double] = js.undefined
  ): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(codecPayloadType)) __obj.updateDynamic("codecPayloadType")(codecPayloadType.get.asInstanceOf[js.Any])
    if (dtx != null) __obj.updateDynamic("dtx")(dtx.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBitrate)) __obj.updateDynamic("maxBitrate")(maxBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFramerate)) __obj.updateDynamic("maxFramerate")(maxFramerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ptime)) __obj.updateDynamic("ptime")(ptime.get.asInstanceOf[js.Any])
    if (rid != null) __obj.updateDynamic("rid")(rid.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleResolutionDownBy)) __obj.updateDynamic("scaleResolutionDownBy")(scaleResolutionDownBy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
}

