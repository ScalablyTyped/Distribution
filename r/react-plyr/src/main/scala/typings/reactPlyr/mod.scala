package typings.reactPlyr

import typings.react.mod.Component
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-plyr", JSImport.Default)
  @js.native
  open class default () extends Plyr
  
  trait OnVolumeChangeParam extends StObject {
    
    var muted: Boolean
    
    var volume: Double
  }
  object OnVolumeChangeParam {
    
    inline def apply(muted: Boolean, volume: Double): OnVolumeChangeParam = {
      val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnVolumeChangeParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnVolumeChangeParam] (val x: Self) extends AnyVal {
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Plyr
    extends Component[Props, js.Object, Any] {
    
    def decreaseVolume(step: Boolean): Unit = js.native
    
    def enterFullscreen(): Unit = js.native
    
    def exitFullscreen(): Unit = js.native
    
    def forward(time: Double): Unit = js.native
    
    def getCurrentTime(): Double = js.native
    
    def getDuration(): Double = js.native
    
    def getType(): Any = js.native
    
    def getVolume(): Double = js.native
    
    def increaseVolume(step: Boolean): Unit = js.native
    
    def isMuted(): Boolean = js.native
    
    def isPaused(): Boolean = js.native
    
    def pause(): Unit = js.native
    
    def play(): Unit = js.native
    
    def restart(): Unit = js.native
    
    def rewind(time: Double): Unit = js.native
    
    def setCurrentTime(time: Double): Unit = js.native
    
    def setMuted(): Unit = js.native
    def setMuted(muted: Boolean): Unit = js.native
    
    def setVolume(amount: Boolean): Unit = js.native
    
    def stop(): Unit = js.native
    
    def toggleFullscreen(): Unit = js.native
    
    def toggleMute(): Unit = js.native
    
    def togglePlay(): Unit = js.native
  }
  
  trait Props extends StObject {
    
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
    
    var onReady: js.UndefOr[js.Function1[/* player */ js.UndefOr[Any], Unit]] = js.undefined
    
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
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAutopause(value: Boolean): Self = StObject.set(x, "autopause", value.asInstanceOf[js.Any])
      
      inline def setAutopauseUndefined: Self = StObject.set(x, "autopause", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBlankVideo(value: String): Self = StObject.set(x, "blankVideo", value.asInstanceOf[js.Any])
      
      inline def setBlankVideoUndefined: Self = StObject.set(x, "blankVideo", js.undefined)
      
      inline def setCaptions(value: js.Array[Kind]): Self = StObject.set(x, "captions", value.asInstanceOf[js.Any])
      
      inline def setCaptionsUndefined: Self = StObject.set(x, "captions", js.undefined)
      
      inline def setCaptionsVarargs(value: Kind*): Self = StObject.set(x, "captions", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClickToPlay(value: Boolean): Self = StObject.set(x, "clickToPlay", value.asInstanceOf[js.Any])
      
      inline def setClickToPlayUndefined: Self = StObject.set(x, "clickToPlay", js.undefined)
      
      inline def setControls(value: js.Array[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: String*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisableContextMenu(value: Boolean): Self = StObject.set(x, "disableContextMenu", value.asInstanceOf[js.Any])
      
      inline def setDisableContextMenuUndefined: Self = StObject.set(x, "disableContextMenu", js.undefined)
      
      inline def setDisplayDuration(value: Boolean): Self = StObject.set(x, "displayDuration", value.asInstanceOf[js.Any])
      
      inline def setDisplayDurationUndefined: Self = StObject.set(x, "displayDuration", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFullscreen(value: Enabled): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHideControls(value: Boolean): Self = StObject.set(x, "hideControls", value.asInstanceOf[js.Any])
      
      inline def setHideControlsUndefined: Self = StObject.set(x, "hideControls", js.undefined)
      
      inline def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      inline def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setInvertTime(value: Boolean): Self = StObject.set(x, "invertTime", value.asInstanceOf[js.Any])
      
      inline def setInvertTimeUndefined: Self = StObject.set(x, "invertTime", js.undefined)
      
      inline def setKeyboard(value: Focused): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLoadSprite(value: Boolean): Self = StObject.set(x, "loadSprite", value.asInstanceOf[js.Any])
      
      inline def setLoadSpriteUndefined: Self = StObject.set(x, "loadSprite", js.undefined)
      
      inline def setLoop(value: Active): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setOnCaptionsDisabled(value: () => Unit): Self = StObject.set(x, "onCaptionsDisabled", js.Any.fromFunction0(value))
      
      inline def setOnCaptionsDisabledUndefined: Self = StObject.set(x, "onCaptionsDisabled", js.undefined)
      
      inline def setOnCaptionsEnabled(value: () => Unit): Self = StObject.set(x, "onCaptionsEnabled", js.Any.fromFunction0(value))
      
      inline def setOnCaptionsEnabledUndefined: Self = StObject.set(x, "onCaptionsEnabled", js.undefined)
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnEnterFullscreen(value: () => Unit): Self = StObject.set(x, "onEnterFullscreen", js.Any.fromFunction0(value))
      
      inline def setOnEnterFullscreenUndefined: Self = StObject.set(x, "onEnterFullscreen", js.undefined)
      
      inline def setOnExitFullscreen(value: () => Unit): Self = StObject.set(x, "onExitFullscreen", js.Any.fromFunction0(value))
      
      inline def setOnExitFullscreenUndefined: Self = StObject.set(x, "onExitFullscreen", js.undefined)
      
      inline def setOnLoadedData(value: () => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction0(value))
      
      inline def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnReady(value: /* player */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnSeeked(value: /* time */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      inline def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      inline def setOnTimeUpdate(value: /* time */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      inline def setOnVolumeChange(value: /* params */ OnVolumeChangeParam => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      inline def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setQuality(value: Default): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRatio(value: String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setResetOnEnd(value: Boolean): Self = StObject.set(x, "resetOnEnd", value.asInstanceOf[js.Any])
      
      inline def setResetOnEndUndefined: Self = StObject.set(x, "resetOnEnd", js.undefined)
      
      inline def setSeekTime(value: Double): Self = StObject.set(x, "seekTime", value.asInstanceOf[js.Any])
      
      inline def setSeekTimeUndefined: Self = StObject.set(x, "seekTime", js.undefined)
      
      inline def setSettings(value: js.Array[String]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSettingsVarargs(value: String*): Self = StObject.set(x, "settings", js.Array(value*))
      
      inline def setSources(value: js.Array[Size]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
      
      inline def setSourcesVarargs(value: Size*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setSpeed(value: Options): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStorage(value: Key): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleInvert(value: Boolean): Self = StObject.set(x, "toggleInvert", value.asInstanceOf[js.Any])
      
      inline def setToggleInvertUndefined: Self = StObject.set(x, "toggleInvert", js.undefined)
      
      inline def setTooltips(value: Controls): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      inline def setType(value: youtube | vimeo | video | audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
