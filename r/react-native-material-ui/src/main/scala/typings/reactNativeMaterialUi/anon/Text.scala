package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var text: js.UndefOr[TextStyle] = js.undefined
}

object Text {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    text: js.UndefOr[Null | TextStyle] = js.undefined
  ): Text = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

