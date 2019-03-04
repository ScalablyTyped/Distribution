package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogStackedActionsProps extends js.Object {
  var actions: js.Array[java.lang.String]
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_StackedActionsContainer] = js.undefined
  def onActionPress(action: java.lang.String): scala.Unit
}

object DialogStackedActionsProps {
  @scala.inline
  def apply(
    actions: js.Array[java.lang.String],
    onActionPress: js.Function1[java.lang.String, scala.Unit],
    style: reactDashNativeDashMaterialDashUiLib.Anon_StackedActionsContainer = null
  ): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions, onActionPress = onActionPress)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
}

