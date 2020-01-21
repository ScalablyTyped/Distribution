package typings.reactImageGallery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentIndex extends js.Object {
  var currentIndex: Double
  var item: this.type
  var itemIndex: Double
}

object AnonCurrentIndex {
  @scala.inline
  def apply(currentIndex: Double, item: AnonCurrentIndex, itemIndex: Double): AnonCurrentIndex = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentIndex]
  }
}

