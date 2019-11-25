package typings.reactDashAliceDashCarousel.reactDashAliceDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var item: Double
  var itemsInSlide: Double
  var slide: Double
}

object EventObject {
  @scala.inline
  def apply(item: Double, itemsInSlide: Double, slide: Double): EventObject = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventObject]
  }
}

