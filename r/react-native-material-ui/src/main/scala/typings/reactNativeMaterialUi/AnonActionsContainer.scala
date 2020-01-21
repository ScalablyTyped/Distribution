package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionsContainer extends js.Object {
  var actionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonActionsContainer {
  @scala.inline
  def apply(actionsContainer: ViewStyle = null): AnonActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (actionsContainer != null) __obj.updateDynamic("actionsContainer")(actionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionsContainer]
  }
}

