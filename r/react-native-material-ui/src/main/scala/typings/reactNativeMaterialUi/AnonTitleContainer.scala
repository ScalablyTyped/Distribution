package typings.reactNativeMaterialUi

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitleContainer extends js.Object {
  var titleContainer: js.UndefOr[ViewStyle] = js.undefined
  var titleText: js.UndefOr[TextStyle] = js.undefined
}

object AnonTitleContainer {
  @scala.inline
  def apply(titleContainer: ViewStyle = null, titleText: TextStyle = null): AnonTitleContainer = {
    val __obj = js.Dynamic.literal()
    if (titleContainer != null) __obj.updateDynamic("titleContainer")(titleContainer.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitleContainer]
  }
}

