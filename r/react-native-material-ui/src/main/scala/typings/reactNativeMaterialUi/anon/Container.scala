package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[TextStyle] = js.undefined
  var positionContainer: js.UndefOr[ViewStyle] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    icon: js.UndefOr[Null | TextStyle] = js.undefined,
    positionContainer: js.UndefOr[Null | ViewStyle] = js.undefined
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(positionContainer)) __obj.updateDynamic("positionContainer")(positionContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

