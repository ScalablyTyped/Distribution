package typings.reactPlayer.lazyMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactPlayer.anon.Loaded
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactPlayerProps
  extends StObject
     with /* otherProps */ StringDictionary[js.Any] {
  
  var config: js.UndefOr[Config] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var light: js.UndefOr[Boolean | String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var onBuffer: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onBufferEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDisablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onDuration: js.UndefOr[js.Function1[/* duration */ Double, Unit]] = js.undefined
  
  var onEnablePIP: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onEnded: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onError: js.UndefOr[
    js.Function4[
      /* error */ js.Any, 
      /* data */ js.UndefOr[js.Any], 
      /* hlsInstance */ js.UndefOr[js.Any], 
      /* hlsGlobal */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* state */ Loaded, Unit]] = js.undefined
  
  var onReady: js.UndefOr[js.Function1[/* player */ ReactPlayer, Unit]] = js.undefined
  
  var onSeek: js.UndefOr[js.Function1[/* seconds */ Double, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var pip: js.UndefOr[Boolean] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
  
  var playing: js.UndefOr[Boolean] = js.undefined
  
  var playsinline: js.UndefOr[Boolean] = js.undefined
  
  var progressInterval: js.UndefOr[Double] = js.undefined
  
  var stopOnUnmount: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var url: js.UndefOr[String | (js.Array[SourceProps | String]) | MediaStream] = js.undefined
  
  var volume: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
  
  var wrapper: js.UndefOr[js.Any] = js.undefined
}
object ReactPlayerProps {
  
  inline def apply(): ReactPlayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactPlayerProps]
  }
  
  extension [Self <: ReactPlayerProps](x: Self) {
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLight(value: Boolean | String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOnBuffer(value: () => Unit): Self = StObject.set(x, "onBuffer", js.Any.fromFunction0(value))
    
    inline def setOnBufferEnd(value: () => Unit): Self = StObject.set(x, "onBufferEnd", js.Any.fromFunction0(value))
    
    inline def setOnBufferEndUndefined: Self = StObject.set(x, "onBufferEnd", js.undefined)
    
    inline def setOnBufferUndefined: Self = StObject.set(x, "onBuffer", js.undefined)
    
    inline def setOnDisablePIP(value: () => Unit): Self = StObject.set(x, "onDisablePIP", js.Any.fromFunction0(value))
    
    inline def setOnDisablePIPUndefined: Self = StObject.set(x, "onDisablePIP", js.undefined)
    
    inline def setOnDuration(value: /* duration */ Double => Unit): Self = StObject.set(x, "onDuration", js.Any.fromFunction1(value))
    
    inline def setOnDurationUndefined: Self = StObject.set(x, "onDuration", js.undefined)
    
    inline def setOnEnablePIP(value: () => Unit): Self = StObject.set(x, "onEnablePIP", js.Any.fromFunction0(value))
    
    inline def setOnEnablePIPUndefined: Self = StObject.set(x, "onEnablePIP", js.undefined)
    
    inline def setOnEnded(value: () => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction0(value))
    
    inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
    
    inline def setOnError(
      value: (/* error */ js.Any, /* data */ js.UndefOr[js.Any], /* hlsInstance */ js.UndefOr[js.Any], /* hlsGlobal */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
    
    inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
    
    inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnProgress(value: /* state */ Loaded => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setOnReady(value: /* player */ ReactPlayer => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnSeek(value: /* seconds */ Double => Unit): Self = StObject.set(x, "onSeek", js.Any.fromFunction1(value))
    
    inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
    
    inline def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setPip(value: Boolean): Self = StObject.set(x, "pip", value.asInstanceOf[js.Any])
    
    inline def setPipUndefined: Self = StObject.set(x, "pip", js.undefined)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    inline def setPlaying(value: Boolean): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
    
    inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    inline def setProgressInterval(value: Double): Self = StObject.set(x, "progressInterval", value.asInstanceOf[js.Any])
    
    inline def setProgressIntervalUndefined: Self = StObject.set(x, "progressInterval", js.undefined)
    
    inline def setStopOnUnmount(value: Boolean): Self = StObject.set(x, "stopOnUnmount", value.asInstanceOf[js.Any])
    
    inline def setStopOnUnmountUndefined: Self = StObject.set(x, "stopOnUnmount", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUrl(value: String | (js.Array[SourceProps | String]) | MediaStream): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: (SourceProps | String)*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWrapper(value: js.Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
