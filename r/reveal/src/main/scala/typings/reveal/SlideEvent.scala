package typings.reveal

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/hakimel/reveal.js/#slide-changed-event
trait SlideEvent extends js.Object {
  var currentSlide: Element
  var indexh: Double
  var indexv: js.UndefOr[Double] = js.undefined
  var previousSlide: js.UndefOr[Element] = js.undefined
}

object SlideEvent {
  @scala.inline
  def apply(currentSlide: Element, indexh: Double, indexv: Int | Double = null, previousSlide: Element = null): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide, indexh = indexh)
    if (indexv != null) __obj.updateDynamic("indexv")(indexv.asInstanceOf[js.Any])
    if (previousSlide != null) __obj.updateDynamic("previousSlide")(previousSlide)
    __obj.asInstanceOf[SlideEvent]
  }
}

