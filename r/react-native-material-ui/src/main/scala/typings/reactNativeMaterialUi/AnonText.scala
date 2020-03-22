package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var text: js.UndefOr[TextStyle] = js.undefined
}

object AnonText {
  @scala.inline
  def apply(container: ViewStyle = null, text: TextStyle = null): AnonText = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

