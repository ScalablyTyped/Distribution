package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSettings extends js.Object {
  var aspectRatio: js.UndefOr[Double] = js.undefined
  var autoGainControl: js.UndefOr[scala.Boolean] = js.undefined
  var channelCount: js.UndefOr[Double] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  var facingMode: js.UndefOr[java.lang.String] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var latency: js.UndefOr[Double] = js.undefined
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  var resizeMode: js.UndefOr[java.lang.String] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
  var sampleSize: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object MediaTrackSettings {
  @scala.inline
  def apply(
    aspectRatio: js.UndefOr[Double] = js.undefined,
    autoGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    channelCount: js.UndefOr[Double] = js.undefined,
    deviceId: java.lang.String = null,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: java.lang.String = null,
    frameRate: js.UndefOr[Double] = js.undefined,
    groupId: java.lang.String = null,
    height: js.UndefOr[Double] = js.undefined,
    latency: js.UndefOr[Double] = js.undefined,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: java.lang.String = null,
    sampleRate: js.UndefOr[Double] = js.undefined,
    sampleSize: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation.get.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.get.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency)) __obj.updateDynamic("latency")(latency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression.get.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleSize)) __obj.updateDynamic("sampleSize")(sampleSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

