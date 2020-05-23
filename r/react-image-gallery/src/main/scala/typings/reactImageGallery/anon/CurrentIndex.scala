package typings.reactImageGallery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentIndex extends js.Object {
  var currentIndex: Double
  var item: this.type
  var itemIndex: Double
}

object CurrentIndex {
  @scala.inline
  def apply(currentIndex: Double, item: CurrentIndex, itemIndex: Double): CurrentIndex = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentIndex]
  }
}

