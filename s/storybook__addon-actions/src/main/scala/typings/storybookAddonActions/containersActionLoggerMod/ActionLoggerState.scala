package typings.storybookAddonActions.containersActionLoggerMod

import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionLoggerState extends js.Object {
  var actions: js.Array[ActionDisplay]
}

object ActionLoggerState {
  @scala.inline
  def apply(actions: js.Array[ActionDisplay]): ActionLoggerState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionLoggerState]
  }
}

