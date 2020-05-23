package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Active extends js.Object {
  var active: js.UndefOr[TextStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var disabled: js.UndefOr[TextStyle] = js.undefined
}

object Active {
  @scala.inline
  def apply(
    active: js.UndefOr[Null | TextStyle] = js.undefined,
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    disabled: js.UndefOr[Null | TextStyle] = js.undefined
  ): Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
}

