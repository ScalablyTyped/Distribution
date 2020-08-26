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

@js.native
trait Props extends js.Object {
  var autopause: js.UndefOr[Boolean] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var blankVideo: js.UndefOr[String] = js.native
  var captions: js.UndefOr[js.Array[Kind]] = js.native
  var className: js.UndefOr[String] = js.native
  var clickToPlay: js.UndefOr[Boolean] = js.native
  var controls: js.UndefOr[js.Array[String]] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var disableContextMenu: js.UndefOr[Boolean] = js.native
  var displayDuration: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var fullscreen: js.UndefOr[Enabled] = js.native
  var hideControls: js.UndefOr[Boolean] = js.native
  var iconPrefix: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var invertTime: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Focused] = js.native
  var loadSprite: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Active] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onCaptionsDisabled: js.UndefOr[js.Function0[Unit]] = js.native
  var onCaptionsEnabled: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnterFullscreen: js.UndefOr[js.Function0[Unit]] = js.native
  var onExitFullscreen: js.UndefOr[js.Function0[Unit]] = js.native
  var onLoadedData: js.UndefOr[js.Function0[Unit]] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onReady: js.UndefOr[js.Function1[/* player */ js.UndefOr[js.Any], Unit]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* time */ js.UndefOr[Double], Unit]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* params */ OnVolumeChangeParam, Unit]] = js.native
  var poster: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Default] = js.native
  var ratio: js.UndefOr[String] = js.native
  var resetOnEnd: js.UndefOr[Boolean] = js.native
  var seekTime: js.UndefOr[Double] = js.native
  var settings: js.UndefOr[js.Array[String]] = js.native
  var sources: js.UndefOr[js.Array[Size]] = js.native
  var speed: js.UndefOr[Options] = js.native
  var storage: js.UndefOr[Key] = js.native
  var title: js.UndefOr[String] = js.native
  var toggleInvert: js.UndefOr[Boolean] = js.native
  var tooltips: js.UndefOr[Controls] = js.native
  var `type`: js.UndefOr[youtube | vimeo | video | audio] = js.native
  var url: js.UndefOr[String] = js.native
  var videoId: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutopause(value: Boolean): Self = this.set("autopause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutopause: Self = this.set("autopause", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setBlankVideo(value: String): Self = this.set("blankVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlankVideo: Self = this.set("blankVideo", js.undefined)
    @scala.inline
    def setCaptionsVarargs(value: Kind*): Self = this.set("captions", js.Array(value :_*))
    @scala.inline
    def setCaptions(value: js.Array[Kind]): Self = this.set("captions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptions: Self = this.set("captions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClickToPlay(value: Boolean): Self = this.set("clickToPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToPlay: Self = this.set("clickToPlay", js.undefined)
    @scala.inline
    def setControlsVarargs(value: String*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[String]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisableContextMenu(value: Boolean): Self = this.set("disableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableContextMenu: Self = this.set("disableContextMenu", js.undefined)
    @scala.inline
    def setDisplayDuration(value: Boolean): Self = this.set("displayDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayDuration: Self = this.set("displayDuration", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFullscreen(value: Enabled): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setHideControls(value: Boolean): Self = this.set("hideControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideControls: Self = this.set("hideControls", js.undefined)
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconPrefix: Self = this.set("iconPrefix", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setInvertTime(value: Boolean): Self = this.set("invertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertTime: Self = this.set("invertTime", js.undefined)
    @scala.inline
    def setKeyboard(value: Focused): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLoadSprite(value: Boolean): Self = this.set("loadSprite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadSprite: Self = this.set("loadSprite", js.undefined)
    @scala.inline
    def setLoop(value: Active): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setOnCaptionsDisabled(value: () => Unit): Self = this.set("onCaptionsDisabled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCaptionsDisabled: Self = this.set("onCaptionsDisabled", js.undefined)
    @scala.inline
    def setOnCaptionsEnabled(value: () => Unit): Self = this.set("onCaptionsEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCaptionsEnabled: Self = this.set("onCaptionsEnabled", js.undefined)
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnEnterFullscreen(value: () => Unit): Self = this.set("onEnterFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnterFullscreen: Self = this.set("onEnterFullscreen", js.undefined)
    @scala.inline
    def setOnExitFullscreen(value: () => Unit): Self = this.set("onExitFullscreen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnExitFullscreen: Self = this.set("onExitFullscreen", js.undefined)
    @scala.inline
    def setOnLoadedData(value: () => Unit): Self = this.set("onLoadedData", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoadedData: Self = this.set("onLoadedData", js.undefined)
    @scala.inline
    def setOnPause(value: () => Unit): Self = this.set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: () => Unit): Self = this.set("onPlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnReady(value: /* player */ js.UndefOr[js.Any] => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnSeeked(value: /* time */ js.UndefOr[Double] => Unit): Self = this.set("onSeeked", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeeked: Self = this.set("onSeeked", js.undefined)
    @scala.inline
    def setOnTimeUpdate(value: /* time */ js.UndefOr[Double] => Unit): Self = this.set("onTimeUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTimeUpdate: Self = this.set("onTimeUpdate", js.undefined)
    @scala.inline
    def setOnVolumeChange(value: /* params */ OnVolumeChangeParam => Unit): Self = this.set("onVolumeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnVolumeChange: Self = this.set("onVolumeChange", js.undefined)
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    @scala.inline
    def setQuality(value: Default): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRatio(value: String): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setResetOnEnd(value: Boolean): Self = this.set("resetOnEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnEnd: Self = this.set("resetOnEnd", js.undefined)
    @scala.inline
    def setSeekTime(value: Double): Self = this.set("seekTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeekTime: Self = this.set("seekTime", js.undefined)
    @scala.inline
    def setSettingsVarargs(value: String*): Self = this.set("settings", js.Array(value :_*))
    @scala.inline
    def setSettings(value: js.Array[String]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: Size*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[Size]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setSpeed(value: Options): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStorage(value: Key): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToggleInvert(value: Boolean): Self = this.set("toggleInvert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleInvert: Self = this.set("toggleInvert", js.undefined)
    @scala.inline
    def setTooltips(value: Controls): Self = this.set("tooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltips: Self = this.set("tooltips", js.undefined)
    @scala.inline
    def setType(value: youtube | vimeo | video | audio): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

