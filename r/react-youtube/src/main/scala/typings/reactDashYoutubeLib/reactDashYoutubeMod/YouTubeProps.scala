package typings
package reactDashYoutubeLib.reactDashYoutubeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_DataTarget, scala.Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Target, scala.Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* event */ reactDashYoutubeLib.Anon_Data, scala.Unit]] = js.undefined
  var opts: js.UndefOr[Options] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object YouTubeProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    containerClassName: java.lang.String = null,
    id: java.lang.String = null,
    onEnd: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    onError: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    onPause: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    onPlay: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    onPlaybackQualityChange: /* event */ reactDashYoutubeLib.Anon_DataTarget => scala.Unit = null,
    onPlaybackRateChange: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    onReady: /* event */ reactDashYoutubeLib.Anon_Target => scala.Unit = null,
    onStateChange: /* event */ reactDashYoutubeLib.Anon_Data => scala.Unit = null,
    opts: Options = null,
    videoId: java.lang.String = null
  ): YouTubeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1(onEnd))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(js.Any.fromFunction1(onPlaybackQualityChange))
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(js.Any.fromFunction1(onPlaybackRateChange))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[YouTubeProps]
  }
}

