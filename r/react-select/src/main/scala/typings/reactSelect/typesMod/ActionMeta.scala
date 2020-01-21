package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta extends js.Object {
  var action: ActionTypes
  var name: js.UndefOr[String] = js.undefined
}

object ActionMeta {
  @scala.inline
  def apply(action: ActionTypes, name: String = null): ActionMeta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta]
  }
}

