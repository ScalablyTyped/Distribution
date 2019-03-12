package typings
package reactDashPlyrLib.reactDashPlyrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autopause: js.UndefOr[scala.Boolean] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var blankVideo: js.UndefOr[java.lang.String] = js.undefined
  var captions: js.UndefOr[js.Array[reactDashPlyrLib.Anon_DefaultKey]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clickToPlay: js.UndefOr[scala.Boolean] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var disableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  var displayDuration: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullscreen: js.UndefOr[reactDashPlyrLib.Anon_Enabled] = js.undefined
  var hideControls: js.UndefOr[scala.Boolean] = js.undefined
  var iconPrefix: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var invertTime: js.UndefOr[scala.Boolean] = js.undefined
  var keyboard: js.UndefOr[reactDashPlyrLib.Anon_Focused] = js.undefined
  var loadSprite: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[reactDashPlyrLib.Anon_Active] = js.undefined
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  var onCaptionsDisabled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onCaptionsEnabled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onEnterFullscreen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onExitFullscreen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoadedData: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* player */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* time */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  var onTimeUpdate: js.UndefOr[js.Function1[/* time */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* params */ OnVolumeChangeParam, scala.Unit]] = js.undefined
  var poster: js.UndefOr[java.lang.String] = js.undefined
  var quality: js.UndefOr[reactDashPlyrLib.Anon_Default] = js.undefined
  var ratio: js.UndefOr[java.lang.String] = js.undefined
  var resetOnEnd: js.UndefOr[scala.Boolean] = js.undefined
  var seekTime: js.UndefOr[scala.Double] = js.undefined
  var settings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sources: js.UndefOr[js.Array[reactDashPlyrLib.Anon_Size]] = js.undefined
  var speed: js.UndefOr[reactDashPlyrLib.Anon_Options] = js.undefined
  var storage: js.UndefOr[reactDashPlyrLib.Anon_EnabledKey] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var toggleInvert: js.UndefOr[scala.Boolean] = js.undefined
  var tooltips: js.UndefOr[reactDashPlyrLib.Anon_Controls] = js.undefined
  var `type`: js.UndefOr[
    reactDashPlyrLib.reactDashPlyrLibStrings.youtube | reactDashPlyrLib.reactDashPlyrLibStrings.vimeo | reactDashPlyrLib.reactDashPlyrLibStrings.video | reactDashPlyrLib.reactDashPlyrLibStrings.audio
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  var volume: js.UndefOr[scala.Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autopause: js.UndefOr[scala.Boolean] = js.undefined,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    blankVideo: java.lang.String = null,
    captions: js.Array[reactDashPlyrLib.Anon_DefaultKey] = null,
    className: java.lang.String = null,
    clickToPlay: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.Array[java.lang.String] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    disableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    displayDuration: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: reactDashPlyrLib.Anon_Enabled = null,
    hideControls: js.UndefOr[scala.Boolean] = js.undefined,
    iconPrefix: java.lang.String = null,
    iconUrl: java.lang.String = null,
    invertTime: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: reactDashPlyrLib.Anon_Focused = null,
    loadSprite: js.UndefOr[scala.Boolean] = js.undefined,
    loop: reactDashPlyrLib.Anon_Active = null,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    onCaptionsDisabled: () => scala.Unit = null,
    onCaptionsEnabled: () => scala.Unit = null,
    onEnd: () => scala.Unit = null,
    onEnterFullscreen: () => scala.Unit = null,
    onExitFullscreen: () => scala.Unit = null,
    onLoadedData: () => scala.Unit = null,
    onPause: () => scala.Unit = null,
    onPlay: () => scala.Unit = null,
    onReady: /* player */ js.UndefOr[js.Any] => scala.Unit = null,
    onSeeked: /* time */ js.UndefOr[scala.Double] => scala.Unit = null,
    onTimeUpdate: /* time */ js.UndefOr[scala.Double] => scala.Unit = null,
    onVolumeChange: /* params */ OnVolumeChangeParam => scala.Unit = null,
    poster: java.lang.String = null,
    quality: reactDashPlyrLib.Anon_Default = null,
    ratio: java.lang.String = null,
    resetOnEnd: js.UndefOr[scala.Boolean] = js.undefined,
    seekTime: scala.Int | scala.Double = null,
    settings: js.Array[java.lang.String] = null,
    sources: js.Array[reactDashPlyrLib.Anon_Size] = null,
    speed: reactDashPlyrLib.Anon_Options = null,
    storage: reactDashPlyrLib.Anon_EnabledKey = null,
    title: java.lang.String = null,
    toggleInvert: js.UndefOr[scala.Boolean] = js.undefined,
    tooltips: reactDashPlyrLib.Anon_Controls = null,
    `type`: reactDashPlyrLib.reactDashPlyrLibStrings.youtube | reactDashPlyrLib.reactDashPlyrLibStrings.vimeo | reactDashPlyrLib.reactDashPlyrLibStrings.video | reactDashPlyrLib.reactDashPlyrLibStrings.audio = null,
    url: java.lang.String = null,
    videoId: java.lang.String = null,
    volume: scala.Int | scala.Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (blankVideo != null) __obj.updateDynamic("blankVideo")(blankVideo)
    if (captions != null) __obj.updateDynamic("captions")(captions)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu)
    if (!js.isUndefined(displayDuration)) __obj.updateDynamic("displayDuration")(displayDuration)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(hideControls)) __obj.updateDynamic("hideControls")(hideControls)
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (!js.isUndefined(invertTime)) __obj.updateDynamic("invertTime")(invertTime)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(loadSprite)) __obj.updateDynamic("loadSprite")(loadSprite)
    if (loop != null) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (onCaptionsDisabled != null) __obj.updateDynamic("onCaptionsDisabled")(js.Any.fromFunction0(onCaptionsDisabled))
    if (onCaptionsEnabled != null) __obj.updateDynamic("onCaptionsEnabled")(js.Any.fromFunction0(onCaptionsEnabled))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction0(onEnd))
    if (onEnterFullscreen != null) __obj.updateDynamic("onEnterFullscreen")(js.Any.fromFunction0(onEnterFullscreen))
    if (onExitFullscreen != null) __obj.updateDynamic("onExitFullscreen")(js.Any.fromFunction0(onExitFullscreen))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction0(onLoadedData))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction0(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction0(onPlay))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (quality != null) __obj.updateDynamic("quality")(quality)
    if (ratio != null) __obj.updateDynamic("ratio")(ratio)
    if (!js.isUndefined(resetOnEnd)) __obj.updateDynamic("resetOnEnd")(resetOnEnd)
    if (seekTime != null) __obj.updateDynamic("seekTime")(seekTime.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (speed != null) __obj.updateDynamic("speed")(speed)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(toggleInvert)) __obj.updateDynamic("toggleInvert")(toggleInvert)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

