package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackCapabilities extends js.Object {
  var aspectRatio: js.UndefOr[scala.Double | DoubleRange] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var echoCancellation: js.UndefOr[Array[scala.Boolean]] = js.undefined
  var facingMode: js.UndefOr[java.lang.String] = js.undefined
  var frameRate: js.UndefOr[scala.Double | DoubleRange] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | LongRange] = js.undefined
  var sampleRate: js.UndefOr[scala.Double | LongRange] = js.undefined
  var sampleSize: js.UndefOr[scala.Double | LongRange] = js.undefined
  var volume: js.UndefOr[scala.Double | DoubleRange] = js.undefined
  var width: js.UndefOr[scala.Double | LongRange] = js.undefined
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(
    aspectRatio: scala.Double | DoubleRange = null,
    deviceId: java.lang.String = null,
    echoCancellation: Array[scala.Boolean] = null,
    facingMode: java.lang.String = null,
    frameRate: scala.Double | DoubleRange = null,
    groupId: java.lang.String = null,
    height: scala.Double | LongRange = null,
    sampleRate: scala.Double | LongRange = null,
    sampleSize: scala.Double | LongRange = null,
    volume: scala.Double | DoubleRange = null,
    width: scala.Double | LongRange = null
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

