package typings
package revealLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#slide-changed-event

trait SlideEvent extends js.Object {
  var currentSlide: stdLib.Element
  var indexh: scala.Double
  var indexv: js.UndefOr[scala.Double] = js.undefined
  var previousSlide: js.UndefOr[stdLib.Element] = js.undefined
}

