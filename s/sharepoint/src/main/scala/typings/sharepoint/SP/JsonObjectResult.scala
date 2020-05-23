package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObjectResult extends js.Object {
  def get_value(): js.Any
}

object JsonObjectResult {
  @scala.inline
  def apply(get_value: () => js.Any): JsonObjectResult = {
    val __obj = js.Dynamic.literal(get_value = js.Any.fromFunction0(get_value))
    __obj.asInstanceOf[JsonObjectResult]
  }
}

