package typings.reactHotLoader

import typings.reactHotLoader.mod.HotError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrors extends js.Object {
  var errors: js.Array[HotError]
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[HotError]): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrors]
  }
}

