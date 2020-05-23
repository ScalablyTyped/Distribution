package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleResult extends js.Object {
  def get_value(): Double
}

object DoubleResult {
  @scala.inline
  def apply(get_value: () => Double): DoubleResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[DoubleResult]
  }
}

