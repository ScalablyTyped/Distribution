package typings.reactNativeSnapCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[T] extends js.Object {
  var index: Double
  var item: T
}

object AnonIndex {
  @scala.inline
  def apply[T](index: Double, item: T): AnonIndex[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex[T]]
  }
}

