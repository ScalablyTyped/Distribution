package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultActionsContainer extends js.Object {
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}

object DefaultActionsContainer {
  @scala.inline
  def apply(defaultActionsContainer: js.UndefOr[Null | ViewStyle] = js.undefined): DefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultActionsContainer)) __obj.updateDynamic("defaultActionsContainer")(defaultActionsContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultActionsContainer]
  }
}

