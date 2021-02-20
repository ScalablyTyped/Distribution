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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  class default ()
    extends Component[YouTubeProps, js.Object, js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var height: js.UndefOr[String] = js.native
    
    var playerVars: js.UndefOr[PlayerVars] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPlayerVars(value: PlayerVars): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait PlayerVars extends StObject {
    
    var autoplay: js.UndefOr[`0` | `1`] = js.native
    
    var cc_load_policy: js.UndefOr[`1`] = js.native
    
    var color: js.UndefOr[red | white] = js.native
    
    var controls: js.UndefOr[`0` | `1` | `2`] = js.native
    
    var disablekb: js.UndefOr[`0` | `1`] = js.native
    
    var enablejsapi: js.UndefOr[`0` | `1`] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var fs: js.UndefOr[`0` | `1`] = js.native
    
    var hl: js.UndefOr[String] = js.native
    
    var iv_load_policy: js.UndefOr[`1` | `3`] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var listType: js.UndefOr[playlist | search | user_uploads] = js.native
    
    var loop: js.UndefOr[`0` | `1`] = js.native
    
    var modestbranding: js.UndefOr[`1`] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var playlist: js.UndefOr[String] = js.native
    
    var playsinline: js.UndefOr[`0` | `1`] = js.native
    
    var rel: js.UndefOr[`0` | `1`] = js.native
    
    var showinfo: js.UndefOr[`0` | `1`] = js.native
    
    var start: js.UndefOr[Double] = js.native
  }
  object PlayerVars {
    
    @scala.inline
    def apply(): PlayerVars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlayerVars]
    }
    
    @scala.inline
    implicit class PlayerVarsMutableBuilder[Self <: PlayerVars] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: `0` | `1`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setCc_load_policy(value: `1`): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
      
      @scala.inline
      def setColor(value: red | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setControls(value: `0` | `1` | `2`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setDisablekb(value: `0` | `1`): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
      
      @scala.inline
      def setEnablejsapi(value: `0` | `1`): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFs(value: `0` | `1`): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      @scala.inline
      def setIv_load_policy(value: `1` | `3`): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListType(value: playlist | search | user_uploads): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: `0` | `1`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setModestbranding(value: `1`): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      @scala.inline
      def setPlaysinline(value: `0` | `1`): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      @scala.inline
      def setRel(value: `0` | `1`): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setShowinfo(value: `0` | `1`): Self = StObject.set(x, "showinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowinfoUndefined: Self = StObject.set(x, "showinfo", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type YouTube = Component[YouTubeProps, js.Object, js.Any]
  
  @js.native
  trait YouTubeProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onEnd: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var onError: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var onPause: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var onPlay: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var onPlaybackQualityChange: js.UndefOr[js.Function1[/* event */ DataTarget, Unit]] = js.native
    
    var onPlaybackRateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var onReady: js.UndefOr[js.Function1[/* event */ Target, Unit]] = js.native
    
    var onStateChange: js.UndefOr[js.Function1[/* event */ Data, Unit]] = js.native
    
    var opts: js.UndefOr[Options] = js.native
    
    var videoId: js.UndefOr[String] = js.native
  }
  object YouTubeProps {
    
    @scala.inline
    def apply(): YouTubeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YouTubeProps]
    }
    
    @scala.inline
    implicit class YouTubePropsMutableBuilder[Self <: YouTubeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* event */ Data => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnError(value: /* event */ Data => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnPause(value: /* event */ Data => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: /* event */ Data => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaybackQualityChange(value: /* event */ DataTarget => Unit): Self = StObject.set(x, "onPlaybackQualityChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlaybackQualityChangeUndefined: Self = StObject.set(x, "onPlaybackQualityChange", js.undefined)
      
      @scala.inline
      def setOnPlaybackRateChange(value: /* event */ Data => Unit): Self = StObject.set(x, "onPlaybackRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlaybackRateChangeUndefined: Self = StObject.set(x, "onPlaybackRateChange", js.undefined)
      
      @scala.inline
      def setOnReady(value: /* event */ Target => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnStateChange(value: /* event */ Data => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      @scala.inline
      def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
      
      @scala.inline
      def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    }
  }
}
