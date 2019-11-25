package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCMediaStreamTrackStats extends RTCStats {
  var audioLevel: js.UndefOr[Double] = js.undefined
  var echoReturnLoss: js.UndefOr[Double] = js.undefined
  var echoReturnLossEnhancement: js.UndefOr[Double] = js.undefined
  var frameHeight: js.UndefOr[Double] = js.undefined
  var frameWidth: js.UndefOr[Double] = js.undefined
  var framesCorrupted: js.UndefOr[Double] = js.undefined
  var framesDecoded: js.UndefOr[Double] = js.undefined
  var framesDropped: js.UndefOr[Double] = js.undefined
  var framesPerSecond: js.UndefOr[Double] = js.undefined
  var framesReceived: js.UndefOr[Double] = js.undefined
  var framesSent: js.UndefOr[Double] = js.undefined
  var remoteSource: js.UndefOr[scala.Boolean] = js.undefined
  var ssrcIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var trackIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object RTCMediaStreamTrackStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    audioLevel: Int | Double = null,
    echoReturnLoss: Int | Double = null,
    echoReturnLossEnhancement: Int | Double = null,
    frameHeight: Int | Double = null,
    frameWidth: Int | Double = null,
    framesCorrupted: Int | Double = null,
    framesDecoded: Int | Double = null,
    framesDropped: Int | Double = null,
    framesPerSecond: Int | Double = null,
    framesReceived: Int | Double = null,
    framesSent: Int | Double = null,
    remoteSource: js.UndefOr[scala.Boolean] = js.undefined,
    ssrcIds: js.Array[java.lang.String] = null,
    trackIdentifier: java.lang.String = null
  ): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    if (!js.isUndefined(remoteSource)) __obj.updateDynamic("remoteSource")(remoteSource.asInstanceOf[js.Any])
    if (ssrcIds != null) __obj.updateDynamic("ssrcIds")(ssrcIds.asInstanceOf[js.Any])
    if (trackIdentifier != null) __obj.updateDynamic("trackIdentifier")(trackIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
}

