package typings.reveal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealOptions extends js.Object {
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
  @scala.inline
  def apply(
    autoSlide: Int | Double = null,
    autoSlideMethod: js.Any = null,
    autoSlideStoppable: js.UndefOr[Boolean] = js.undefined,
    backgroundTransition: String = null,
    center: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    dependencies: js.Array[RevealDependency] = null,
    embedded: js.UndefOr[Boolean] = js.undefined,
    fragments: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    help: js.UndefOr[Boolean] = js.undefined,
    hideAddressBar: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.Any = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    margin: Double | String = null,
    math: MathConfig = null,
    maxScale: Double | String = null,
    minScale: Double | String = null,
    mouseWheel: js.UndefOr[Boolean] = js.undefined,
    multiplex: MultiplexConfig = null,
    overview: js.UndefOr[Boolean] = js.undefined,
    parallaxBackgroundHorizontal: Int | Double = null,
    parallaxBackgroundImage: String = null,
    parallaxBackgroundSize: String = null,
    parallaxBackgroundVertical: Int | Double = null,
    postMessage: js.UndefOr[Boolean] = js.undefined,
    postMessageEvents: js.UndefOr[Boolean] = js.undefined,
    previewLinks: js.UndefOr[Boolean] = js.undefined,
    progress: js.UndefOr[Boolean] = js.undefined,
    rollingLinks: js.UndefOr[Boolean] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showNotes: js.UndefOr[Boolean] = js.undefined,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    slideNumber: Boolean | String = null,
    theme: String = null,
    touch: js.UndefOr[Boolean] = js.undefined,
    transition: String = null,
    transitionSpeed: String = null,
    viewDistance: Int | Double = null,
    width: Double | String = null
  ): RevealOptions = {
    val __obj = js.Dynamic.literal()
    if (autoSlide != null) __obj.updateDynamic("autoSlide")(autoSlide.asInstanceOf[js.Any])
    if (autoSlideMethod != null) __obj.updateDynamic("autoSlideMethod")(autoSlideMethod)
    if (!js.isUndefined(autoSlideStoppable)) __obj.updateDynamic("autoSlideStoppable")(autoSlideStoppable)
    if (backgroundTransition != null) __obj.updateDynamic("backgroundTransition")(backgroundTransition)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (!js.isUndefined(embedded)) __obj.updateDynamic("embedded")(embedded)
    if (!js.isUndefined(fragments)) __obj.updateDynamic("fragments")(fragments)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (!js.isUndefined(hideAddressBar)) __obj.updateDynamic("hideAddressBar")(hideAddressBar)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (keyboard != null) __obj.updateDynamic("keyboard")(keyboard)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (math != null) __obj.updateDynamic("math")(math)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheel)) __obj.updateDynamic("mouseWheel")(mouseWheel)
    if (multiplex != null) __obj.updateDynamic("multiplex")(multiplex)
    if (!js.isUndefined(overview)) __obj.updateDynamic("overview")(overview)
    if (parallaxBackgroundHorizontal != null) __obj.updateDynamic("parallaxBackgroundHorizontal")(parallaxBackgroundHorizontal.asInstanceOf[js.Any])
    if (parallaxBackgroundImage != null) __obj.updateDynamic("parallaxBackgroundImage")(parallaxBackgroundImage)
    if (parallaxBackgroundSize != null) __obj.updateDynamic("parallaxBackgroundSize")(parallaxBackgroundSize)
    if (parallaxBackgroundVertical != null) __obj.updateDynamic("parallaxBackgroundVertical")(parallaxBackgroundVertical.asInstanceOf[js.Any])
    if (!js.isUndefined(postMessage)) __obj.updateDynamic("postMessage")(postMessage)
    if (!js.isUndefined(postMessageEvents)) __obj.updateDynamic("postMessageEvents")(postMessageEvents)
    if (!js.isUndefined(previewLinks)) __obj.updateDynamic("previewLinks")(previewLinks)
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress)
    if (!js.isUndefined(rollingLinks)) __obj.updateDynamic("rollingLinks")(rollingLinks)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (!js.isUndefined(showNotes)) __obj.updateDynamic("showNotes")(showNotes)
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle)
    if (slideNumber != null) __obj.updateDynamic("slideNumber")(slideNumber.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(touch)) __obj.updateDynamic("touch")(touch)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (transitionSpeed != null) __obj.updateDynamic("transitionSpeed")(transitionSpeed)
    if (viewDistance != null) __obj.updateDynamic("viewDistance")(viewDistance.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealOptions]
  }
}

