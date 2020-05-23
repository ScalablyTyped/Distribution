package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var item: js.UndefOr[ViewStyle] = js.undefined
  var label: js.UndefOr[TextStyle] = js.undefined
  var subheader: js.UndefOr[TextStyle] = js.undefined
  var value: js.UndefOr[TextStyle] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    icon: js.UndefOr[Null | ViewStyle] = js.undefined,
    item: js.UndefOr[Null | ViewStyle] = js.undefined,
    label: js.UndefOr[Null | TextStyle] = js.undefined,
    subheader: js.UndefOr[Null | TextStyle] = js.undefined,
    value: js.UndefOr[Null | TextStyle] = js.undefined
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(item)) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(subheader)) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

