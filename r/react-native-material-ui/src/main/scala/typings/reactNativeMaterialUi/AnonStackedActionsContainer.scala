package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStackedActionsContainer extends js.Object {
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonStackedActionsContainer {
  @scala.inline
  def apply(stackedActionsContainer: ViewStyle = null): AnonStackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (stackedActionsContainer != null) __obj.updateDynamic("stackedActionsContainer")(stackedActionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStackedActionsContainer]
  }
}

