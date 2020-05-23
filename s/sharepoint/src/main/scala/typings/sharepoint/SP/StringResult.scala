package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringResult extends js.Object {
  def get_value(): String
}

object StringResult {
  @scala.inline
  def apply(get_value: () => String): StringResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[StringResult]
  }
}

