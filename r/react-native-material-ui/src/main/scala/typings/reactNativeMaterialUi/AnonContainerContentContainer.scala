package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerContentContainer extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContainerContentContainer {
  @scala.inline
  def apply(container: ViewStyle = null, contentContainer: ViewStyle = null): AnonContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerContentContainer]
  }
}

