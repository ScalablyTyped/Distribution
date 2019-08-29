package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSupportedConstraints extends js.Object {
  var aspectRatio: js.UndefOr[scala.Boolean] = js.undefined
  var autoGainControl: js.UndefOr[scala.Boolean] = js.undefined
  var channelCount: js.UndefOr[scala.Boolean] = js.undefined
  var deviceId: js.UndefOr[scala.Boolean] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  var facingMode: js.UndefOr[scala.Boolean] = js.undefined
  var frameRate: js.UndefOr[scala.Boolean] = js.undefined
  var groupId: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Boolean] = js.undefined
  var latency: js.UndefOr[scala.Boolean] = js.undefined
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  var resizeMode: js.UndefOr[scala.Boolean] = js.undefined
  var sampleRate: js.UndefOr[scala.Boolean] = js.undefined
  var sampleSize: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[scala.Boolean] = js.undefined,
    autoGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    channelCount: js.UndefOr[scala.Boolean] = js.undefined,
    deviceId: js.UndefOr[scala.Boolean] = js.undefined,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: js.UndefOr[scala.Boolean] = js.undefined,
    frameRate: js.UndefOr[scala.Boolean] = js.undefined,
    groupId: js.UndefOr[scala.Boolean] = js.undefined,
    height: js.UndefOr[scala.Boolean] = js.undefined,
    latency: js.UndefOr[scala.Boolean] = js.undefined,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: js.UndefOr[scala.Boolean] = js.undefined,
    sampleRate: js.UndefOr[scala.Boolean] = js.undefined,
    sampleSize: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl)
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount)
    if (!js.isUndefined(deviceId)) __obj.updateDynamic("deviceId")(deviceId)
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (!js.isUndefined(facingMode)) __obj.updateDynamic("facingMode")(facingMode)
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate)
    if (!js.isUndefined(groupId)) __obj.updateDynamic("groupId")(groupId)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency)
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    if (!js.isUndefined(resizeMode)) __obj.updateDynamic("resizeMode")(resizeMode)
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate)
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

