package typings.reactNativeSnapCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T] extends js.Object {
  var index: Double
  var item: T
}

object Index {
  @scala.inline
  def apply[T](index: Double, item: T): Index[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[T]]
  }
}

