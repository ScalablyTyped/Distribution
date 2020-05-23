package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.StackedActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogStackedActionsProps extends js.Object {
  var actions: js.Array[String]
  var style: js.UndefOr[StackedActionsContainer] = js.undefined
  def onActionPress(action: String): Unit
}

object DialogStackedActionsProps {
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit, style: StackedActionsContainer = null): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
}

