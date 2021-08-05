package typings.reactYoutube

import typings.react.mod.Component
import typings.reactYoutube.anon.Data
import typings.reactYoutube.anon.DataTarget
import typings.reactYoutube.anon.Target
import typings.reactYoutube.reactYoutubeNumbers.`0`
import typings.reactYoutube.reactYoutubeNumbers.`1`
import typings.reactYoutube.reactYoutubeNumbers.`2`
import typings.reactYoutube.reactYoutubeNumbers.`3`
import typings.reactYoutube.reactYoutubeStrings.playlist
import typings.reactYoutube.reactYoutubeStrings.red
import typings.reactYoutube.reactYoutubeStrings.search
import typings.reactYoutube.reactYoutubeStrings.user_uploads
import typings.reactYoutube.reactYoutubeStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  class default ()
    extends Component[YouTubeProps, js.Object, js.Any]
  
  trait Options extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var playerVars: js.UndefOr[PlayerVars] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPlayerVars(value: PlayerVars): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      inline def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PlayerVars extends StObject {
    
    var autoplay: js.UndefOr[`0` | `1`] = js.undefined
    
    var cc_load_policy: js.UndefOr[`1`] = js.undefined
    
    var color: js.UndefOr[red | white] = js.undefined
    
    var controls: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    var disablekb: js.UndefOr[`0` | `1`] = js.undefined
    
    var enablejsapi: js.UndefOr[`0` | `1`] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var fs: js.UndefOr[`0` | `1`] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var iv_load_policy: js.UndefOr[`1` | `3`] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var listType: js.UndefOr[playlist | search | user_uploads] = js.undefined
    
    var loop: js.UndefOr[`0` | `1`] = js.undefined
    
    var modestbranding: js.UndefOr[`1`] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var playlist: js.UndefOr[String] = js.undefined
    
    var playsinline: js.UndefOr[`0` | `1`] = js.undefined
    
    var rel: js.UndefOr[`0` | `1`] = js.undefined
    
    var showinfo: js.UndefOr[`0` | `1`] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object PlayerVars {
    
    inline def apply(): PlayerVars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerVars]
    }
    
    extension [Self <: PlayerVars](x: Self) {
      
      inline def setAutoplay(value: `0` | `1`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCc_load_policy(value: `1`): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
      
      inline def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
      
      inline def setColor(value: red | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setControls(value: `0` | `1` | `2`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDisablekb(value: `0` | `1`): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
      
      inline def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
      
      inline def setEnablejsapi(value: `0` | `1`): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
      
      inline def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFs(value: `0` | `1`): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setIv_load_policy(value: `1` | `3`): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
      
      inline def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListType(value: playlist | search | user_uploads): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: `0` | `1`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setModestbranding(value: `1`): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
      
      inline def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      inline def setPlaysinline(value: `0` | `1`): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setRel(value: `0` | `1`): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setShowinfo(value: `0` | `1`): Self = StObject.set(x, "showinfo", value.asInstanceOf[js.Any])
      
      inline def setShowinfoUndefined: Self = StObject.set(x, "showinfo", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type YouTube = Component[YouTubeProps, js.Object, js.Any]
  
  trait YouTubeProps extends StObject {
    
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
    
    inline def apply(): YouTubeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YouTubeProps]
    }
    
    extension [Self <: YouTubeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnEnd(value: /* event */ Data => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnError(value: /* event */ Data => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnPause(value: /* event */ Data => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: /* event */ Data => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnPlaybackQualityChange(value: /* event */ DataTarget => Unit): Self = StObject.set(x, "onPlaybackQualityChange", js.Any.fromFunction1(value))
      
      inline def setOnPlaybackQualityChangeUndefined: Self = StObject.set(x, "onPlaybackQualityChange", js.undefined)
      
      inline def setOnPlaybackRateChange(value: /* event */ Data => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
      
      inline def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
      
      inline def setOnReady(value: /* event */ Target => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnStateChange(value: /* event */ Data => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    }
  }
}
