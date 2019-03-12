package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogDefaultActionsProps extends js.Object {
  var actions: js.Array[java.lang.String]
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_DefaultActionsContainer] = js.undefined
  def onActionPress(action: java.lang.String): scala.Unit
}

object DialogDefaultActionsProps {
  @scala.inline
  def apply(
    actions: js.Array[java.lang.String],
    onActionPress: java.lang.String => scala.Unit,
    style: reactDashNativeDashMaterialDashUiLib.Anon_DefaultActionsContainer = null
  ): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions, onActionPress = js.Any.fromFunction1(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
}

