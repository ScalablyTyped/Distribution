package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    content: js.UndefOr[Null | ViewStyle] = js.undefined
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

