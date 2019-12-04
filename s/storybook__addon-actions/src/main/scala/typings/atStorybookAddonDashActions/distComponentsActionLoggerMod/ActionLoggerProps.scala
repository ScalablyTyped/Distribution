package typings.atStorybookAddonDashActions.distComponentsActionLoggerMod

import typings.atStorybookAddonDashActions.distModelsActionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionLoggerProps extends js.Object {
  var actions: js.Array[ActionDisplay]
  def onClear(): Unit
}

object ActionLoggerProps {
  @scala.inline
  def apply(actions: js.Array[ActionDisplay], onClear: () => Unit): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = js.Any.fromFunction0(onClear))
  
    __obj.asInstanceOf[ActionLoggerProps]
  }
}

