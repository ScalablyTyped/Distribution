package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsContainer extends js.Object {
  var actionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object ActionsContainer {
  @scala.inline
  def apply(actionsContainer: js.UndefOr[Null | ViewStyle] = js.undefined): ActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionsContainer)) __obj.updateDynamic("actionsContainer")(actionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsContainer]
  }
}

