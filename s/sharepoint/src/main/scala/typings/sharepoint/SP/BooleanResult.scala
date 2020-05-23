package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanResult extends js.Object {
  def get_value(): Boolean
}

object BooleanResult {
  @scala.inline
  def apply(get_value: () => Boolean): BooleanResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[BooleanResult]
  }
}

