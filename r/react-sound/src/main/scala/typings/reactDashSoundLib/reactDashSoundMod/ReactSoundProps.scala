package typings
package reactDashSoundLib.reactDashSoundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSoundProps extends js.Object {
  var autoLoad: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var onBufferChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onFinishedPlaying: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoading: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlaying: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onResume: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var playFromPosition: js.UndefOr[scala.Double] = js.undefined
  var playStatus: PlayStatus
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object ReactSoundProps {
  @scala.inline
  def apply(
    playStatus: PlayStatus,
    url: java.lang.String,
    autoLoad: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    onBufferChange: () => scala.Unit = null,
    onError: () => scala.Unit = null,
    onFinishedPlaying: () => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onLoading: () => scala.Unit = null,
    onPause: () => scala.Unit = null,
    onPlaying: () => scala.Unit = null,
    onResume: () => scala.Unit = null,
    onStop: () => scala.Unit = null,
    playFromPosition: scala.Int | scala.Double = null,
    playbackRate: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): ReactSoundProps = {
    val __obj = js.Dynamic.literal(playStatus = playStatus, url = url)
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (onBufferChange != null) __obj.updateDynamic("onBufferChange")(js.Any.fromFunction0(onBufferChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onFinishedPlaying != null) __obj.updateDynamic("onFinishedPlaying")(js.Any.fromFunction0(onFinishedPlaying))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoading != null) __obj.updateDynamic("onLoading")(js.Any.fromFunction0(onLoading))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction0(onPlaying))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction0(onResume))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction0(onStop))
    if (playFromPosition != null) __obj.updateDynamic("playFromPosition")(playFromPosition.asInstanceOf[js.Any])
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSoundProps]
  }
}

