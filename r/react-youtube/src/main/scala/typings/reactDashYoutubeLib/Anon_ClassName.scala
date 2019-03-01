package typings
package reactDashYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onEnd: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ Anon_DataTarget, scala.Unit]] = js.undefined
  var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* event */ Anon_Target, scala.Unit]] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* event */ Anon_Data, scala.Unit]] = js.undefined
  var opts: js.UndefOr[reactDashYoutubeLib.reactDashYoutubeMod.Options] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    containerClassName: java.lang.String = null,
    id: java.lang.String = null,
    onEnd: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    onError: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    onPause: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    onPlay: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    onPlaybackQualityChange: js.Function1[/* event */ Anon_DataTarget, scala.Unit] = null,
    onPlaybackRateChange: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    onReady: js.Function1[/* event */ Anon_Target, scala.Unit] = null,
    onStateChange: js.Function1[/* event */ Anon_Data, scala.Unit] = null,
    opts: reactDashYoutubeLib.reactDashYoutubeMod.Options = null,
    videoId: java.lang.String = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaybackQualityChange != null) __obj.updateDynamic("onPlaybackQualityChange")(onPlaybackQualityChange)
    if (onPlaybackRateChange != null) __obj.updateDynamic("onPlaybackRateChange")(onPlaybackRateChange)
    if (onReady != null) __obj.updateDynamic("onReady")(onReady)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(onStateChange)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

