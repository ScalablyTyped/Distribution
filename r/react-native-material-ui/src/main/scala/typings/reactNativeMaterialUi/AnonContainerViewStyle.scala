package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerViewStyle extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContainerViewStyle {
  @scala.inline
  def apply(container: ViewStyle = null): AnonContainerViewStyle = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerViewStyle]
  }
}

