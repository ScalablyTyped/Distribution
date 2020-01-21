package typings.reactAliceCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  // indicator to control the visibility of navigation dots
  var isNextSlideDisabled: Boolean
  var isPrevSlideDisabled: Boolean
  var item: Double
  var itemsInSlide: Double
  var slide: Double
}

object EventObject {
  @scala.inline
  def apply(
    isNextSlideDisabled: Boolean,
    isPrevSlideDisabled: Boolean,
    item: Double,
    itemsInSlide: Double,
    slide: Double
  ): EventObject = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventObject]
  }
}

