package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNativeDashMaterialDashUi.Anon_StackedActionsContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogStackedActionsProps extends js.Object {
  var actions: js.Array[String]
  var style: js.UndefOr[Anon_StackedActionsContainer] = js.undefined
  def onActionPress(action: String): Unit
}

object DialogStackedActionsProps {
  @scala.inline
  def apply(
    actions: js.Array[String],
    onActionPress: String => Unit,
    style: Anon_StackedActionsContainer = null
  ): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions, onActionPress = js.Any.fromFunction1(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
}

