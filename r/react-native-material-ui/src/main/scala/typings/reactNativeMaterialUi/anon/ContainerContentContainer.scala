package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerContentContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}

object ContainerContentContainer {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    contentContainer: js.UndefOr[Null | ViewStyle] = js.undefined
  ): ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(contentContainer)) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerContentContainer]
  }
}

