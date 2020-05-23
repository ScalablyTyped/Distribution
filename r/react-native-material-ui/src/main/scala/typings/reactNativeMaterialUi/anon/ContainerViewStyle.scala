package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerViewStyle extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
}

object ContainerViewStyle {
  @scala.inline
  def apply(container: js.UndefOr[Null | ViewStyle] = js.undefined): ContainerViewStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerViewStyle]
  }
}

