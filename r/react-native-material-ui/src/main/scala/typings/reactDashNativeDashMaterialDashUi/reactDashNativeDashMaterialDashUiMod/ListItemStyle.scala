package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemStyle extends js.Object {
  var LeftElement: js.UndefOr[TextStyle] = js.undefined
  var centerElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var container: js.UndefOr[ViewStyle] = js.undefined
  var content: js.UndefOr[ViewStyle] = js.undefined
  var contentViewContainer: js.UndefOr[ViewStyle] = js.undefined
  var firstLine: js.UndefOr[TextStyle] = js.undefined
  var leftElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var primaryText: js.UndefOr[TextStyle] = js.undefined
  var primaryTextContainer: js.UndefOr[ViewStyle] = js.undefined
  var rightElement: js.UndefOr[TextStyle] = js.undefined
  var rightElementContainer: js.UndefOr[ViewStyle] = js.undefined
  var secondaryText: js.UndefOr[TextStyle] = js.undefined
  var tertiaryText: js.UndefOr[TextStyle] = js.undefined
  var textViewContainer: js.UndefOr[ViewStyle] = js.undefined
}

object ListItemStyle {
  @scala.inline
  def apply(
    LeftElement: TextStyle = null,
    centerElementContainer: ViewStyle = null,
    container: ViewStyle = null,
    content: ViewStyle = null,
    contentViewContainer: ViewStyle = null,
    firstLine: TextStyle = null,
    leftElementContainer: ViewStyle = null,
    primaryText: TextStyle = null,
    primaryTextContainer: ViewStyle = null,
    rightElement: TextStyle = null,
    rightElementContainer: ViewStyle = null,
    secondaryText: TextStyle = null,
    tertiaryText: TextStyle = null,
    textViewContainer: ViewStyle = null
  ): ListItemStyle = {
    val __obj = js.Dynamic.literal()
    if (LeftElement != null) __obj.updateDynamic("LeftElement")(LeftElement.asInstanceOf[js.Any])
    if (centerElementContainer != null) __obj.updateDynamic("centerElementContainer")(centerElementContainer.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentViewContainer != null) __obj.updateDynamic("contentViewContainer")(contentViewContainer.asInstanceOf[js.Any])
    if (firstLine != null) __obj.updateDynamic("firstLine")(firstLine.asInstanceOf[js.Any])
    if (leftElementContainer != null) __obj.updateDynamic("leftElementContainer")(leftElementContainer.asInstanceOf[js.Any])
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (primaryTextContainer != null) __obj.updateDynamic("primaryTextContainer")(primaryTextContainer.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (rightElementContainer != null) __obj.updateDynamic("rightElementContainer")(rightElementContainer.asInstanceOf[js.Any])
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText.asInstanceOf[js.Any])
    if (textViewContainer != null) __obj.updateDynamic("textViewContainer")(textViewContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemStyle]
  }
}

