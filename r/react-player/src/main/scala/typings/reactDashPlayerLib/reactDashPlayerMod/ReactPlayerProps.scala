package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactPlayerProps
  extends /* otherProps */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var config: js.UndefOr[Config] = js.undefined
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  var dailymotionConfig: js.UndefOr[DailyMotionConfig] = js.undefined
  var facebookConfig: js.UndefOr[FacebookConfig] = js.undefined
  var fileConfig: js.UndefOr[FileConfig] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var light: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var onBuffer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDisablePIP: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDuration: js.UndefOr[js.Function1[/* duration */ scala.Double, scala.Unit]] = js.undefined
  var onEnablePIP: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* state */ reactDashPlayerLib.Anon_Loaded, scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSeek: js.UndefOr[js.Function1[/* seconds */ scala.Double, scala.Unit]] = js.undefined
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var pip: js.UndefOr[scala.Boolean] = js.undefined
  var playbackRate: js.UndefOr[scala.Double] = js.undefined
  var playing: js.UndefOr[scala.Boolean] = js.undefined
  var playsinline: js.UndefOr[scala.Boolean] = js.undefined
  var progressInterval: js.UndefOr[scala.Double] = js.undefined
  var soundcloudConfig: js.UndefOr[SoundCloudConfig] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Array[SourceProps]] = js.undefined
  var vimeoConfig: js.UndefOr[VimeoConfig] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wistiaConfig: js.UndefOr[WistiaConfig] = js.undefined
  var wrapper: js.UndefOr[js.Any] = js.undefined
  var youtubeConfig: js.UndefOr[YouTubeConfig] = js.undefined
}

object ReactPlayerProps {
  @scala.inline
  def apply(
    StringDictionary: /* otherProps */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    config: Config = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    dailymotionConfig: DailyMotionConfig = null,
    facebookConfig: FacebookConfig = null,
    fileConfig: FileConfig = null,
    height: java.lang.String | scala.Double = null,
    light: scala.Boolean | java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    onBuffer: () => scala.Unit = null,
    onDisablePIP: () => scala.Unit = null,
    onDuration: /* duration */ scala.Double => scala.Unit = null,
    onEnablePIP: () => scala.Unit = null,
    onEnded: () => scala.Unit = null,
    onError: /* error */ js.Any => scala.Unit = null,
    onPause: () => scala.Unit = null,
    onPlay: () => scala.Unit = null,
    onProgress: /* state */ reactDashPlayerLib.Anon_Loaded => scala.Unit = null,
    onReady: () => scala.Unit = null,
    onSeek: /* seconds */ scala.Double => scala.Unit = null,
    onStart: () => scala.Unit = null,
    pip: js.UndefOr[scala.Boolean] = js.undefined,
    playbackRate: scala.Int | scala.Double = null,
    playing: js.UndefOr[scala.Boolean] = js.undefined,
    playsinline: js.UndefOr[scala.Boolean] = js.undefined,
    progressInterval: scala.Int | scala.Double = null,
    soundcloudConfig: SoundCloudConfig = null,
    style: js.Object = null,
    url: java.lang.String | js.Array[java.lang.String] | js.Array[SourceProps] = null,
    vimeoConfig: VimeoConfig = null,
    volume: scala.Int | scala.Double = null,
    width: java.lang.String | scala.Double = null,
    wistiaConfig: WistiaConfig = null,
    wrapper: js.Any = null,
    youtubeConfig: YouTubeConfig = null
  ): ReactPlayerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (dailymotionConfig != null) __obj.updateDynamic("dailymotionConfig")(dailymotionConfig)
    if (facebookConfig != null) __obj.updateDynamic("facebookConfig")(facebookConfig)
    if (fileConfig != null) __obj.updateDynamic("fileConfig")(fileConfig)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (onBuffer != null) __obj.updateDynamic("onBuffer")(js.Any.fromFunction0(onBuffer))
    if (onDisablePIP != null) __obj.updateDynamic("onDisablePIP")(js.Any.fromFunction0(onDisablePIP))
    if (onDuration != null) __obj.updateDynamic("onDuration")(js.Any.fromFunction1(onDuration))
    if (onEnablePIP != null) __obj.updateDynamic("onEnablePIP")(js.Any.fromFunction0(onEnablePIP))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction0(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction0(onPlay))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    if (onSeek != null) __obj.updateDynamic("onSeek")(js.Any.fromFunction1(onSeek))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    if (!js.isUndefined(pip)) __obj.updateDynamic("pip")(pip)
    if (playbackRate != null) __obj.updateDynamic("playbackRate")(playbackRate.asInstanceOf[js.Any])
    if (!js.isUndefined(playing)) __obj.updateDynamic("playing")(playing)
    if (!js.isUndefined(playsinline)) __obj.updateDynamic("playsinline")(playsinline)
    if (progressInterval != null) __obj.updateDynamic("progressInterval")(progressInterval.asInstanceOf[js.Any])
    if (soundcloudConfig != null) __obj.updateDynamic("soundcloudConfig")(soundcloudConfig)
    if (style != null) __obj.updateDynamic("style")(style)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (vimeoConfig != null) __obj.updateDynamic("vimeoConfig")(vimeoConfig)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wistiaConfig != null) __obj.updateDynamic("wistiaConfig")(wistiaConfig)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    if (youtubeConfig != null) __obj.updateDynamic("youtubeConfig")(youtubeConfig)
    __obj.asInstanceOf[ReactPlayerProps]
  }
}

