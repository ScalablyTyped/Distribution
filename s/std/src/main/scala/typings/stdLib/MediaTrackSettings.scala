package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSettings extends js.Object {
  var aspectRatio: js.UndefOr[scala.Double] = js.undefined
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  var facingMode: js.UndefOr[java.lang.String] = js.undefined
  var frameRate: js.UndefOr[scala.Double] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var sampleRate: js.UndefOr[scala.Double] = js.undefined
  var sampleSize: js.UndefOr[scala.Double] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MediaTrackSettings {
  @scala.inline
  def apply(
    aspectRatio: scala.Int | scala.Double = null,
    deviceId: java.lang.String = null,
    echoCancellation: js.UndefOr[scala.Boolean] = js.undefined,
    facingMode: java.lang.String = null,
    frameRate: scala.Int | scala.Double = null,
    groupId: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    sampleRate: scala.Int | scala.Double = null,
    sampleSize: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (!js.isUndefined(echoCancellation)) __obj.updateDynamic("echoCancellation")(echoCancellation)
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

