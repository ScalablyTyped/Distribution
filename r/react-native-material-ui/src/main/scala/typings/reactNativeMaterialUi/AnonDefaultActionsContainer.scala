package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultActionsContainer extends js.Object {
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonDefaultActionsContainer {
  @scala.inline
  def apply(defaultActionsContainer: ViewStyle = null): AnonDefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (defaultActionsContainer != null) __obj.updateDynamic("defaultActionsContainer")(defaultActionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultActionsContainer]
  }
}

