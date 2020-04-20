package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputActionMeta extends js.Object {
  var action: InputActionTypes
}

object InputActionMeta {
  @scala.inline
  def apply(action: InputActionTypes): InputActionMeta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputActionMeta]
  }
}

