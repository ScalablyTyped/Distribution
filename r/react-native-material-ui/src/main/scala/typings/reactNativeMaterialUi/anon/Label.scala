package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var label: js.UndefOr[TextStyle] = js.undefined
}

object Label {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    icon: js.UndefOr[Null | ViewStyle] = js.undefined,
    label: js.UndefOr[Null | TextStyle] = js.undefined
  ): Label = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

