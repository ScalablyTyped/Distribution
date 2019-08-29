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
    aspectRatio: Int | Double = null,
    autoGainControl: js.UndefOr[scala.Boolean] = js.undefined,
    channelCount: Int | Double = null,
    deviceId: java.lang.String = null,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: java.lang.String = null,
    frameRate: Int | Double = null,
    groupId: java.lang.String = null,
    height: Int | Double = null,
    latency: Int | Double = null,
    noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined,
    resizeMode: java.lang.String = null,
    sampleRate: Int | Double = null,
    sampleSize: Int | Double = null,
    width: Int | Double = null
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGainControl)) __obj.updateDynamic("autoGainControl")(autoGainControl)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (!js.isUndefined(noiseSuppression)) __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

