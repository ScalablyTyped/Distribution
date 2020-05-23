package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackedActionsContainer extends js.Object {
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object StackedActionsContainer {
  @scala.inline
  def apply(stackedActionsContainer: js.UndefOr[Null | ViewStyle] = js.undefined): StackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stackedActionsContainer)) __obj.updateDynamic("stackedActionsContainer")(stackedActionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackedActionsContainer]
  }
}

