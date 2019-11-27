package typings.reactDashSelect.srcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta extends js.Object {
  var action: ActionTypes
}

object ActionMeta {
  @scala.inline
  def apply(action: ActionTypes): ActionMeta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionMeta]
  }
}

