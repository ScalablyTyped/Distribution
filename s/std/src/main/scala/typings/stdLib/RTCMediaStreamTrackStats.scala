package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCMediaStreamTrackStats extends RTCStats {
  var audioLevel: js.UndefOr[scala.Double] = js.undefined
  var echoReturnLoss: js.UndefOr[scala.Double] = js.undefined
  var echoReturnLossEnhancement: js.UndefOr[scala.Double] = js.undefined
  var frameHeight: js.UndefOr[scala.Double] = js.undefined
  var frameWidth: js.UndefOr[scala.Double] = js.undefined
  var framesCorrupted: js.UndefOr[scala.Double] = js.undefined
  var framesDecoded: js.UndefOr[scala.Double] = js.undefined
  var framesDropped: js.UndefOr[scala.Double] = js.undefined
  var framesPerSecond: js.UndefOr[scala.Double] = js.undefined
  var framesReceived: js.UndefOr[scala.Double] = js.undefined
  var framesSent: js.UndefOr[scala.Double] = js.undefined
  var remoteSource: js.UndefOr[scala.Boolean] = js.undefined
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var trackIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object RTCMediaStreamTrackStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: scala.Double,
    `type`: RTCStatsType,
    audioLevel: scala.Int | scala.Double = null,
    echoReturnLoss: scala.Int | scala.Double = null,
    echoReturnLossEnhancement: scala.Int | scala.Double = null,
    frameHeight: scala.Int | scala.Double = null,
    frameWidth: scala.Int | scala.Double = null,
    framesCorrupted: scala.Int | scala.Double = null,
    framesDecoded: scala.Int | scala.Double = null,
    framesDropped: scala.Int | scala.Double = null,
    framesPerSecond: scala.Int | scala.Double = null,
    framesReceived: scala.Int | scala.Double = null,
    framesSent: scala.Int | scala.Double = null,
    remoteSource: js.UndefOr[scala.Boolean] = js.undefined,
    ssrcIds: js.Array[java.lang.String] = null,
    trackIdentifier: java.lang.String = null
  ): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("timestamp")(timestamp)
    if (audioLevel != null) __obj.updateDynamic("audioLevel")(audioLevel.asInstanceOf[js.Any])
    if (echoReturnLoss != null) __obj.updateDynamic("echoReturnLoss")(echoReturnLoss.asInstanceOf[js.Any])
    if (echoReturnLossEnhancement != null) __obj.updateDynamic("echoReturnLossEnhancement")(echoReturnLossEnhancement.asInstanceOf[js.Any])
    if (frameHeight != null) __obj.updateDynamic("frameHeight")(frameHeight.asInstanceOf[js.Any])
    if (frameWidth != null) __obj.updateDynamic("frameWidth")(frameWidth.asInstanceOf[js.Any])
    if (framesCorrupted != null) __obj.updateDynamic("framesCorrupted")(framesCorrupted.asInstanceOf[js.Any])
    if (framesDecoded != null) __obj.updateDynamic("framesDecoded")(framesDecoded.asInstanceOf[js.Any])
    if (framesDropped != null) __obj.updateDynamic("framesDropped")(framesDropped.asInstanceOf[js.Any])
    if (framesPerSecond != null) __obj.updateDynamic("framesPerSecond")(framesPerSecond.asInstanceOf[js.Any])
    if (framesReceived != null) __obj.updateDynamic("framesReceived")(framesReceived.asInstanceOf[js.Any])
    if (framesSent != null) __obj.updateDynamic("framesSent")(framesSent.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSource)) __obj.updateDynamic("remoteSource")(remoteSource)
    if (ssrcIds != null) __obj.updateDynamic("ssrcIds")(ssrcIds)
    if (trackIdentifier != null) __obj.updateDynamic("trackIdentifier")(trackIdentifier)
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
}

