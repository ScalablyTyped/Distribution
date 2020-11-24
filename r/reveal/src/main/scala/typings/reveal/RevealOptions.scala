package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevealOptions extends js.Object {
  
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
  implicit class RevealOptionsOps[Self <: RevealOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoSlide(value: Double): Self = this.set("autoSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSlide: Self = this.set("autoSlide", js.undefined)
    
    @scala.inline
    def setAutoSlideMethod(value: js.Any): Self = this.set("autoSlideMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSlideMethod: Self = this.set("autoSlideMethod", js.undefined)
    
    @scala.inline
    def setAutoSlideStoppable(value: Boolean): Self = this.set("autoSlideStoppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSlideStoppable: Self = this.set("autoSlideStoppable", js.undefined)
    
    @scala.inline
    def setBackgroundTransition(value: String): Self = this.set("backgroundTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundTransition: Self = this.set("backgroundTransition", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: RevealDependency*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[RevealDependency]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setEmbedded(value: Boolean): Self = this.set("embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbedded: Self = this.set("embedded", js.undefined)
    
    @scala.inline
    def setFragments(value: Boolean): Self = this.set("fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragments: Self = this.set("fragments", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHelp(value: Boolean): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHideAddressBar(value: Boolean): Self = this.set("hideAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAddressBar: Self = this.set("hideAddressBar", js.undefined)
    
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setKeyboard(value: js.Any): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setMargin(value: Double | String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMath(value: MathConfig): Self = this.set("math", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMath: Self = this.set("math", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double | String): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double | String): Self = this.set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    
    @scala.inline
    def setMouseWheel(value: Boolean): Self = this.set("mouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseWheel: Self = this.set("mouseWheel", js.undefined)
    
    @scala.inline
    def setMultiplex(value: MultiplexConfig): Self = this.set("multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplex: Self = this.set("multiplex", js.undefined)
    
    @scala.inline
    def setOverview(value: Boolean): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundHorizontal(value: Double): Self = this.set("parallaxBackgroundHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallaxBackgroundHorizontal: Self = this.set("parallaxBackgroundHorizontal", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundImage(value: String): Self = this.set("parallaxBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallaxBackgroundImage: Self = this.set("parallaxBackgroundImage", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundSize(value: String): Self = this.set("parallaxBackgroundSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallaxBackgroundSize: Self = this.set("parallaxBackgroundSize", js.undefined)
    
    @scala.inline
    def setParallaxBackgroundVertical(value: Double): Self = this.set("parallaxBackgroundVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallaxBackgroundVertical: Self = this.set("parallaxBackgroundVertical", js.undefined)
    
    @scala.inline
    def setPostMessage(value: Boolean): Self = this.set("postMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostMessage: Self = this.set("postMessage", js.undefined)
    
    @scala.inline
    def setPostMessageEvents(value: Boolean): Self = this.set("postMessageEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostMessageEvents: Self = this.set("postMessageEvents", js.undefined)
    
    @scala.inline
    def setPreviewLinks(value: Boolean): Self = this.set("previewLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewLinks: Self = this.set("previewLinks", js.undefined)
    
    @scala.inline
    def setProgress(value: Boolean): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRollingLinks(value: Boolean): Self = this.set("rollingLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingLinks: Self = this.set("rollingLinks", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setShowNotes(value: Boolean): Self = this.set("showNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNotes: Self = this.set("showNotes", js.undefined)
    
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
    
    @scala.inline
    def setSlideNumber(value: Boolean | String): Self = this.set("slideNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideNumber: Self = this.set("slideNumber", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = this.set("touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouch: Self = this.set("touch", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionSpeed(value: String): Self = this.set("transitionSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionSpeed: Self = this.set("transitionSpeed", js.undefined)
    
    @scala.inline
    def setViewDistance(value: Double): Self = this.set("viewDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewDistance: Self = this.set("viewDistance", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
