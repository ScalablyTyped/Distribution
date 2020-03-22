package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(container: ViewStyle = null, content: ViewStyle = null): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

