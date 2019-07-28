package typings.reactDashNativeDashMaterialDashUi

import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.TextStyle
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleContainer extends js.Object {
  var titleContainer: js.UndefOr[ViewStyle] = js.undefined
  var titleText: js.UndefOr[TextStyle] = js.undefined
}

object Anon_TitleContainer {
  @scala.inline
  def apply(titleContainer: ViewStyle = null, titleText: TextStyle = null): Anon_TitleContainer = {
    val __obj = js.Dynamic.literal()
    if (titleContainer != null) __obj.updateDynamic("titleContainer")(titleContainer.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TitleContainer]
  }
}

