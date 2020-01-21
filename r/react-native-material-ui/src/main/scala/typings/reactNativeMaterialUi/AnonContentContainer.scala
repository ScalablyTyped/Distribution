package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentContainer extends js.Object {
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}

object AnonContentContainer {
  @scala.inline
  def apply(contentContainer: ViewStyle = null): AnonContentContainer = {
    val __obj = js.Dynamic.literal()
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentContainer]
  }
}

