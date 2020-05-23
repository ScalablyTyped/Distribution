package typings.reactPlyr.mod

import typings.reactPlyr.anon.Active
import typings.reactPlyr.anon.Controls
import typings.reactPlyr.anon.Default
import typings.reactPlyr.anon.Enabled
import typings.reactPlyr.anon.Focused
import typings.reactPlyr.anon.Key
import typings.reactPlyr.anon.Kind
import typings.reactPlyr.anon.Options
import typings.reactPlyr.anon.Size
import typings.reactPlyr.reactPlyrStrings.audio
import typings.reactPlyr.reactPlyrStrings.video
import typings.reactPlyr.reactPlyrStrings.vimeo
import typings.reactPlyr.reactPlyrStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autopause: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var blankVideo: js.UndefOr[String] = js.undefined
  var captions: js.UndefOr[js.Array[Kind]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clickToPlay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var disableContextMenu: js.UndefOr[Boolean] = js.undefined
  var displayDuration: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fullscreen: js.UndefOr[Enabled] = js.undefined
  var hideControls: js.UndefOr[Boolean] = js.undefined
  var iconPrefix: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var invertTime: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Focused] = js.undefined
  var loadSprite: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Active] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
  var onCaptionsDisabled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onCaptionsEnabled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onEnterFullscreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onExitFullscreen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLoadedData: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* player */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onSeeked: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.undefined
  var onTimeUpdate: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.undefined
  var onVolumeChange: js.UndefOr[js.Function1[/* params */ OnVolumeChangeParam, Unit]] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Default] = js.undefined
  var ratio: js.UndefOr[String] = js.undefined
  var resetOnEnd: js.UndefOr[Boolean] = js.undefined
  var seekTime: js.UndefOr[Double] = js.undefined
  var settings: js.UndefOr[js.Array[String]] = js.undefined
  var sources: js.UndefOr[js.Array[Size]] = js.undefined
  var speed: js.UndefOr[Options] = js.undefined
  var storage: js.UndefOr[Key] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var toggleInvert: js.UndefOr[Boolean] = js.undefined
  var tooltips: js.UndefOr[Controls] = js.undefined
  var `type`: js.UndefOr[youtube | vimeo | video | audio] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autopause: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    blankVideo: String = null,
    captions: js.Array[Kind] = null,
    className: String = null,
    clickToPlay: js.UndefOr[Boolean] = js.undefined,
    controls: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableContextMenu: js.UndefOr[Boolean] = js.undefined,
    displayDuration: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fullscreen: Enabled = null,
    hideControls: js.UndefOr[Boolean] = js.undefined,
    iconPrefix: String = null,
    iconUrl: String = null,
    invertTime: js.UndefOr[Boolean] = js.undefined,
    keyboard: Focused = null,
    loadSprite: js.UndefOr[Boolean] = js.undefined,
    loop: Active = null,
    muted: js.UndefOr[Boolean] = js.undefined,
    onCaptionsDisabled: () => Unit = null,
    onCaptionsEnabled: () => Unit = null,
    onEnd: () => Unit = null,
    onEnterFullscreen: () => Unit = null,
    onExitFullscreen: () => Unit = null,
    onLoadedData: () => Unit = null,
    onPause: () => Unit = null,
    onPlay: () => Unit = null,
    onReady: /* player */ js.UndefOr[js.Any] => Unit = null,
    onSeeked: /* time */ js.UndefOr[Double] => Unit = null,
    onTimeUpdate: /* time */ js.UndefOr[Double] => Unit = null,
    onVolumeChange: /* params */ OnVolumeChangeParam => Unit = null,
    poster: String = null,
    quality: Default = null,
    ratio: String = null,
    resetOnEnd: js.UndefOr[Boolean] = js.undefined,
    seekTime: js.UndefOr[Double] = js.undefined,
    settings: js.Array[String] = null,
    sources: js.Array[Size] = null,
    speed: Options = null,
    storage: Key = null,
    title: String = null,
    toggleInvert: js.UndefOr[Boolean] = js.undefined,
    tooltips: Controls = null,
    `type`: youtube | vimeo | video | audio = null,
    url: String = null,
    videoId: String = null,
    volume: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autopause)) __obj.updateDynamic("autopause")(autopause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (blankVideo != null) __obj.updateDynamic("blankVideo")(blankVideo.asInstanceOf[js.Any])
    if (captions != null) __obj.updateDynamic("captions")(captions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToPlay)) __obj.updateDynamic("clickToPlay")(clickToPlay.get.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDuration)) __obj.updateDynamic("displayDuration")(displayDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fullscreen != null) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hideControls)) __obj.updateDynamic("hideControls")(hideControls.get.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTime)) __obj.updateDynamic("invertTime")(invertTime.get.asInstanceOf[js.Any])
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (!js.isUndefined(loadSprite)) __obj.updateDynamic("loadSprite")(loadSprite.get.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
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
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnEnd)) __obj.updateDynamic("resetOnEnd")(resetOnEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seekTime)) __obj.updateDynamic("seekTime")(seekTime.get.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleInvert)) __obj.updateDynamic("toggleInvert")(toggleInvert.get.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

