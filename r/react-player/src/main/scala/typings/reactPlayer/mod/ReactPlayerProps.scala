package typings.reactPlayer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactPlayer.anon.Loaded
import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPlayerProps
  extends /* otherProps */ StringDictionary[js.Any] {
  var config: js.UndefOr[Config] = js.native
  var controls: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var light: js.UndefOr[Boolean | String] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var muted: js.UndefOr[Boolean] = js.native
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.native
  var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.native
  var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.native
  var onEnded: js.UndefOr[js.Function0[Unit]] = js.native
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Any, 
      /* data */ js.UndefOr[js.Any], 
      /* hlsInstance */ js.UndefOr[js.Any], 
      /* hlsGlobal */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onPause: js.UndefOr[js.Function0[Unit]] = js.native
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* state */ Loaded, Unit]] = js.native
  var onReady: js.UndefOr[js.Function1[/* player */ ReactPlayer, Unit]] = js.native
  var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  var pip: js.UndefOr[Boolean] = js.native
  var playbackRate: js.UndefOr[Double] = js.native
  var playing: js.UndefOr[Boolean] = js.native
  var playsinline: js.UndefOr[Boolean] = js.native
  var progressInterval: js.UndefOr[Double] = js.native
  var stopOnUnmount: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.native
  var volume: js.UndefOr[Double] = js.native
  var width: js.UndefOr[String | Double] = js.native
  var wrapper: js.UndefOr[js.Any] = js.native
}

object ReactPlayerProps {
  @scala.inline
  def apply(): ReactPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactPlayerProps]
  }
  @scala.inline
  implicit class ReactPlayerPropsOps[Self <: ReactPlayerProps] (val x: Self) extends AnyVal {
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
    def setConfig(value: Config): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLight(value: Boolean | String): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setOnBuffer(value: () => Unit): Self = this.set("onBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBuffer: Self = this.set("onBuffer", js.undefined)
    @scala.inline
    def setOnBufferEnd(value: () => Unit): Self = this.set("onBufferEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBufferEnd: Self = this.set("onBufferEnd", js.undefined)
    @scala.inline
    def setOnDisablePIP(value: () => Unit): Self = this.set("onDisablePIP", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDisablePIP: Self = this.set("onDisablePIP", js.undefined)
    @scala.inline
    def setOnDuration(value: /* duration */ Double => Unit): Self = this.set("onDuration", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDuration: Self = this.set("onDuration", js.undefined)
    @scala.inline
    def setOnEnablePIP(value: () => Unit): Self = this.set("onEnablePIP", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnablePIP: Self = this.set("onEnablePIP", js.undefined)
    @scala.inline
    def setOnEnded(value: () => Unit): Self = this.set("onEnded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    @scala.inline
    def setOnError(
      value: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onError", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnPause(value: () => Unit): Self = this.set("onPause", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPause: Self = this.set("onPause", js.undefined)
    @scala.inline
    def setOnPlay(value: () => Unit): Self = this.set("onPlay", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    @scala.inline
    def setOnProgress(value: /* state */ Loaded => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    @scala.inline
    def setOnReady(value: /* player */ ReactPlayer => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnSeek(value: /* seconds */ Double => Unit): Self = this.set("onSeek", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSeek: Self = this.set("onSeek", js.undefined)
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setPip(value: Boolean): Self = this.set("pip", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePip: Self = this.set("pip", js.undefined)
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackRate: Self = this.set("playbackRate", js.undefined)
    @scala.inline
    def setPlaying(value: Boolean): Self = this.set("playing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaying: Self = this.set("playing", js.undefined)
    @scala.inline
    def setPlaysinline(value: Boolean): Self = this.set("playsinline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaysinline: Self = this.set("playsinline", js.undefined)
    @scala.inline
    def setProgressInterval(value: Double): Self = this.set("progressInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressInterval: Self = this.set("progressInterval", js.undefined)
    @scala.inline
    def setStopOnUnmount(value: Boolean): Self = this.set("stopOnUnmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnUnmount: Self = this.set("stopOnUnmount", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUrlVarargs(value: (SourceProps | String)*): Self = this.set("url", js.Array(value :_*))
    @scala.inline
    def setUrl(value: String | (js.Array[SourceProps | String]) | MediaStream): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapper(value: js.Any): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

