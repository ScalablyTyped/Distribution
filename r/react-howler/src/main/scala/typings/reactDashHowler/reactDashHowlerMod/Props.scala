package typings.reactDashHowler.reactDashHowlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var format: js.UndefOr[js.Array[String]] = js.undefined
  var html5: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Boolean] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadError: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
  var onVolume: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
  var playing: js.UndefOr[Boolean] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var src: String | js.Array[String]
  var volume: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: String | js.Array[String],
    format: js.Array[String] = null,
    html5: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    mute: js.UndefOr[Boolean] = js.undefined,
    onEnd: () => Unit = null,
    onLoad: () => Unit = null,
    onLoadError: /* id */ Double => Unit = null,
    onPause: () => Unit = null,
    onPlay: /* id */ Double => Unit = null,
    onStop: /* id */ Double => Unit = null,
    onVolume: /* id */ Double => Unit = null,
    playing: js.UndefOr[Boolean] = js.undefined,
    preload: js.UndefOr[Boolean] = js.undefined,
    volume: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(html5)) __obj.updateDynamic("html5")(html5)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    if (onVolume != null) __obj.updateDynamic("onVolume")(js.Any.fromFunction1(onVolume))
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

