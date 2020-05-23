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
    audioLevel: js.UndefOr[Double] = js.undefined,
    echoReturnLoss: js.UndefOr[Double] = js.undefined,
    echoReturnLossEnhancement: js.UndefOr[Double] = js.undefined,
    frameHeight: js.UndefOr[Double] = js.undefined,
    frameWidth: js.UndefOr[Double] = js.undefined,
    framesCorrupted: js.UndefOr[Double] = js.undefined,
    framesDecoded: js.UndefOr[Double] = js.undefined,
    framesDropped: js.UndefOr[Double] = js.undefined,
    framesPerSecond: js.UndefOr[Double] = js.undefined,
    framesReceived: js.UndefOr[Double] = js.undefined,
    framesSent: js.UndefOr[Double] = js.undefined,
    remoteSource: js.UndefOr[scala.Boolean] = js.undefined,
    ssrcIds: js.Array[java.lang.String] = null,
    trackIdentifier: java.lang.String = null
  ): RTCMediaStreamTrackStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(audioLevel)) __obj.updateDynamic("audioLevel")(audioLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(echoReturnLoss)) __obj.updateDynamic("echoReturnLoss")(echoReturnLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(echoReturnLossEnhancement)) __obj.updateDynamic("echoReturnLossEnhancement")(echoReturnLossEnhancement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameWidth)) __obj.updateDynamic("frameWidth")(frameWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesCorrupted)) __obj.updateDynamic("framesCorrupted")(framesCorrupted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesDecoded)) __obj.updateDynamic("framesDecoded")(framesDecoded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesDropped)) __obj.updateDynamic("framesDropped")(framesDropped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesPerSecond)) __obj.updateDynamic("framesPerSecond")(framesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesReceived)) __obj.updateDynamic("framesReceived")(framesReceived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(framesSent)) __obj.updateDynamic("framesSent")(framesSent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSource)) __obj.updateDynamic("remoteSource")(remoteSource.get.asInstanceOf[js.Any])
    if (ssrcIds != null) __obj.updateDynamic("ssrcIds")(ssrcIds.asInstanceOf[js.Any])
    if (trackIdentifier != null) __obj.updateDynamic("trackIdentifier")(trackIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCMediaStreamTrackStats]
  }
}

