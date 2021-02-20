package typings.reactSwf

import typings.react.mod.Component
import typings.reactSwf.mod.rswf.ReactSWF
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object mod {
  
  /* was `typeof rswf.ReactSWF` */
  @JSImport("react-swf", JSImport.Namespace)
  @js.native
  class ^ () extends ReactSWF
  
  /**
    * Returns installed Flash Player version. Result is cached.
    * Must not be called in a non-browser environment.
    * @return {?string} 'X.Y.Z'-version or null.
    */
  @JSImport("react-swf", "getFPVersion")
  @js.native
  def getFPVersion(): String = js.native
  
  /**
    * Returns if installed Flash Player meets version requirement.
    * Must not be called in a non-browser environment.
    * @return {boolean} true if supported
    */
  @JSImport("react-swf", "isFPVersionSupported")
  @js.native
  def isFPVersionSupported(versionString: String): Boolean = js.native
  
  object rswf {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * (attribute for Object) - Possible values: l, t, r.
        * Default centers the movie in the browser window and crops edges if the browser window is smaller than the movie.
        * l (left), r (right), and t (top) align the movie along the corresponding edge of the browser window and crop the remaining three sides as needed.
        */
      var align: js.UndefOr[String] = js.native
      
      /**
        * Setting this value to true allows the SWF file to enter full screen mode via ActionScript. For more information, see Exploring full screen mode in Flash Player. If this attribute is omitted, the default value is false.
        */
      var allowFullScreen: js.UndefOr[Boolean] = js.native
      
      /**
        * [base directory] or [URL]. Specifies the base directory or URL used to resolve all relative path statements in the SWF file. This attribute is helpful when your SWF file is kept in a different directory from your other files.
        */
      var base: js.UndefOr[String] = js.native
      
      /**
        * [hexadecimal RGB value] in the format #RRGGBB. Specifies the background color of the SWF content. Use this attribute to override the background color (Stage color) setting specified in the SWF file. (This attribute does not affect the background color of the HTML page.)
        */
      var bgcolor: js.UndefOr[String] = js.native
      
      /**
        * Variables, defined as a string of key=value pairs, that are passed to the SWF file.
        * Use flashvars to specify root-level variables in the SWF file. The format of the string is a set of key=value combinations separated by the '&' character.
        * Browsers support string sizes of up to 64 KB (65535 bytes) in length.
        * For more information on using flashvars, see Using FlashVars to pass variables to a SWF (tn_16417).
        */
      var flashVars: js.UndefOr[js.Object | String] = js.native
      
      /**
        *  Possible values: portrait or landscape. Used to control how full screen SWF content appears on mobile devices that support automatic screen rotation, such as phones and tablets. If this attribute is specified, Flash Player uses the specified screen orientation (portrait or landscape) when the SWF is viewed in full screen mode. It doesn't matter how the device is oriented. If this attribute is not specified, orientation of content in full screen mode follows the screen orientation used by the browser.
        */
      var fullScreenAspectRatio: js.UndefOr[String] = js.native
      
      /**
        * Specifies the height of the SWF content in either pixels or percentage of browser window.
        */
      var height: js.UndefOr[Double] = js.native
      
      /**
        * (attribute for OBJECT tag) and name (attribute for EMBED tag) - SWF file identifier. Identifies the SWF file to the web browser, allowing browser scripting languages (for example, JavaScript) to reference the SWF content. For cross-browser compatibility, make sure that the id and name are set to the same value.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * Specifies whether a timeline-based SWF file repeats indefinitely or stops when it reaches the last frame. If this attribute is omitted, the default value is true.
        */
      var loop: js.UndefOr[Boolean] = js.native
      
      /**
        * Specifies if movie playback controls are available in the Flash Player context menu.
        * true displays a full menu that provides expanded movie playback controls (for example, Zoom, Quality, Play, Loop, Rewind, Forward, Back).
        * false displays a menu that hides movie playback controls (for example, Zoom, Quality, Play, Loop, Rewind, Forward, Back). This attribute is useful for SWF content that does not rely on the Timeline, such as content controlled entirely by ActionScript. The short menu includes "Settings" and "About Flash Player" menu items.
        */
      var menu: js.UndefOr[Boolean] = js.native
      
      /**
        * Specifies whether a timeline-based SWF file begins playing immediately on loading in the browser. If this attribute is omitted, the default value is true.
        */
      var play: js.UndefOr[Boolean] = js.native
      
      /**
        *  Identifies the location of the Flash Player plug-in so that the user can download it if it is not already installed.
        */
      var pluginspage: js.UndefOr[String] = js.native
      
      /**
        * Possible values: low, autolow, autohigh, medium, high, best. Specifies the display list Stage rendering quality. Setting the Stage.quality property via ActionScript overrides this value.
        * low favors playback speed over appearance and never uses anti-aliasing.
        * autolow emphasizes speed at first but improves appearance whenever possible. Playback begins with anti-aliasing turned off. If Flash Player detects that the processor can handle it, anti-aliasing is turned on.
        * autohigh emphasizes playback speed and appearance equally at first but sacrifices appearance for playback speed if necessary. Playback begins with anti-aliasing turned on. If the actual frame rate drops below the specified frame rate, anti-aliasing is turned off to improve playback speed. Use this setting to emulate the View > Antialias setting in Flash Professional.
        * medium applies some anti-aliasing and does not smooth bitmaps. It produces a better quality than the Low setting, but lower quality than the High setting.
        * high favors appearance over playback speed and always applies anti-aliasing. If the movie does not contain animation, bitmaps are smoothed; if the movie has animation, bitmaps are not smoothed.
        * best provides the best display quality and does not consider playback speed. All output is anti-aliased and all bitmaps are smoothed.
        */
      var quality: js.UndefOr[String] = js.native
      
      /**
        * Possible values: l, t, r, tl, tr.
        * l, r, and t align the movie along the left, right, or top edge of the browser window and crop the remaining sides as needed.
        * tl and tr align the movie to the upper-left and top upper-corner of the browser window and crop the bottom and remaining side as necessary.
        */
      var salign: js.UndefOr[String] = js.native
      
      /**
        *  Possible values: showall, noborder, exactfit, noscale. Specifies how Flash Player scales SWF content to fit the pixel area specified by the OBJECT or EMBED tag.
        *  default (Show all) makes the entire SWF file visible in the specified area without distortion, while maintaining the original aspect ratio of the movie. Borders can appear on two sides of the movie.
        *  noborder scales the SWF file to fill the specified area, while maintaining the original aspect ratio of the file. Flash Player can crop the content, but no distortion occurs.
        *  exactfit makes the entire SWF file visible in the specified area without trying to preserve the original aspect ratio. Distortion can occur.
        *  noscale prevents the SWF file from scaling to fit the area of the OBJECT or EMBED tag. Cropping can occur.
        */
      var scale: js.UndefOr[String] = js.native
      
      /**
        * Specifies the source location (URL) of the SWF file to load.
        */
      var src: String = js.native
      
      /**
        * Specifies the width of the SWF content in either pixels or percentage of browser window.
        */
      var width: js.UndefOr[Double] = js.native
      
      /**
        * Possible values: window, direct, opaque, transparent, gpu. Sets the Window Mode property of the SWF file for transparency, layering, positioning, and rendering in the browser. If this attribute is omitted, the default value is "window". For more information, see Using Window Mode (wmode) values below.
        * window - The SWF content plays in its own rectangle ("window") on a web page. The browser determines how the SWF content is layered against other HTML elements. With this value, you cannot explicitly specify if SWF content appears above or below other HTML elements on the page.
        * direct - Use direct to path rendering. This attribute bypasses compositing in the screen buffer and renders the SWF content directly to the screen. This wmode value is recommended to provide the best performance for content playback. It enables hardware accelerated presentation of SWF content that uses Stage Video or Stage 3D.
        * opaque - The SWF content is layered together with other HTML elements on the page. The SWF file is opaque and hides everything layered behind it on the page. This option reduces playback performance compared to wmode=window or wmode=direct.
        * transparent - The SWF content is layered together with other HTML elements on the page. The SWF file background color (Stage color) is transparent. HTML elements beneath the SWF file are visible through any transparent areas of the SWF, with alpha blending. This option reduces playback performance compared to wmode=window or wmode=direct.
        * gpu - Use additional hardware acceleration on some Internet-connected TVs and mobile devices. In contrast to other wmode values, pixel fidelity for display list graphics is not guaranteed. Otherwise, this value is similar to wmode=direct.
        */
      var wmode: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(src: String): Props = {
        val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
        
        @scala.inline
        def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        @scala.inline
        def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
        
        @scala.inline
        def setFlashVars(value: js.Object | String): Self = StObject.set(x, "flashVars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlashVarsUndefined: Self = StObject.set(x, "flashVars", js.undefined)
        
        @scala.inline
        def setFullScreenAspectRatio(value: String): Self = StObject.set(x, "fullScreenAspectRatio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullScreenAspectRatioUndefined: Self = StObject.set(x, "fullScreenAspectRatio", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
        
        @scala.inline
        def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
        
        @scala.inline
        def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
        
        @scala.inline
        def setPluginspage(value: String): Self = StObject.set(x, "pluginspage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluginspageUndefined: Self = StObject.set(x, "pluginspage", js.undefined)
        
        @scala.inline
        def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
        
        @scala.inline
        def setSalign(value: String): Self = StObject.set(x, "salign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSalignUndefined: Self = StObject.set(x, "salign", js.undefined)
        
        @scala.inline
        def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      }
    }
    
    @js.native
    trait ReactSWF
      extends Component[Props, State, js.Any] {
      
      /**
        * Returns the Flash Player object DOM node.
        * Should be prefered over `React.findDOMNode`.
        * @return {?DOMNode} Flash Player object DOM node.
        */
      def getFPDOMNode(): Node = js.native
    }
    
    @js.native
    trait State extends StObject
  }
  
  /* was `typeof rswf.ReactSWF` */
  type self = ReactSWF
}
