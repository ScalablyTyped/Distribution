package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevealOptions extends StObject {
  
  var autoSlide: js.UndefOr[Double] = js.native
  
  var autoSlideMethod: js.UndefOr[js.Any] = js.native
  
  var autoSlideStoppable: js.UndefOr[Boolean] = js.native
  
  var backgroundTransition: js.UndefOr[String] = js.native
  
  var center: js.UndefOr[Boolean] = js.native
  
  // Configuration
  var controls: js.UndefOr[Boolean] = js.native
  
  // Dependencies
  // https://github.com/hakimel/reveal.js/#dependencies
  var dependencies: js.UndefOr[js.Array[RevealDependency]] = js.native
  
  var embedded: js.UndefOr[Boolean] = js.native
  
  var fragments: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var help: js.UndefOr[Boolean] = js.native
  
  var hideAddressBar: js.UndefOr[Boolean] = js.native
  
  var history: js.UndefOr[Boolean] = js.native
  
  // https://github.com/hakimel/reveal.js/#keyboard-bindings
  var keyboard: js.UndefOr[js.Any] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var margin: js.UndefOr[Double | String] = js.native
  
  // https://github.com/hakimel/reveal.js/#mathjax
  var math: js.UndefOr[MathConfig] = js.native
  
  var maxScale: js.UndefOr[Double | String] = js.native
  
  var minScale: js.UndefOr[Double | String] = js.native
  
  var mouseWheel: js.UndefOr[Boolean] = js.native
  
  // https://github.com/hakimel/reveal.js/#multiplexing
  var multiplex: js.UndefOr[MultiplexConfig] = js.native
  
  var overview: js.UndefOr[Boolean] = js.native
  
  // CSS syntax, e.g. "2100px 900px" - currently only pixels are supported (don't use % or auto)
  // Number of pixels to move the parallax background per slide
  // - Calculated automatically unless specified
  // - Set to 0 to disable movement along an axis
  var parallaxBackgroundHorizontal: js.UndefOr[Double] = js.native
  
  // https://github.com/hakimel/reveal.js/#parallax-background
  // Parallax background image
  var parallaxBackgroundImage: js.UndefOr[String] = js.native
  
  // Parallax background size
  var parallaxBackgroundSize: js.UndefOr[String] = js.native
  
  var parallaxBackgroundVertical: js.UndefOr[Double] = js.native
  
  // Exposes the reveal.js API through window.postMessage
  var postMessage: js.UndefOr[Boolean] = js.native
  
  // Dispatches all reveal.js events to the parent window through postMessage
  var postMessageEvents: js.UndefOr[Boolean] = js.native
  
  var previewLinks: js.UndefOr[Boolean] = js.native
  
  var progress: js.UndefOr[Boolean] = js.native
  
  var rollingLinks: js.UndefOr[Boolean] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  var showNotes: js.UndefOr[Boolean] = js.native
  
  var shuffle: js.UndefOr[Boolean] = js.native
  
  // https://github.com/hakimel/reveal.js/#slide-number
  var slideNumber: js.UndefOr[Boolean | String] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var touch: js.UndefOr[Boolean] = js.native
  
  var transition: js.UndefOr[String] = js.native
  
  var transitionSpeed: js.UndefOr[String] = js.native
  
  var viewDistance: js.UndefOr[Double] = js.native
  
  // Presentation Size
  // https://github.com/hakimel/reveal.js/#presentation-size
  var width: js.UndefOr[Double | String] = js.native
}
object RevealOptions {
  
  @scala.inline
  def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  @scala.inline
  implicit class RevealOptionsMutableBuilder[Self <: RevealOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSlide(value: Double): Self = StObject.set(x, "autoSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSlideMethod(value: js.Any): Self = StObject.set(x, "autoSlideMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSlideMethodUndefined: Self = StObject.set(x, "autoSlideMethod", js.undefined)
    
    @scala.inline
    def setAutoSlideStoppable(value: Boolean): Self = StObject.set(x, "autoSlideStoppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSlideStoppableUndefined: Self = StObject.set(x, "autoSlideStoppable", js.undefined)
    
    @scala.inline
    def setAutoSlideUndefined: Self = StObject.set(x, "autoSlide", js.undefined)
    
    @scala.inline
    def setBackgroundTransition(value: String): Self = StObject.set(x, "backgroundTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundTransitionUndefined: Self = StObject.set(x, "backgroundTransition", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[RevealDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: RevealDependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedUndefined: Self = StObject.set(x, "embedded", js.undefined)
    
    @scala.inline
    def setFragments(value: Boolean): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentsUndefined: Self = StObject.set(x, "fragments", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setHideAddressBar(value: Boolean): Self = StObject.set(x, "hideAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideAddressBarUndefined: Self = StObject.set(x, "hideAddressBar", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setKeyboard(value: js.Any): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMath(value: MathConfig): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double | String): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double | String): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    @scala.inline
    def setMultiplex(value: MultiplexConfig): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
    
    @scala.inline
    def setOverview(value: Boolean): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundHorizontal(value: Double): Self = StObject.set(x, "parallaxBackgroundHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxBackgroundHorizontalUndefined: Self = StObject.set(x, "parallaxBackgroundHorizontal", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundImage(value: String): Self = StObject.set(x, "parallaxBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxBackgroundImageUndefined: Self = StObject.set(x, "parallaxBackgroundImage", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundSize(value: String): Self = StObject.set(x, "parallaxBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxBackgroundSizeUndefined: Self = StObject.set(x, "parallaxBackgroundSize", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundVertical(value: Double): Self = StObject.set(x, "parallaxBackgroundVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallaxBackgroundVerticalUndefined: Self = StObject.set(x, "parallaxBackgroundVertical", js.undefined)
    
    @scala.inline
    def setPostMessage(value: Boolean): Self = StObject.set(x, "postMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessageEvents(value: Boolean): Self = StObject.set(x, "postMessageEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostMessageEventsUndefined: Self = StObject.set(x, "postMessageEvents", js.undefined)
    
    @scala.inline
    def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
    
    @scala.inline
    def setPreviewLinks(value: Boolean): Self = StObject.set(x, "previewLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewLinksUndefined: Self = StObject.set(x, "previewLinks", js.undefined)
    
    @scala.inline
    def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setRollingLinks(value: Boolean): Self = StObject.set(x, "rollingLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollingLinksUndefined: Self = StObject.set(x, "rollingLinks", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setShowNotes(value: Boolean): Self = StObject.set(x, "showNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNotesUndefined: Self = StObject.set(x, "showNotes", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    @scala.inline
    def setSlideNumber(value: Boolean | String): Self = StObject.set(x, "slideNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideNumberUndefined: Self = StObject.set(x, "slideNumber", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionSpeed(value: String): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setViewDistance(value: Double): Self = StObject.set(x, "viewDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewDistanceUndefined: Self = StObject.set(x, "viewDistance", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
