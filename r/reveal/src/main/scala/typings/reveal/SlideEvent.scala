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
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any])
    if (indexv != null) __obj.updateDynamic("indexv")(indexv.asInstanceOf[js.Any])
    if (previousSlide != null) __obj.updateDynamic("previousSlide")(previousSlide.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEvent]
  }
}

