package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevealOptions extends js.Object {
  var autoSlide: js.UndefOr[scala.Double] = js.undefined
  var autoSlideMethod: js.UndefOr[js.Any] = js.undefined
  var autoSlideStoppable: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundTransition: js.UndefOr[java.lang.String] = js.undefined
  var center: js.UndefOr[scala.Boolean] = js.undefined
  // Configuration
  var controls: js.UndefOr[scala.Boolean] = js.undefined
  // Dependencies
  // https://github.com/hakimel/reveal.js/#dependencies
  var dependencies: js.UndefOr[js.Array[RevealDependency]] = js.undefined
  var embedded: js.UndefOr[scala.Boolean] = js.undefined
  var fragments: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var hideAddressBar: js.UndefOr[scala.Boolean] = js.undefined
  var history: js.UndefOr[scala.Boolean] = js.undefined
  // https://github.com/hakimel/reveal.js/#keyboard-bindings
  var keyboard: js.UndefOr[js.Any] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  // https://github.com/hakimel/reveal.js/#mathjax
  var math: js.UndefOr[MathConfig] = js.undefined
  var maxScale: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minScale: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mouseWheel: js.UndefOr[scala.Boolean] = js.undefined
  // https://github.com/hakimel/reveal.js/#multiplexing
  var multiplex: js.UndefOr[MultiplexConfig] = js.undefined
  var overview: js.UndefOr[scala.Boolean] = js.undefined
   // CSS syntax, e.g. "2100px 900px" - currently only pixels are supported (don't use % or auto)
  // Number of pixels to move the parallax background per slide
  // - Calculated automatically unless specified
  // - Set to 0 to disable movement along an axis
  var parallaxBackgroundHorizontal: js.UndefOr[scala.Double] = js.undefined
  // https://github.com/hakimel/reveal.js/#parallax-background
  // Parallax background image
  var parallaxBackgroundImage: js.UndefOr[java.lang.String] = js.undefined
  // Parallax background size
  var parallaxBackgroundSize: js.UndefOr[java.lang.String] = js.undefined
  var parallaxBackgroundVertical: js.UndefOr[scala.Double] = js.undefined
  // Exposes the reveal.js API through window.postMessage
  var postMessage: js.UndefOr[scala.Boolean] = js.undefined
  // Dispatches all reveal.js events to the parent window through postMessage
  var postMessageEvents: js.UndefOr[scala.Boolean] = js.undefined
  var previewLinks: js.UndefOr[scala.Boolean] = js.undefined
  var progress: js.UndefOr[scala.Boolean] = js.undefined
  var rollingLinks: js.UndefOr[scala.Boolean] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var showNotes: js.UndefOr[scala.Boolean] = js.undefined
  var shuffle: js.UndefOr[scala.Boolean] = js.undefined
  // https://github.com/hakimel/reveal.js/#slide-number
  var slideNumber: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
  var transitionSpeed: js.UndefOr[java.lang.String] = js.undefined
  var viewDistance: js.UndefOr[scala.Double] = js.undefined
  // Presentation Size
  // https://github.com/hakimel/reveal.js/#presentation-size
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object RevealOptions {
  @scala.inline
  def apply(
    autoSlide: scala.Int | scala.Double = null,
    autoSlideMethod: js.Any = null,
    autoSlideStoppable: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundTransition: java.lang.String = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    dependencies: js.Array[RevealDependency] = null,
    embedded: js.UndefOr[scala.Boolean] = js.undefined,
    fragments: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Double | java.lang.String = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    hideAddressBar: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    keyboard: js.Any = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Double | java.lang.String = null,
    math: MathConfig = null,
    maxScale: scala.Double | java.lang.String = null,
    minScale: scala.Double | java.lang.String = null,
    mouseWheel: js.UndefOr[scala.Boolean] = js.undefined,
    multiplex: MultiplexConfig = null,
    overview: js.UndefOr[scala.Boolean] = js.undefined,
    parallaxBackgroundHorizontal: scala.Int | scala.Double = null,
    parallaxBackgroundImage: java.lang.String = null,
    parallaxBackgroundSize: java.lang.String = null,
    parallaxBackgroundVertical: scala.Int | scala.Double = null,
    postMessage: js.UndefOr[scala.Boolean] = js.undefined,
    postMessageEvents: js.UndefOr[scala.Boolean] = js.undefined,
    previewLinks: js.UndefOr[scala.Boolean] = js.undefined,
    progress: js.UndefOr[scala.Boolean] = js.undefined,
    rollingLinks: js.UndefOr[scala.Boolean] = js.undefined,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    showNotes: js.UndefOr[scala.Boolean] = js.undefined,
    shuffle: js.UndefOr[scala.Boolean] = js.undefined,
    slideNumber: scala.Boolean | java.lang.String = null,
    theme: java.lang.String = null,
    touch: js.UndefOr[scala.Boolean] = js.undefined,
    transition: java.lang.String = null,
    transitionSpeed: java.lang.String = null,
    viewDistance: scala.Int | scala.Double = null,
    width: scala.Double | java.lang.String = null
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

