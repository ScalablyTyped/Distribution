package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleContainer extends js.Object {
  var titleContainer: js.UndefOr[ViewStyle] = js.undefined
  var titleText: js.UndefOr[TextStyle] = js.undefined
}

object TitleContainer {
  @scala.inline
  def apply(
    titleContainer: js.UndefOr[Null | ViewStyle] = js.undefined,
    titleText: js.UndefOr[Null | TextStyle] = js.undefined
  ): TitleContainer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(titleContainer)) __obj.updateDynamic("titleContainer")(titleContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(titleText)) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleContainer]
  }
}

