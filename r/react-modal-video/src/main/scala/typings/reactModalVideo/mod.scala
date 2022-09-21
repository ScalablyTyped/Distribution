package typings.reactModalVideo

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactModalVideo.anon.DismissBtnMessage
import typings.reactModalVideo.reactModalVideoBooleans.`false`
import typings.reactModalVideo.reactModalVideoBooleans.`true`
import typings.reactModalVideo.reactModalVideoNumbers.`0`
import typings.reactModalVideo.reactModalVideoNumbers.`1`
import typings.reactModalVideo.reactModalVideoNumbers.`300`
import typings.reactModalVideo.reactModalVideoStrings.DollarLeftcurlybracketnumberRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
import typings.reactModalVideo.reactModalVideoStrings.DollarLeftcurlybracketstringRightcurlybracketCommaDollarLeftcurlybracketstringRightcurlybracket
import typings.reactModalVideo.reactModalVideoStrings.`16Colon9`
import typings.reactModalVideo.reactModalVideoStrings.`red Verticalline white`
import typings.reactModalVideo.reactModalVideoStrings.custom
import typings.reactModalVideo.reactModalVideoStrings.playlist
import typings.reactModalVideo.reactModalVideoStrings.user_uploads
import typings.reactModalVideo.reactModalVideoStrings.vimeo
import typings.reactModalVideo.reactModalVideoStrings.youku
import typings.reactModalVideo.reactModalVideoStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-modal-video", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ModalVideoProps, js.Object, Any]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-modal-video", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-modal-video", "default.defaultProps.allowFullScreen")
      @js.native
      def allowFullScreen: `true` = js.native
      inline def allowFullScreen_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowFullScreen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.animationSpeed")
      @js.native
      def animationSpeed: `300` = js.native
      inline def animationSpeed_=(x: `300`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationSpeed")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.aria")
      @js.native
      def aria: DismissBtnMessage = js.native
      inline def aria_=(x: DismissBtnMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.channel")
      @js.native
      def channel: youtube = js.native
      inline def channel_=(x: youtube): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channel")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.classNames")
      @js.native
      def classNames: typings.reactModalVideo.anon.ModalVideo = js.native
      inline def classNames_=(x: typings.reactModalVideo.anon.ModalVideo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.isOpen")
      @js.native
      def isOpen: `false` = js.native
      inline def isOpen_=(x: `false`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-modal-video", "default.defaultProps.ratio")
      @js.native
      def ratio: `16Colon9` = js.native
      inline def ratio_=(x: `16Colon9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratio")(x.asInstanceOf[js.Any])
    }
  }
  
  trait Aria extends StObject {
    
    var dismissBtnMessage: String
    
    var openMessage: String
  }
  object Aria {
    
    inline def apply(dismissBtnMessage: String, openMessage: String): Aria = {
      val __obj = js.Dynamic.literal(dismissBtnMessage = dismissBtnMessage.asInstanceOf[js.Any], openMessage = openMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aria]
    }
    
    extension [Self <: Aria](x: Self) {
      
      inline def setDismissBtnMessage(value: String): Self = StObject.set(x, "dismissBtnMessage", value.asInstanceOf[js.Any])
      
      inline def setOpenMessage(value: String): Self = StObject.set(x, "openMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClassNames extends StObject {
    
    var modalVideo: String
    
    var modalVideoBody: String
    
    var modalVideoClose: String
    
    var modalVideoCloseBtn: String
    
    var modalVideoEffect: String
    
    var modalVideoIframeWrap: String
    
    var modalVideoInner: String
  }
  object ClassNames {
    
    inline def apply(
      modalVideo: String,
      modalVideoBody: String,
      modalVideoClose: String,
      modalVideoCloseBtn: String,
      modalVideoEffect: String,
      modalVideoIframeWrap: String,
      modalVideoInner: String
    ): ClassNames = {
      val __obj = js.Dynamic.literal(modalVideo = modalVideo.asInstanceOf[js.Any], modalVideoBody = modalVideoBody.asInstanceOf[js.Any], modalVideoClose = modalVideoClose.asInstanceOf[js.Any], modalVideoCloseBtn = modalVideoCloseBtn.asInstanceOf[js.Any], modalVideoEffect = modalVideoEffect.asInstanceOf[js.Any], modalVideoIframeWrap = modalVideoIframeWrap.asInstanceOf[js.Any], modalVideoInner = modalVideoInner.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassNames]
    }
    
    extension [Self <: ClassNames](x: Self) {
      
      inline def setModalVideo(value: String): Self = StObject.set(x, "modalVideo", value.asInstanceOf[js.Any])
      
      inline def setModalVideoBody(value: String): Self = StObject.set(x, "modalVideoBody", value.asInstanceOf[js.Any])
      
      inline def setModalVideoClose(value: String): Self = StObject.set(x, "modalVideoClose", value.asInstanceOf[js.Any])
      
      inline def setModalVideoCloseBtn(value: String): Self = StObject.set(x, "modalVideoCloseBtn", value.asInstanceOf[js.Any])
      
      inline def setModalVideoEffect(value: String): Self = StObject.set(x, "modalVideoEffect", value.asInstanceOf[js.Any])
      
      inline def setModalVideoIframeWrap(value: String): Self = StObject.set(x, "modalVideoIframeWrap", value.asInstanceOf[js.Any])
      
      inline def setModalVideoInner(value: String): Self = StObject.set(x, "modalVideoInner", value.asInstanceOf[js.Any])
    }
  }
  
  trait Custom extends StObject {
    
    var channel: custom
    
    var url: String
  }
  object Custom {
    
    inline def apply(url: String): Custom = {
      val __obj = js.Dynamic.literal(channel = "custom", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Custom]
    }
    
    extension [Self <: Custom](x: Self) {
      
      inline def setChannel(value: custom): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ModalVideo = Component[ModalVideoProps, js.Object, Any]
  
  trait ModalVideoBaseProps extends StObject {
    
    /**
      * @default true
      */
    var allowFullScreen: Boolean
    
    /**
      * @default 300
      */
    var animationSpeed: Double
    
    /**
      * @default
      * {
      *      openMessage: 'You just opened the modal video';
      *      dismissBtnMessage: 'Close the modal by clicking here';
      *  }
      */
    var aria: Aria
    
    /**
      * @default
      *  {
      *       modalVideo: 'modal-video',
      *       modalVideoClose: 'modal-video-close',
      *       modalVideoBody: 'modal-video-body',
      *       modalVideoInner: 'modal-video-inner',
      *       modalVideoIframeWrap: 'modal-video-movie-wrap',
      *       modalVideoCloseBtn: 'modal-video-close-btn'
      *   }
      */
    var classNames: ClassNames
    
    /**
      * @default false
      */
    var isOpen: Boolean
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * @default '16:9'
      */
    var ratio: DollarLeftcurlybracketnumberRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
  }
  object ModalVideoBaseProps {
    
    inline def apply(
      allowFullScreen: Boolean,
      animationSpeed: Double,
      aria: Aria,
      classNames: ClassNames,
      isOpen: Boolean
    ): ModalVideoBaseProps = {
      val __obj = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], animationSpeed = animationSpeed.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], ratio = "${number}:${number}")
      __obj.asInstanceOf[ModalVideoBaseProps]
    }
    
    extension [Self <: ModalVideoBaseProps](x: Self) {
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAnimationSpeed(value: Double): Self = StObject.set(x, "animationSpeed", value.asInstanceOf[js.Any])
      
      inline def setAria(value: Aria): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setRatio(
        value: DollarLeftcurlybracketnumberRightcurlybracketColonDollarLeftcurlybracketnumberRightcurlybracket
      ): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
  
  type ModalVideoProps = (Youtube & ModalVideoBaseProps) | (Vimeo & ModalVideoBaseProps) | (Youku & ModalVideoBaseProps) | (Custom & ModalVideoBaseProps)
  
  trait Vendor extends StObject {
    
    /**
      * @default "youtube"
      */
    var channel: String
    
    var videoId: String
  }
  object Vendor {
    
    inline def apply(channel: String, videoId: String): Vendor = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vendor]
    }
    
    extension [Self <: Vendor](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Vimeo
    extends StObject
       with Vendor {
    
    @JSName("channel")
    var channel_Vimeo: vimeo
    
    /**
      * @link https://developer.vimeo.com/api/oembed/videos
      */
    var vimeo: js.UndefOr[VimeoApi] = js.undefined
  }
  object Vimeo {
    
    inline def apply(videoId: String): Vimeo = {
      val __obj = js.Dynamic.literal(channel = "vimeo", videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vimeo]
    }
    
    extension [Self <: Vimeo](x: Self) {
      
      inline def setChannel(value: vimeo): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setVimeo(value: VimeoApi): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
      
      inline def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
    }
  }
  
  trait VimeoApi
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var api: js.UndefOr[Boolean] = js.undefined
    
    var autopause: js.UndefOr[Boolean] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var byline: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var maxheight: js.UndefOr[Double] = js.undefined
    
    var maxwidth: js.UndefOr[Double] = js.undefined
    
    var player_id: js.UndefOr[String] = js.undefined
    
    var portrait: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Boolean] = js.undefined
    
    var xhtml: js.UndefOr[`true`] = js.undefined
  }
  object VimeoApi {
    
    inline def apply(): VimeoApi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VimeoApi]
    }
    
    extension [Self <: VimeoApi](x: Self) {
      
      inline def setApi(value: Boolean): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setAutopause(value: Boolean): Self = StObject.set(x, "autopause", value.asInstanceOf[js.Any])
      
      inline def setAutopauseUndefined: Self = StObject.set(x, "autopause", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setByline(value: Boolean): Self = StObject.set(x, "byline", value.asInstanceOf[js.Any])
      
      inline def setBylineUndefined: Self = StObject.set(x, "byline", js.undefined)
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMaxheight(value: Double): Self = StObject.set(x, "maxheight", value.asInstanceOf[js.Any])
      
      inline def setMaxheightUndefined: Self = StObject.set(x, "maxheight", js.undefined)
      
      inline def setMaxwidth(value: Double): Self = StObject.set(x, "maxwidth", value.asInstanceOf[js.Any])
      
      inline def setMaxwidthUndefined: Self = StObject.set(x, "maxwidth", js.undefined)
      
      inline def setPlayer_id(value: String): Self = StObject.set(x, "player_id", value.asInstanceOf[js.Any])
      
      inline def setPlayer_idUndefined: Self = StObject.set(x, "player_id", js.undefined)
      
      inline def setPortrait(value: Boolean): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
      
      inline def setPortraitUndefined: Self = StObject.set(x, "portrait", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXhtml(value: `true`): Self = StObject.set(x, "xhtml", value.asInstanceOf[js.Any])
      
      inline def setXhtmlUndefined: Self = StObject.set(x, "xhtml", js.undefined)
    }
  }
  
  trait Youku
    extends StObject
       with Vendor {
    
    @JSName("channel")
    var channel_Youku: youku
    
    var youku: js.UndefOr[YoukuApi] = js.undefined
  }
  object Youku {
    
    inline def apply(videoId: String): Youku = {
      val __obj = js.Dynamic.literal(channel = "youku", videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Youku]
    }
    
    extension [Self <: Youku](x: Self) {
      
      inline def setChannel(value: youku): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setYouku(value: YoukuApi): Self = StObject.set(x, "youku", value.asInstanceOf[js.Any])
      
      inline def setYoukuUndefined: Self = StObject.set(x, "youku", js.undefined)
    }
  }
  
  trait YoukuApi
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var autoplay: js.UndefOr[`1` | `0`] = js.undefined
    
    var show_related: js.UndefOr[`1` | `0`] = js.undefined
  }
  object YoukuApi {
    
    inline def apply(): YoukuApi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoukuApi]
    }
    
    extension [Self <: YoukuApi](x: Self) {
      
      inline def setAutoplay(value: `1` | `0`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setShow_related(value: `1` | `0`): Self = StObject.set(x, "show_related", value.asInstanceOf[js.Any])
      
      inline def setShow_relatedUndefined: Self = StObject.set(x, "show_related", js.undefined)
    }
  }
  
  trait Youtube
    extends StObject
       with Vendor {
    
    @JSName("channel")
    var channel_Youtube: youtube
    
    /**
      * @link https://developers.google.com/youtube/player_parameters
      */
    var youtube: js.UndefOr[YoutubeApi] = js.undefined
  }
  object Youtube {
    
    inline def apply(videoId: String): Youtube = {
      val __obj = js.Dynamic.literal(channel = "youtube", videoId = videoId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Youtube]
    }
    
    extension [Self <: Youtube](x: Self) {
      
      inline def setChannel(value: youtube): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setYoutube(value: YoutubeApi): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
      
      inline def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
    }
  }
  
  trait YoutubeApi
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var autoplay: js.UndefOr[`0` | `1`] = js.undefined
    
    var cc_load_policy: js.UndefOr[`0` | `1`] = js.undefined
    
    var color: js.UndefOr[`red Verticalline white`] = js.undefined
    
    var controls: js.UndefOr[`0` | `1`] = js.undefined
    
    var disablekb: js.UndefOr[`0` | `1`] = js.undefined
    
    var enablejsapi: js.UndefOr[`0` | `1`] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var fs: js.UndefOr[`0` | `1`] = js.undefined
    
    var h1: js.UndefOr[String] = js.undefined
    
    var iv_load_policy: js.UndefOr[`0` | `1`] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var listType: js.UndefOr[playlist | user_uploads] = js.undefined
    
    var loop: js.UndefOr[`0` | `1`] = js.undefined
    
    var modestbranding: js.UndefOr[`0` | `1`] = js.undefined
    
    var mute: js.UndefOr[`0` | `1`] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var playlist: js.UndefOr[
        DollarLeftcurlybracketstringRightcurlybracketCommaDollarLeftcurlybracketstringRightcurlybracket
      ] = js.undefined
    
    var playsinline: js.UndefOr[`0` | `1`] = js.undefined
    
    var rel: js.UndefOr[`0` | `1`] = js.undefined
    
    var showinfo: js.UndefOr[`0` | `1`] = js.undefined
    
    var start: js.UndefOr[`0` | `1`] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var wmode: js.UndefOr[String] = js.undefined
  }
  object YoutubeApi {
    
    inline def apply(): YoutubeApi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeApi]
    }
    
    extension [Self <: YoutubeApi](x: Self) {
      
      inline def setAutoplay(value: `0` | `1`): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setCc_load_policy(value: `0` | `1`): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
      
      inline def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
      
      inline def setColor(value: `red Verticalline white`): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setControls(value: `0` | `1`): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setDisablekb(value: `0` | `1`): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
      
      inline def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
      
      inline def setEnablejsapi(value: `0` | `1`): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
      
      inline def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFs(value: `0` | `1`): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setH1(value: String): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      inline def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      inline def setIv_load_policy(value: `0` | `1`): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
      
      inline def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListType(value: playlist | user_uploads): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: `0` | `1`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setModestbranding(value: `0` | `1`): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
      
      inline def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
      
      inline def setMute(value: `0` | `1`): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPlaylist(
        value: DollarLeftcurlybracketstringRightcurlybracketCommaDollarLeftcurlybracketstringRightcurlybracket
      ): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
      
      inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
      
      inline def setPlaysinline(value: `0` | `1`): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
      
      inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
      
      inline def setRel(value: `0` | `1`): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setShowinfo(value: `0` | `1`): Self = StObject.set(x, "showinfo", value.asInstanceOf[js.Any])
      
      inline def setShowinfoUndefined: Self = StObject.set(x, "showinfo", js.undefined)
      
      inline def setStart(value: `0` | `1`): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    }
  }
}
