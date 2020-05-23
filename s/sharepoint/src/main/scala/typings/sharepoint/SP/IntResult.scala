package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntResult extends js.Object {
  def get_value(): Double
}

object IntResult {
  @scala.inline
  def apply(get_value: () => Double): IntResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[IntResult]
  }
}

