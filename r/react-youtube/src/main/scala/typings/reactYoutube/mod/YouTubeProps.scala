package typings.reactYoutube.mod

import typings.reactYoutube.anon.Data
import typings.reactYoutube.anon.DataTarget
import typings.reactYoutube.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ DataTarget, Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ Target, Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.undefined
  var opts: js.UndefOr[Options] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
}

object YouTubeProps {
  @scala.inline
  def apply(
    className: String = null,
    containerClassName: String = null,
    id: String = null,
    onEnd: /* event */ Data => Unit = null,
    onError: /* event */ Data => Unit = null,
    onPause: /* event */ Data => Unit = null,
    onPlay: /* event */ Data => Unit = null,
    onPlaybackQualityChange: /* event */ DataTarget => Unit = null,
    onPlaybackRateChange: /* event */ Data => Unit = null,
    onReady: /* event */ Target => Unit = null,
    onStateChange: /* event */ Data => Unit = null,
    opts: Options = null,
    videoId: String = null
  ): YouTubeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1(onPlaybackQualityChange))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(onPlaybackRateChange))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeProps]
  }
}

