package typings.reactDashReduxDashEpic.reactDashReduxDashEpicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var `type`: String
}

object Action {
  @scala.inline
  def apply(`type`: String): Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Action]
  }
}

