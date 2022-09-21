package typings.reveal

import typings.reveal.revealBooleans.`false`
import typings.reveal.revealStrings.`bottom-right`
import typings.reveal.revealStrings.all
import typings.reveal.revealStrings.concave
import typings.reveal.revealStrings.convex
import typings.reveal.revealStrings.default
import typings.reveal.revealStrings.edges
import typings.reveal.revealStrings.fade
import typings.reveal.revealStrings.faded
import typings.reveal.revealStrings.fast
import typings.reveal.revealStrings.grid
import typings.reveal.revealStrings.hidden
import typings.reveal.revealStrings.linear
import typings.reveal.revealStrings.none
import typings.reveal.revealStrings.print
import typings.reveal.revealStrings.slide
import typings.reveal.revealStrings.slow
import typings.reveal.revealStrings.speaker
import typings.reveal.revealStrings.visible
import typings.reveal.revealStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevealOptions extends StObject {
  
  var autoAnimate: js.UndefOr[Boolean] = js.undefined
  
  var autoAnimateDuration: js.UndefOr[Double] = js.undefined
  
  var autoAnimateEasing: js.UndefOr[String] = js.undefined
  
  var autoAnimateMatcher: js.UndefOr[Any] = js.undefined
  
  var autoAnimateStyles: js.UndefOr[js.Array[String]] = js.undefined
  
  var autoAnimateUnmatched: js.UndefOr[Boolean] = js.undefined
  
  var autoPlayMedia: js.UndefOr[Boolean | Null] = js.undefined
  
  var autoSlide: js.UndefOr[Double | `false`] = js.undefined
  
  var autoSlideMethod: js.UndefOr[Any] = js.undefined
  
  var autoSlideStoppable: js.UndefOr[Boolean] = js.undefined
  
  var backgroundTransition: js.UndefOr[none | fade | slide | convex | concave | zoom] = js.undefined
  
  var center: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/config.md
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var controlsBackArrows: js.UndefOr[faded | hidden | visible] = js.undefined
  
  var controlsLayout: js.UndefOr[edges | `bottom-right`] = js.undefined
  
  var controlsTutorial: js.UndefOr[Boolean] = js.undefined
  
  var defaultTiming: js.UndefOr[Double | Null] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/plugins.md
  var dependencies: js.UndefOr[js.Array[RevealDependency]] = js.undefined
  
  var disableLayout: js.UndefOr[Boolean] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  var embedded: js.UndefOr[Boolean] = js.undefined
  
  var focusBodyOnPageVisibilityChange: js.UndefOr[Boolean] = js.undefined
  
  var fragmentInURL: js.UndefOr[Boolean] = js.undefined
  
  var fragments: js.UndefOr[Boolean] = js.undefined
  
  var hash: js.UndefOr[Boolean] = js.undefined
  
  var hashOneBasedIndex: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var help: js.UndefOr[Boolean] = js.undefined
  
  var hideAddressBar: js.UndefOr[Boolean] = js.undefined
  
  var hideCursorTime: js.UndefOr[Double] = js.undefined
  
  var hideInactiveCursor: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/code.md
  var highlight: js.UndefOr[Any] = js.undefined
  
  var history: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/math.md
  var katex: js.UndefOr[Any] = js.undefined
  
  var keyboard: js.UndefOr[Any] = js.undefined
  
  var keyboardCondition: js.UndefOr[Any] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr[Double | String] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/markdown.md
  var markdown: js.UndefOr[Any] = js.undefined
  
  // NOTE: could no longer find the below fields in the reveal.js docs
  var math: js.UndefOr[MathConfig] = js.undefined
  
  var mathjax2: js.UndefOr[Any] = js.undefined
  
  var mathjax3: js.UndefOr[Any] = js.undefined
  
  var maxScale: js.UndefOr[Double | String] = js.undefined
  
  var minScale: js.UndefOr[Double | String] = js.undefined
  
  var mobileViewDistance: js.UndefOr[Double] = js.undefined
  
  var mouseWheel: js.UndefOr[Boolean] = js.undefined
  
  // https://github.com/reveal/multiplex
  var multiplex: js.UndefOr[MultiplexConfig] = js.undefined
  
  var navigationMode: js.UndefOr[default | linear | grid] = js.undefined
  
  var overview: js.UndefOr[Boolean] = js.undefined
  
  var parallaxBackgroundHorizontal: js.UndefOr[Double] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/backgrounds.md
  var parallaxBackgroundImage: js.UndefOr[String] = js.undefined
  
  var parallaxBackgroundSize: js.UndefOr[String] = js.undefined
  
  var parallaxBackgroundVertical: js.UndefOr[Double] = js.undefined
  
  var pause: js.UndefOr[Boolean] = js.undefined
  
  var pdfMaxPagesPerSlide: js.UndefOr[Double] = js.undefined
  
  var pdfPageHeightOffset: js.UndefOr[Double] = js.undefined
  
  var pdfSeparateFragments: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  var postMessage: js.UndefOr[Boolean] = js.undefined
  
  var postMessageEvents: js.UndefOr[Boolean] = js.undefined
  
  var preloadIframes: js.UndefOr[Boolean | Null] = js.undefined
  
  var previewLinks: js.UndefOr[Boolean] = js.undefined
  
  var progress: js.UndefOr[Boolean] = js.undefined
  
  var respondToHashChanges: js.UndefOr[Boolean] = js.undefined
  
  var rollingLinks: js.UndefOr[Boolean] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var showNotes: js.UndefOr[Boolean] = js.undefined
  
  var showSlideNumber: js.UndefOr[all | print | speaker] = js.undefined
  
  var shuffle: js.UndefOr[Boolean] = js.undefined
  
  var slideNumber: js.UndefOr[Boolean | String] = js.undefined
  
  var theme: js.UndefOr[String] = js.undefined
  
  var touch: js.UndefOr[Boolean] = js.undefined
  
  var transition: js.UndefOr[none | fade | slide | convex | concave | zoom] = js.undefined
  
  var transitionSpeed: js.UndefOr[default | fast | slow] = js.undefined
  
  var viewDistance: js.UndefOr[Double] = js.undefined
  
  // https://github.com/reveal/revealjs.com/blob/master/src/presentation-size.md
  var width: js.UndefOr[Double | String] = js.undefined
}
object RevealOptions {
  
  inline def apply(): RevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealOptions]
  }
  
  extension [Self <: RevealOptions](x: Self) {
    
    inline def setAutoAnimate(value: Boolean): Self = StObject.set(x, "autoAnimate", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateDuration(value: Double): Self = StObject.set(x, "autoAnimateDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateDurationUndefined: Self = StObject.set(x, "autoAnimateDuration", js.undefined)
    
    inline def setAutoAnimateEasing(value: String): Self = StObject.set(x, "autoAnimateEasing", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateEasingUndefined: Self = StObject.set(x, "autoAnimateEasing", js.undefined)
    
    inline def setAutoAnimateMatcher(value: Any): Self = StObject.set(x, "autoAnimateMatcher", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateMatcherUndefined: Self = StObject.set(x, "autoAnimateMatcher", js.undefined)
    
    inline def setAutoAnimateStyles(value: js.Array[String]): Self = StObject.set(x, "autoAnimateStyles", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateStylesUndefined: Self = StObject.set(x, "autoAnimateStyles", js.undefined)
    
    inline def setAutoAnimateStylesVarargs(value: String*): Self = StObject.set(x, "autoAnimateStyles", js.Array(value*))
    
    inline def setAutoAnimateUndefined: Self = StObject.set(x, "autoAnimate", js.undefined)
    
    inline def setAutoAnimateUnmatched(value: Boolean): Self = StObject.set(x, "autoAnimateUnmatched", value.asInstanceOf[js.Any])
    
    inline def setAutoAnimateUnmatchedUndefined: Self = StObject.set(x, "autoAnimateUnmatched", js.undefined)
    
    inline def setAutoPlayMedia(value: Boolean): Self = StObject.set(x, "autoPlayMedia", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayMediaNull: Self = StObject.set(x, "autoPlayMedia", null)
    
    inline def setAutoPlayMediaUndefined: Self = StObject.set(x, "autoPlayMedia", js.undefined)
    
    inline def setAutoSlide(value: Double | `false`): Self = StObject.set(x, "autoSlide", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideMethod(value: Any): Self = StObject.set(x, "autoSlideMethod", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideMethodUndefined: Self = StObject.set(x, "autoSlideMethod", js.undefined)
    
    inline def setAutoSlideStoppable(value: Boolean): Self = StObject.set(x, "autoSlideStoppable", value.asInstanceOf[js.Any])
    
    inline def setAutoSlideStoppableUndefined: Self = StObject.set(x, "autoSlideStoppable", js.undefined)
    
    inline def setAutoSlideUndefined: Self = StObject.set(x, "autoSlide", js.undefined)
    
    inline def setBackgroundTransition(value: none | fade | slide | convex | concave | zoom): Self = StObject.set(x, "backgroundTransition", value.asInstanceOf[js.Any])
    
    inline def setBackgroundTransitionUndefined: Self = StObject.set(x, "backgroundTransition", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsBackArrows(value: faded | hidden | visible): Self = StObject.set(x, "controlsBackArrows", value.asInstanceOf[js.Any])
    
    inline def setControlsBackArrowsUndefined: Self = StObject.set(x, "controlsBackArrows", js.undefined)
    
    inline def setControlsLayout(value: edges | `bottom-right`): Self = StObject.set(x, "controlsLayout", value.asInstanceOf[js.Any])
    
    inline def setControlsLayoutUndefined: Self = StObject.set(x, "controlsLayout", js.undefined)
    
    inline def setControlsTutorial(value: Boolean): Self = StObject.set(x, "controlsTutorial", value.asInstanceOf[js.Any])
    
    inline def setControlsTutorialUndefined: Self = StObject.set(x, "controlsTutorial", js.undefined)
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDefaultTiming(value: Double): Self = StObject.set(x, "defaultTiming", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimingNull: Self = StObject.set(x, "defaultTiming", null)
    
    inline def setDefaultTimingUndefined: Self = StObject.set(x, "defaultTiming", js.undefined)
    
    inline def setDependencies(value: js.Array[RevealDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: RevealDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDisableLayout(value: Boolean): Self = StObject.set(x, "disableLayout", value.asInstanceOf[js.Any])
    
    inline def setDisableLayoutUndefined: Self = StObject.set(x, "disableLayout", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setEmbedded(value: Boolean): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedUndefined: Self = StObject.set(x, "embedded", js.undefined)
    
    inline def setFocusBodyOnPageVisibilityChange(value: Boolean): Self = StObject.set(x, "focusBodyOnPageVisibilityChange", value.asInstanceOf[js.Any])
    
    inline def setFocusBodyOnPageVisibilityChangeUndefined: Self = StObject.set(x, "focusBodyOnPageVisibilityChange", js.undefined)
    
    inline def setFragmentInURL(value: Boolean): Self = StObject.set(x, "fragmentInURL", value.asInstanceOf[js.Any])
    
    inline def setFragmentInURLUndefined: Self = StObject.set(x, "fragmentInURL", js.undefined)
    
    inline def setFragments(value: Boolean): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
    
    inline def setFragmentsUndefined: Self = StObject.set(x, "fragments", js.undefined)
    
    inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashOneBasedIndex(value: Boolean): Self = StObject.set(x, "hashOneBasedIndex", value.asInstanceOf[js.Any])
    
    inline def setHashOneBasedIndexUndefined: Self = StObject.set(x, "hashOneBasedIndex", js.undefined)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHelp(value: Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setHideAddressBar(value: Boolean): Self = StObject.set(x, "hideAddressBar", value.asInstanceOf[js.Any])
    
    inline def setHideAddressBarUndefined: Self = StObject.set(x, "hideAddressBar", js.undefined)
    
    inline def setHideCursorTime(value: Double): Self = StObject.set(x, "hideCursorTime", value.asInstanceOf[js.Any])
    
    inline def setHideCursorTimeUndefined: Self = StObject.set(x, "hideCursorTime", js.undefined)
    
    inline def setHideInactiveCursor(value: Boolean): Self = StObject.set(x, "hideInactiveCursor", value.asInstanceOf[js.Any])
    
    inline def setHideInactiveCursorUndefined: Self = StObject.set(x, "hideInactiveCursor", js.undefined)
    
    inline def setHighlight(value: Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setKatex(value: Any): Self = StObject.set(x, "katex", value.asInstanceOf[js.Any])
    
    inline def setKatexUndefined: Self = StObject.set(x, "katex", js.undefined)
    
    inline def setKeyboard(value: Any): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardCondition(value: Any): Self = StObject.set(x, "keyboardCondition", value.asInstanceOf[js.Any])
    
    inline def setKeyboardConditionUndefined: Self = StObject.set(x, "keyboardCondition", js.undefined)
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMargin(value: Double | String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkdown(value: Any): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
    
    inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
    
    inline def setMath(value: MathConfig): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    inline def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    inline def setMathjax2(value: Any): Self = StObject.set(x, "mathjax2", value.asInstanceOf[js.Any])
    
    inline def setMathjax2Undefined: Self = StObject.set(x, "mathjax2", js.undefined)
    
    inline def setMathjax3(value: Any): Self = StObject.set(x, "mathjax3", value.asInstanceOf[js.Any])
    
    inline def setMathjax3Undefined: Self = StObject.set(x, "mathjax3", js.undefined)
    
    inline def setMaxScale(value: Double | String): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double | String): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setMobileViewDistance(value: Double): Self = StObject.set(x, "mobileViewDistance", value.asInstanceOf[js.Any])
    
    inline def setMobileViewDistanceUndefined: Self = StObject.set(x, "mobileViewDistance", js.undefined)
    
    inline def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    inline def setMultiplex(value: MultiplexConfig): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
    
    inline def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
    
    inline def setNavigationMode(value: default | linear | grid): Self = StObject.set(x, "navigationMode", value.asInstanceOf[js.Any])
    
    inline def setNavigationModeUndefined: Self = StObject.set(x, "navigationMode", js.undefined)
    
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
    
    inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPdfMaxPagesPerSlide(value: Double): Self = StObject.set(x, "pdfMaxPagesPerSlide", value.asInstanceOf[js.Any])
    
    inline def setPdfMaxPagesPerSlideUndefined: Self = StObject.set(x, "pdfMaxPagesPerSlide", js.undefined)
    
    inline def setPdfPageHeightOffset(value: Double): Self = StObject.set(x, "pdfPageHeightOffset", value.asInstanceOf[js.Any])
    
    inline def setPdfPageHeightOffsetUndefined: Self = StObject.set(x, "pdfPageHeightOffset", js.undefined)
    
    inline def setPdfSeparateFragments(value: Boolean): Self = StObject.set(x, "pdfSeparateFragments", value.asInstanceOf[js.Any])
    
    inline def setPdfSeparateFragmentsUndefined: Self = StObject.set(x, "pdfSeparateFragments", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPostMessage(value: Boolean): Self = StObject.set(x, "postMessage", value.asInstanceOf[js.Any])
    
    inline def setPostMessageEvents(value: Boolean): Self = StObject.set(x, "postMessageEvents", value.asInstanceOf[js.Any])
    
    inline def setPostMessageEventsUndefined: Self = StObject.set(x, "postMessageEvents", js.undefined)
    
    inline def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
    
    inline def setPreloadIframes(value: Boolean): Self = StObject.set(x, "preloadIframes", value.asInstanceOf[js.Any])
    
    inline def setPreloadIframesNull: Self = StObject.set(x, "preloadIframes", null)
    
    inline def setPreloadIframesUndefined: Self = StObject.set(x, "preloadIframes", js.undefined)
    
    inline def setPreviewLinks(value: Boolean): Self = StObject.set(x, "previewLinks", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinksUndefined: Self = StObject.set(x, "previewLinks", js.undefined)
    
    inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setRespondToHashChanges(value: Boolean): Self = StObject.set(x, "respondToHashChanges", value.asInstanceOf[js.Any])
    
    inline def setRespondToHashChangesUndefined: Self = StObject.set(x, "respondToHashChanges", js.undefined)
    
    inline def setRollingLinks(value: Boolean): Self = StObject.set(x, "rollingLinks", value.asInstanceOf[js.Any])
    
    inline def setRollingLinksUndefined: Self = StObject.set(x, "rollingLinks", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setShowNotes(value: Boolean): Self = StObject.set(x, "showNotes", value.asInstanceOf[js.Any])
    
    inline def setShowNotesUndefined: Self = StObject.set(x, "showNotes", js.undefined)
    
    inline def setShowSlideNumber(value: all | print | speaker): Self = StObject.set(x, "showSlideNumber", value.asInstanceOf[js.Any])
    
    inline def setShowSlideNumberUndefined: Self = StObject.set(x, "showSlideNumber", js.undefined)
    
    inline def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    inline def setSlideNumber(value: Boolean | String): Self = StObject.set(x, "slideNumber", value.asInstanceOf[js.Any])
    
    inline def setSlideNumberUndefined: Self = StObject.set(x, "slideNumber", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    inline def setTransition(value: none | fade | slide | convex | concave | zoom): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionSpeed(value: default | fast | slow): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
    
    inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setViewDistance(value: Double): Self = StObject.set(x, "viewDistance", value.asInstanceOf[js.Any])
    
    inline def setViewDistanceUndefined: Self = StObject.set(x, "viewDistance", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
