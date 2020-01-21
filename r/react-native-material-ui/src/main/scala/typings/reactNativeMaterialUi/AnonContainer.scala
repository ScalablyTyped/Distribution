package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[TextStyle] = js.undefined
  var positionContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(container: ViewStyle = null, icon: TextStyle = null, positionContainer: ViewStyle = null): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (positionContainer != null) __obj.updateDynamic("positionContainer")(positionContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

