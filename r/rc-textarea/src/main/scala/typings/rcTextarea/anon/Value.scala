package typings.rcTextarea.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var value: String | Double | js.Array[String]
}

object Value {
  @scala.inline
  def apply(value: String | Double | js.Array[String]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

