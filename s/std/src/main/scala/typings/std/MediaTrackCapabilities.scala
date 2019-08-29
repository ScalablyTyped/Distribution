package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackCapabilities extends js.Object {
  var aspectRatio: js.UndefOr[DoubleRange] = js.undefined
  var autoGainControl: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  var channelCount: js.UndefOr[ULongRange] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var echoCancellation: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  var facingMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var frameRate: js.UndefOr[DoubleRange] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[ULongRange] = js.undefined
  var latency: js.UndefOr[DoubleRange] = js.undefined
  var noiseSuppression: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  var resizeMode: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sampleRate: js.UndefOr[ULongRange] = js.undefined
  var sampleSize: js.UndefOr[ULongRange] = js.undefined
  var width: js.UndefOr[ULongRange] = js.undefined
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(
    aspectRatio: DoubleRange = null,
    autoGainControl: js.Array[scala.Boolean] = null,
    channelCount: ULongRange = null,
    deviceId: java.lang.String = null,
    echoCancellation: js.Array[scala.Boolean] = null,
    facingMode: js.Array[java.lang.String] = null,
    frameRate: DoubleRange = null,
    groupId: java.lang.String = null,
    height: ULongRange = null,
    latency: DoubleRange = null,
    noiseSuppression: js.Array[scala.Boolean] = null,
    resizeMode: js.Array[java.lang.String] = null,
    sampleRate: ULongRange = null,
    sampleSize: ULongRange = null,
    width: ULongRange = null
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (autoGainControl != null) __obj.updateDynamic("autoGainControl")(autoGainControl)
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (height != null) __obj.updateDynamic("height")(height)
    if (latency != null) __obj.updateDynamic("latency")(latency)
    if (noiseSuppression != null) __obj.updateDynamic("noiseSuppression")(noiseSuppression)
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate)
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

