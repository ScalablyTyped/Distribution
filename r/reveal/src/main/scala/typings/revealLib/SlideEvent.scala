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

object SlideEvent {
  @scala.inline
  def apply(
    currentSlide: stdLib.Element,
    indexh: scala.Double,
    indexv: scala.Int | scala.Double = null,
    previousSlide: stdLib.Element = null
  ): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide, indexh = indexh)
    if (indexv != null) __obj.updateDynamic("indexv")(indexv.asInstanceOf[js.Any])
    if (previousSlide != null) __obj.updateDynamic("previousSlide")(previousSlide)
    __obj.asInstanceOf[SlideEvent]
  }
}

