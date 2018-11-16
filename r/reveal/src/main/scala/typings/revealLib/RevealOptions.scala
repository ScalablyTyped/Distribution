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

