package typings.selectorSet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[T] extends js.Object {
  var data: T
  var selector: String
}

object AnonData {
  @scala.inline
  def apply[T](data: T, selector: String): AnonData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData[T]]
  }
}

