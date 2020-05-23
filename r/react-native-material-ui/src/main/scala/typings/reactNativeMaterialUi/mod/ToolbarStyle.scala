package typings.reactNativeMaterialUi.mod

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
    centerElementContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    container: js.UndefOr[Null | ViewStyle] = js.undefined,
    leftElement: js.UndefOr[Null | TextStyle] = js.undefined,
    leftElementContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    rightElement: js.UndefOr[Null | TextStyle] = js.undefined,
    rightElementContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    titleText: js.UndefOr[Null | TextStyle] = js.undefined
  ): ToolbarStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerElementContainer)) __obj.updateDynamic("centerElementContainer")(centerElementContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(leftElement)) __obj.updateDynamic("leftElement")(leftElement.asInstanceOf[js.Any])
    if (!js.isUndefined(leftElementContainer)) __obj.updateDynamic("leftElementContainer")(leftElementContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(rightElement)) __obj.updateDynamic("rightElement")(rightElement.asInstanceOf[js.Any])
    if (!js.isUndefined(rightElementContainer)) __obj.updateDynamic("rightElementContainer")(rightElementContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(titleText)) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarStyle]
  }
}

