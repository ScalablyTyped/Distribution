package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevealOptions extends StObject {
  
  var autoSlide: js.UndefOr[Double] = js.undefined
  
  var autoSlideMethod: js.UndefOr[js.Any] = js.undefined
  
  var autoSlideStoppable: js.UndefOr[Boolean] = js.undefined
  
  var backgroundTransition: js.UndefOr[String] = js.undefined
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  // Configuration
  var controls: js.UndefOr[Boolean] = js.undefined
  
  // Dependencies
  // https://github.com/hakimel/reveal.js/#dependencies
  var dependencies: js.UndefOr[js.Array[RevealDependency]] = js.undefined
  
  var embedded: js.UndefOr[Boolean] = js.undefined
  
  var fragments: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var hideAddressBar: js.UndefOr[Boolean] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/hakimel/reveal.js/#keyboard-bindings
  var keyboard: js.UndefOr[js.Any] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[Double | String] = js.undefined
  
  // https://github.com/hakimel/reveal.js/#mathjax
  var math: js.UndefOr[MathConfig] = js.undefined
  
  var maxScale: js.UndefOr[Double | String] = js.undefined
  
  var minScale: js.UndefOr[Double | String] = js.undefined
  
  var mouseWheel: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/hakimel/reveal.js/#multiplexing
  var multiplex: js.UndefOr[MultiplexConfig] = js.undefined
  
  var overview: js.UndefOr[Boolean] = js.undefined
  
  // CSS syntax, e.g. "2100px 900px" - currently only pixels are supported (don't use % or auto)
  // Number of pixels to move the parallax background per slide
  // - Calculated automatically unless specified
  // - Set to 0 to disable movement along an axis
  var parallaxBackgroundHorizontal: js.UndefOr[Double] = js.undefined
  
  // https://github.com/hakimel/reveal.js/#parallax-background
  // Parallax background image
  var parallaxBackgroundImage: js.UndefOr[String] = js.undefined
  
  // Parallax background size
  var parallaxBackgroundSize: js.UndefOr[String] = js.undefined
  
  var parallaxBackgroundVertical: js.UndefOr[Double] = js.undefined
  
  // Exposes the reveal.js API through window.postMessage
  var postMessage: js.UndefOr[Boolean] = js.undefined
  
  // Dispatches all reveal.js events to the parent window through postMessage
  var postMessageEvents: js.UndefOr[Boolean] = js.undefined
  
  var previewLinks: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[Boolean] = js.undefined
  
  var rollingLinks: js.UndefOr[Boolean] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var showNotes: js.UndefOr[Boolean] = js.undefined
  
  var shuffle: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/hakimel/reveal.js/#slide-number
  var slideNumber: js.UndefOr[Boolean | String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var touch: js.UndefOr[Boolean] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var transitionSpeed: js.UndefOr[String] = js.undefined
  
  var viewDistance: js.UndefOr[Double] = js.undefined
  
  // Presentation Size
  // https://github.com/hakimel/reveal.js/#presentation-size
  var width: js.UndefOr[Double | String] = js.undefined
}
object RevealOptions {
  
  inline def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  extension [Self <: RevealOptions](x: Self) {
    
    inline def setAutoSlide(value: Double): Self = StObject.set(x, "autoSlide", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideMethod(value: js.Any): Self = StObject.set(x, "autoSlideMethod", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideMethodUndefined: Self = StObject.set(x, "autoSlideMethod", js.undefined)
    
    inline def setAutoSlideStoppable(value: Boolean): Self = StObject.set(x, "autoSlideStoppable", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideStoppableUndefined: Self = StObject.set(x, "autoSlideStoppable", js.undefined)
    
    inline def setAutoSlideUndefined: Self = StObject.set(x, "autoSlide", js.undefined)
    
    inline def setBackgroundTransition(value: String): Self = StObject.set(x, "backgroundTransition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTransitionUndefined: Self = StObject.set(x, "backgroundTransition", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDependencies(value: js.Array[RevealDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: RevealDependency*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedUndefined: Self = StObject.set(x, "embedded", js.undefined)
    
    inline def setFragments(value: Boolean): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsUndefined: Self = StObject.set(x, "fragments", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHideAddressBar(value: Boolean): Self = StObject.set(x, "hideAddressBar", value.asInstanceOf[js.Any])
    
    inline def setHideAddressBarUndefined: Self = StObject.set(x, "hideAddressBar", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setKeyboard(value: js.Any): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMath(value: MathConfig): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    inline def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    inline def setMaxScale(value: Double | String): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double | String): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    inline def setMultiplex(value: MultiplexConfig): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
    
    inline def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
    
    inline def setOverview(value: Boolean): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setParallaxBackgroundHorizontal(value: Double): Self = StObject.set(x, "parallaxBackgroundHorizontal", value.asInstanceOf[js.Any])
    
    inline def setParallaxBackgroundHorizontalUndefined: Self = StObject.set(x, "parallaxBackgroundHorizontal", js.undefined)
    
    inline def setParallaxBackgroundImage(value: String): Self = StObject.set(x, "parallaxBackgroundImage", value.asInstanceOf[js.Any])
    
    inline def setParallaxBackgroundImageUndefined: Self = StObject.set(x, "parallaxBackgroundImage", js.undefined)
    
    inline def setParallaxBackgroundSize(value: String): Self = StObject.set(x, "parallaxBackgroundSize", value.asInstanceOf[js.Any])
    
    inline def setParallaxBackgroundSizeUndefined: Self = StObject.set(x, "parallaxBackgroundSize", js.undefined)
    
    inline def setParallaxBackgroundVertical(value: Double): Self = StObject.set(x, "parallaxBackgroundVertical", value.asInstanceOf[js.Any])
    
    inline def setParallaxBackgroundVerticalUndefined: Self = StObject.set(x, "parallaxBackgroundVertical", js.undefined)
    
    inline def setPostMessage(value: Boolean): Self = StObject.set(x, "postMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessageEvents(value: Boolean): Self = StObject.set(x, "postMessageEvents", value.asInstanceOf[js.Any])
    
    inline def setPostMessageEventsUndefined: Self = StObject.set(x, "postMessageEvents", js.undefined)
    
    inline def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
    
    inline def setPreviewLinks(value: Boolean): Self = StObject.set(x, "previewLinks", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinksUndefined: Self = StObject.set(x, "previewLinks", js.undefined)
    
    inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRollingLinks(value: Boolean): Self = StObject.set(x, "rollingLinks", value.asInstanceOf[js.Any])
    
    inline def setRollingLinksUndefined: Self = StObject.set(x, "rollingLinks", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setShowNotes(value: Boolean): Self = StObject.set(x, "showNotes", value.asInstanceOf[js.Any])
    
    inline def setShowNotesUndefined: Self = StObject.set(x, "showNotes", js.undefined)
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    inline def setSlideNumber(value: Boolean | String): Self = StObject.set(x, "slideNumber", value.asInstanceOf[js.Any])
    
    inline def setSlideNumberUndefined: Self = StObject.set(x, "slideNumber", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionSpeed(value: String): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
    
    inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setViewDistance(value: Double): Self = StObject.set(x, "viewDistance", value.asInstanceOf[js.Any])
    
    inline def setViewDistanceUndefined: Self = StObject.set(x, "viewDistance", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
