package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarStyle extends js.Object {
  var centerElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var leftElement: js.UndefOr[TextStyle] = js.undefined
  var leftElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var rightElement: js.UndefOr[TextStyle] = js.undefined
  var rightElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var titleText: js.UndefOr[TextStyle] = js.undefined
}

object ToolbarStyle {
  @scala.inline
  def apply(
    centerElementContainer: ViewStyle = null,
    container: ViewStyle = null,
    leftElement: TextStyle = null,
    leftElementContainer: ViewStyle = null,
    rightElement: TextStyle = null,
    rightElementContainer: ViewStyle = null,
    titleText: TextStyle = null
  ): ToolbarStyle = {
    val __obj = js.Dynamic.literal()
    if (centerElementContainer != null) __obj.updateDynamic("centerElementContainer")(centerElementContainer.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (leftElement != null) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (leftElementContainer != null) __obj.updateDynamic("leftElementContainer")(leftElementContainer.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (rightElementContainer != null) __obj.updateDynamic("rightElementContainer")(rightElementContainer.asInstanceOf[js.Any])
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarStyle]
  }
}

