package typings.reactSound.mod

import typings.reactSound.reactSoundStrings.PAUSED
import typings.reactSound.reactSoundStrings.PLAYING
import typings.reactSound.reactSoundStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSoundProps extends js.Object {
  var autoLoad: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onResume: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var playFromPosition: js.UndefOr[Double] = js.undefined
  var playStatus: PLAYING | STOPPED | PAUSED
  var playbackRate: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var url: String
  var volume: js.UndefOr[Double] = js.undefined
}

object ReactSoundProps {
  @scala.inline
  def apply(
    playStatus: PLAYING | STOPPED | PAUSED,
    url: String,
    autoLoad: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onBufferChange: () => Unit = null,
    onError: () => Unit = null,
    onFinishedPlaying: () => Unit = null,
    onLoad: () => Unit = null,
    onLoading: () => Unit = null,
    onPause: () => Unit = null,
    onPlaying: () => Unit = null,
    onResume: () => Unit = null,
    onStop: () => Unit = null,
    playFromPosition: js.UndefOr[Double] = js.undefined,
    playbackRate: js.UndefOr[Double] = js.undefined,
    position: js.UndefOr[Double] = js.undefined,
    volume: js.UndefOr[Double] = js.undefined
  ): ReactSoundProps = {
    val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLoad)) __obj.updateDynamic("autoLoad")(autoLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (onBufferChange != null) __obj.updateDynamic("onBufferChange")(js.Any.fromFunction0(onBufferChange))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    if (onFinishedPlaying != null) __obj.updateDynamic("onFinishedPlaying")(js.Any.fromFunction0(onFinishedPlaying))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoading != null) __obj.updateDynamic("onLoading")(js.Any.fromFunction0(onLoading))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction0(onPlaying))
    if (onResume != null) __obj.updateDynamic("onResume")(js.Any.fromFunction0(onResume))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction0(onStop))
    if (!js.isUndefined(playFromPosition)) __obj.updateDynamic("playFromPosition")(playFromPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playbackRate)) __obj.updateDynamic("playbackRate")(playbackRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSoundProps]
  }
}

